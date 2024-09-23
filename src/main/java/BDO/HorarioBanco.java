package BDO;

import Model.Cliente;
import Model.Funcionario;
import Model.Horario;
import Model.Pessoa;
import Model.Servico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.PrintWriter;

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

    private List<String> consultarHorariosDisponiveisFuncionario(String dataSelecionada, int idFuncionario, Servico servico) {
        // Retorna todos os horários marcados do funcionário
        List<Horario> horariosMarcados = retornaHorariosMarcadosFuncionario(idFuncionario);

        // Lista de horários disponíveis
        List<String> horariosDisponiveis = new ArrayList<>();

        // Gera os horários de 7:00 até 18:00 em intervalos de 15 minutos
        for (int horas = 7; horas < 18; horas++) {
            for (int minutos = 0; minutos < 60; minutos += 15) {
                String horarioFormatado = String.format("%02d:%02d", horas, minutos);
                horariosDisponiveis.add(horarioFormatado);
            }
        }

        // Remove os horários ocupados
        for (Horario horarioMarcado : horariosMarcados) {
            if (horarioMarcado.getData().equals(dataSelecionada)) {
                String horarioInicio = horarioMarcado.getHorarioInicio(); // Hora de início do serviço
                int duracaoMarcada = horarioMarcado.getServico().getDuracao() * 15; // Duração em minutos

                int horasInicio = Integer.parseInt(horarioInicio.split(":")[0]);
                int minutosInicio = Integer.parseInt(horarioInicio.split(":")[1]);

                // Remover os horários ocupados pelo serviço
                for (int i = 0; i < duracaoMarcada; i += 15) {
                    String horarioOcupado = String.format("%02d:%02d", horasInicio, minutosInicio);
                    horariosDisponiveis.remove(horarioOcupado); // Remove o horário ocupado
                    minutosInicio += 15;

                    if (minutosInicio == 60) {
                        minutosInicio = 0;
                        horasInicio++; // Avança a hora quando os minutos chegam a 60
                    }
                }
            }
        }

        // Duração do serviço a ser marcado (multiplicado por 15 para converter para minutos)
        int duracaoServico = servico.getDuracao() * 15; // Exemplo: 2 * 15 = 30 minutos

        // Verificar se há intervalos consecutivos disponíveis para a duração do serviço
        List<String> horariosValidos = new ArrayList<>();
        for (int i = 0; i < horariosDisponiveis.size(); i++) {
            boolean disponivel = true;
            for (int j = 0; j < duracaoServico / 15; j++) {
                int indice = i + j;
                if (indice >= horariosDisponiveis.size()) {
                    disponivel = false;
                    break;
                }
            }
            if (disponivel) {
                horariosValidos.add(horariosDisponiveis.get(i));
            }
        }

        return horariosValidos; // Retorna os horários ainda disponíveis que suportam a duração do serviço
    }

    private void adicionarHorarioIndisponivel(String dataSelecionada, String horarioInicio, Servico servico, Funcionario funcionario, Cliente cliente) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(path, true))) {
            // Escreve a data, horário e outros dados no arquivo CSV, separados por vírgula
            pw.println(dataSelecionada + "," + horarioInicio + "," + servico.getId() + "," + funcionario.getId() + "," + cliente.getId());
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public List retornaHorariosMarcadosFuncionario(int idFuncionario){
        List <Horario> todosHorarios = retornaHorarios();
        if(todosHorarios.isEmpty()){
            return new ArrayList<>();
        }
        List <Horario> horariosMarcados = new ArrayList<>();
        for(Horario horarioGeral: todosHorarios){
            if(horarioGeral.getFuncionario().getId() == idFuncionario && horarioGeral.isMarcado()){
                horariosMarcados.add(horarioGeral);
            }
        }
        return horariosMarcados;
        
        
    }
    
    public List retornaHorariosPendentesFuncionario(int idFuncionario){
        List <Horario> todosHorarios = retornaHorarios();
        
        if(todosHorarios.isEmpty()){
            return new ArrayList<>();
        }
        List <Horario> horariosMarcados = new ArrayList<>();
        for(Horario horarioGeral: todosHorarios){
            if(horarioGeral.getFuncionario().getId() == idFuncionario && !horarioGeral.isMarcado()){
                horariosMarcados.add(horarioGeral);
            }
        }
        return horariosMarcados;
        
        
    }
    
    public Horario retornaHorarioPorID(int id){
        List<Horario> horarios = retornaHorarios(); // Obtém a lista de horários
        if (horarios == null || horarios.isEmpty()){
            return null;
        }
        for (Horario horario : horarios){
            if (horario.getId() == id){
                return horario;
            }
        }
        return null; 
    }
}
