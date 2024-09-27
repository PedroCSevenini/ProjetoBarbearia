package BDO;

import Model.Cliente;
import Model.Funcionario;
import Model.Horario;
import Model.Servico;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pedro
 */
public class HorarioBanco {

    private static final File path = new File(System.getProperty("user.dir") + "/src/main/java/BDO/Arquivo/Horario.txt");

    public static List retornaHorarios() {
        List<Horario> horarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();
            if (line == null) {
                return horarios;
            }
            while (line != null) {
                String[] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                ServicoBanco bancoServico = new ServicoBanco();
                Servico servico = bancoServico.procuraServicoPorID(Integer.parseInt(vet[1]));
                String data = vet[2];
                String horaInicio = vet[3];
                PessoaBanco banco = new PessoaBanco();
                Funcionario funcionario = banco.procuraFuncionarioPorID(Integer.parseInt(vet[4]));
                Cliente cliente = PessoaBanco.procuraClientePorID(Integer.parseInt(vet[5]));
                boolean marcado = Boolean.parseBoolean(vet[6]);

                horarios.add(new Horario(id, servico, data, horaInicio, funcionario, cliente, marcado));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return horarios;
    }

    public static Horario retornaHorarioDoCliente(Cliente cliente) {
        List<Horario> horarios = retornaHorarios();
        if (horarios == null || horarios.isEmpty()) {
            return null;
        }
        for (Horario horario : horarios) {

            if (horario.getCliente().equals(cliente)) {
                return horario;
            }
        }
        return null;
    }

    public List<String> consultarHorariosDisponiveisFuncionario(String dataSelecionada, int idFuncionario, Servico servico) {
        List<Horario> horariosMarcados = retornaHorariosMarcadosFuncionario(idFuncionario);
        List<String> horariosDisponiveis = new ArrayList<>();

        // Adiciona horários disponíveis das 07:00 às 18:00 em intervalos de 15 minutos
        for (int horas = 7; horas < 18; horas++) {
            for (int minutos = 0; minutos < 60; minutos += 15) {
                String horarioFormatado = String.format("%02d:%02d", horas, minutos);
                horariosDisponiveis.add(horarioFormatado);
            }
        }

        // Remove os horários ocupados
        for (Horario horarioMarcado : horariosMarcados) {
            if (horarioMarcado.getData().equals(dataSelecionada)) {
                String horarioInicio = horarioMarcado.getHorarioInicio();
                int duracaoMarcada = horarioMarcado.getServico().getDuracao() * 15; // em minutos

                int horasInicio = Integer.parseInt(horarioInicio.split(":")[0]);
                int minutosInicio = Integer.parseInt(horarioInicio.split(":")[1]);
                int minutosFim = minutosInicio + duracaoMarcada;

                // Ajustar horas se os minutos estourarem
                int horasFim = horasInicio;
                while (minutosFim >= 60) {
                    minutosFim -= 60;
                    horasFim++;
                }

                // Remover horários que colidem
                for (int i = horasInicio; i <= horasFim; i++) {
                    for (int j = (i == horasInicio ? minutosInicio : 0); j < (i == horasFim ? minutosFim : 60); j += 15) {
                        String horarioOcupado = String.format("%02d:%02d", i, j);
                        horariosDisponiveis.remove(horarioOcupado);
                        System.out.println("Removido: " + horarioOcupado); // Debug: horário removido
                    }
                }
            }
        }

        // Exibir horários disponíveis após a remoção
        System.out.println("Horários Disponíveis:");
        for (String horario : horariosDisponiveis) {
            System.out.println(horario);
        }

        // Verifica horários válidos para o novo serviço
        int duracaoServico = servico.getDuracao() * 15; // duração em minutos
        List<String> horariosValidos = new ArrayList<>();
        for (String horario : horariosDisponiveis) {
            int horasNovoServico = Integer.parseInt(horario.split(":")[0]);
            int minutosNovoServico = Integer.parseInt(horario.split(":")[1]);

            int horasFimNovoServico = horasNovoServico;
            int minutosFimNovoServico = minutosNovoServico + duracaoServico - 15;

            // Ajustar horas se os minutos estourarem
            while (minutosFimNovoServico >= 60) {
                minutosFimNovoServico -= 60;
                horasFimNovoServico++;
            }

            // Verifique se o novo serviço colide com horários ocupados
            boolean disponivel = true;
            for (Horario horarioMarcado : horariosMarcados) {
                if (horarioMarcado.getData().equals(dataSelecionada)) {
                    String horarioInicioMarcado = horarioMarcado.getHorarioInicio();
                    int duracaoMarcada = horarioMarcado.getServico().getDuracao() * 15;

                    int horasInicioMarcado = Integer.parseInt(horarioInicioMarcado.split(":")[0]);
                    int minutosInicioMarcado = Integer.parseInt(horarioInicioMarcado.split(":")[1]);
                    int minutosFimMarcado = minutosInicioMarcado + duracaoMarcada - 15;

                    // Ajustar horas se os minutos estourarem
                    int horasFimMarcado = horasInicioMarcado;
                    while (minutosFimMarcado >= 60) {
                        minutosFimMarcado -= 60;
                        horasFimMarcado++;
                    }

                    // Checar se os horários colidem
                    // O novo serviço pode começar se terminar exatamente no horário de início de um serviço marcado
                    if (!((horasFimNovoServico < horasInicioMarcado) || (horasNovoServico >= horasFimMarcado))) {
                        disponivel = false;
                        break;
                    }
                }
            }

            // Adicionar apenas se o horário estiver disponível
            if (disponivel) {
                horariosValidos.add(horario);
            }
        }

        return horariosValidos;
    }

    public List retornaHorariosMarcadosFuncionario(int idFuncionario) {
        List<Horario> todosHorarios = retornaHorarios();
        if (todosHorarios.isEmpty()) {
            return new ArrayList<>();
        }
        List<Horario> horariosMarcados = new ArrayList<>();
        for (Horario horarioGeral : todosHorarios) {
            if (horarioGeral.getFuncionario().getId() == idFuncionario) {//Alterado para os horários na pendência não conseguirem serem marcados duas vezes
                horariosMarcados.add(horarioGeral);
            }
        }
        return horariosMarcados;

    }

    public List retornaHorariosPendentesFuncionario(int idFuncionario) {
        List<Horario> todosHorarios = retornaHorarios();

        if (todosHorarios.isEmpty()) {
            return new ArrayList<>();
        }
        List<Horario> horariosMarcados = new ArrayList<>();
        for (Horario horarioGeral : todosHorarios) {
            if (horarioGeral.getFuncionario().getId() == idFuncionario && !horarioGeral.isMarcado()) {
                horariosMarcados.add(horarioGeral);
            }
        }
        return horariosMarcados;

    }

    public Horario retornaHorarioPorID(int id) {
        List<Horario> horarios = retornaHorarios();
        if (horarios == null || horarios.isEmpty()) {
            return null;
        }
        for (Horario horario : horarios) {
            if (horario.getId() == id) {
                return horario;
            }
        }
        return null;
    }

    public boolean removeHorarioPorID(int id) {
        List<Horario> horariosAtualizados = new ArrayList<>();
        List<Horario> horarios = retornaHorarios();

        boolean horarioRemovido = false;

        if (horarios == null || horarios.isEmpty()) {
            return false;
        }

        for (Horario horario : horarios) {
            if (horario.getId() != id) {
                horariosAtualizados.add(horario);
            } else {
                horarioRemovido = true;
            }
        }

        if (horarioRemovido) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
                pw.println("id,servicoId,data,horaInicio,funcionarioId,clienteId,marcado");
                for (Horario horario : horariosAtualizados) {
                    pw.println(horario.getId() + ","
                            + horario.getServico().getId() + ","
                            + horario.getData() + ","
                            + horario.getHorarioInicio() + ","
                            + horario.getFuncionario().getId() + ","
                            + horario.getCliente().getId() + ","
                            + horario.isMarcado());
                }
            } catch (IOException e) {
                System.out.println("Erro ao remover o horário: " + e.getMessage());
                return false;
            }
        }
        return horarioRemovido;
    }

    public boolean marcarHorario(int id) {
        List<Horario> horarios = retornaHorarios();
        boolean horarioMarcado = false;

        if (horarios == null || horarios.isEmpty()) {
            return false;
        }

        for (Horario horario : horarios) {
            if (horario.getId() == id && !horario.isMarcado()) {
                horario.setMarcado(true);
                horarioMarcado = true;
                break;
            }
        }
        if (horarioMarcado) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
                pw.println("id,servicoId,data,horaInicio,funcionarioId,clienteId,marcado");
                for (Horario horario : horarios) {
                    pw.println(horario.getId() + ","
                            + horario.getServico().getId() + ","
                            + horario.getData() + ","
                            + horario.getHorarioInicio() + ","
                            + horario.getFuncionario().getId() + ","
                            + horario.getCliente().getId() + ","
                            + horario.isMarcado());
                }
            } catch (IOException e) {
                System.out.println("Erro ao atualizar o horário: " + e.getMessage());
                return false;
            }
        }

        return horarioMarcado;
    }

    public boolean verificaHorarioPorId(int id) {
        List<Horario> horarios = retornaHorarios();
        if (horarios == null || horarios.isEmpty()) {
            return false;
        }
        for (Horario horario : horarios) {
            if (horario.getCliente().getId() == id) {
                return true;
            }
        }
        return false;
    }

    public int retornaProximoID() {
        List<Horario> horarios = retornaHorarios();
        if (horarios == null || horarios.isEmpty()) {
            return 1;
        }

        Horario ultimoHorario = null;
        for (int i = 0; i < horarios.size(); i++) {
            ultimoHorario = horarios.get(i);
        }

        return (ultimoHorario == null ? 1 : ultimoHorario.getId() + 1);
    }

    public boolean adicionarHorario(Servico servico, String data, String horaInicio, Funcionario funcionario, Cliente cliente, boolean marcado) {
        int novoId = retornaProximoID();
        try (PrintWriter pw = new PrintWriter(new FileWriter(path, true))) {
            pw.println(novoId + ","
                    + servico.getId() + ","
                    + data + ","
                    + horaInicio + ","
                    + funcionario.getId() + ","
                    + cliente.getId() + ","
                    + marcado);
        } catch (IOException e) {
            System.out.println("Erro ao adicionar o horário: " + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean editarHorario(int idHorario, Servico servico, String data, String horario) {
        List<Horario> horarios = retornaHorarios();

        boolean horarioEditado = false;
        if (horarios == null || horarios.isEmpty()) {
            return false;
        }

        for (Horario h : horarios) {
            if (h.getId() == idHorario) {
                h.setServico(servico);
                h.setData(data);
                h.setHorarioInicio(horario);
                horarioEditado = true;
                break;
            }
        }

        if (horarioEditado) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
                pw.println("id,servicoId,data,horaInicio,funcionarioId,clienteId,marcado");
                for (Horario h : horarios) {
                    pw.println(h.getId() + ","
                            + h.getServico().getId() + ","
                            + h.getData() + ","
                            + h.getHorarioInicio() + ","
                            + h.getFuncionario().getId() + ","
                            + h.getCliente().getId() + ","
                            + h.isMarcado());
                }
                return true;
            } catch (IOException e) {
                System.out.println("Erro ao editar o horário: " + e.getMessage());
                return false;
            }
        }
        return false;
    }

    public boolean removerHorariosPassados() {
        List<Horario> horarios = retornaHorarios();
        List<Horario> horariosAtualizados = new ArrayList<>();
        boolean houveRemocao = false;

        Date agora = new Date();
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");

        for (Horario horario : horarios) {
            try {
                String dataHorarioCompleto = horario.getData() + " " + horario.getHorarioInicio();
                SimpleDateFormat formatoCompleto = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                Date dataHorario = formatoCompleto.parse(dataHorarioCompleto);

                if (dataHorario.after(agora)) {
                    horariosAtualizados.add(horario);
                } else {
                    houveRemocao = true;
                }
            } catch (ParseException e) {
                System.out.println("Erro ao converter a data ou horário: " + e.getMessage());
            }
        }

        if (houveRemocao) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
                pw.println("id,servicoId,data,horaInicio,funcionarioId,clienteId,marcado");
                for (Horario horario : horariosAtualizados) {
                    pw.println(horario.getId() + ","
                            + horario.getServico().getId() + ","
                            + horario.getData() + ","
                            + horario.getHorarioInicio() + ","
                            + horario.getFuncionario().getId() + ","
                            + horario.getCliente().getId() + ","
                            + horario.isMarcado());
                }
            } catch (IOException e) {
                System.out.println("Erro ao atualizar o banco de horários: " + e.getMessage());
                return false;
            }
        }

        return houveRemocao;
    }
}
