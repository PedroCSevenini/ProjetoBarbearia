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

    private List<String> consultarHorariosDisponiveisFuncionario(String dataSelecionada, int idFuncionario) {
        List<Horario> horariosMarcados = retornaHorariosMarcadosFuncionario(idFuncionario);
        List<String> horariosDisponiveis = new ArrayList<>();

       
        for (int horas = 7; horas <= 18; horas++) {
            for (int minutos = 0; minutos < 60; minutos += 15) {
                String horarioFormatado = String.format("%02d:%02d", horas, minutos);
                horariosDisponiveis.add(horarioFormatado);
            }
        }

        
        for (Horario horarioMarcado : horariosMarcados) {
            if (horarioMarcado.getData().equals(dataSelecionada)) {
                String horarioInicio = horarioMarcado.getHoraInicio(); 
                int duracao = horarioMarcado.getServico().getDuracao();
                int horasInicio = Integer.parseInt(horarioInicio.split(":")[0]);
                int minutosInicio = Integer.parseInt(horarioInicio.split(":")[1]);             
                for (int i = 0; i < duracao; i++) {                   
                    String horarioOcupado = String.format("%02d:%02d", horasInicio, minutosInicio);
                    horariosDisponiveis.remove(horarioOcupado); 
                    minutosInicio += 15;
                    if (minutosInicio == 60) {
                        minutosInicio = 0;
                        horasInicio++;
                    }
                }
            }
        }

        return horariosDisponiveis;
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
}
