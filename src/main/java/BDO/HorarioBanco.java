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

    public List<String> consultarHorariosDisponiveisFuncionario(String dataSelecionada, int idFuncionario, Servico servico){
        List<Horario> horariosMarcados = retornaHorariosMarcadosFuncionario(idFuncionario);
        List<String> horariosDisponiveis = new ArrayList<>();
        for(int horas = 7; horas < 18; horas++){
            for (int minutos = 0; minutos < 60; minutos += 15){
                String horarioFormatado = String.format("%02d:%02d", horas, minutos);
                horariosDisponiveis.add(horarioFormatado);
            }
        }

        for(Horario horarioMarcado : horariosMarcados){
            if(horarioMarcado.getData().equals(dataSelecionada)){
                String horarioInicio = horarioMarcado.getHorarioInicio();
                int duracaoMarcada = horarioMarcado.getServico().getDuracao() * 15;

                int horasInicio = Integer.parseInt(horarioInicio.split(":")[0]);
                int minutosInicio = Integer.parseInt(horarioInicio.split(":")[1]);

               
                for(int i = 0; i < duracaoMarcada; i += 15){
                    String horarioOcupado = String.format("%02d:%02d", horasInicio, minutosInicio);
                    horariosDisponiveis.remove(horarioOcupado);
                    minutosInicio += 15;

                    if(minutosInicio == 60){
                        minutosInicio = 0;
                        horasInicio++;
                    }
                }
            }
        }

        int duracaoServico = servico.getDuracao() * 15; 

        List<String> horariosValidos = new ArrayList<>();
        for(int i = 0; i < horariosDisponiveis.size(); i++){
            boolean disponivel = true;
            for(int j = 0; j < duracaoServico / 15; j++){
                int indice = i + j;
                if(indice >= horariosDisponiveis.size() || !horariosDisponiveis.contains(horariosDisponiveis.get(indice))){
                    disponivel = false;
                    break;
                }
            }
            if(disponivel){
                horariosValidos.add(horariosDisponiveis.get(i));
            }
        }

        return horariosValidos;
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
        List<Horario> horarios = retornaHorarios(); 
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
    
    public boolean removeHorarioPorID(int id){
        List<Horario> horariosAtualizados = new ArrayList<>();
        List<Horario> horarios = retornaHorarios();

        boolean horarioRemovido = false;

        if(horarios == null || horarios.isEmpty()){
            return false;
        }

        for(Horario horario : horarios){
            if (horario.getId() != id) {
                horariosAtualizados.add(horario);
            } else {
                horarioRemovido = true;
            }
        }

        if (horarioRemovido){
            try(PrintWriter pw = new PrintWriter(new FileWriter(path))) {
                pw.println("id,servicoId,data,horaInicio,funcionarioId,clienteId,marcado");
                for(Horario horario : horariosAtualizados){
                    pw.println(horario.getId() + "," + 
                               horario.getServico().getId() + "," + 
                               horario.getData() + "," + 
                               horario.getHorarioInicio() + "," + 
                               horario.getFuncionario().getId() + "," + 
                               horario.getCliente().getId() + "," + 
                               horario.isMarcado());
                }
            }catch(IOException e){
                System.out.println("Erro ao remover o horário: " + e.getMessage());
                return false;
            }
        }
        return horarioRemovido;
    }
    
    public boolean marcarHorario(int id) {
        List<Horario> horarios = retornaHorarios();
        boolean horarioMarcado = false;

        if(horarios == null || horarios.isEmpty()){
            return false;
        }

        for(Horario horario : horarios){
            if(horario.getId() == id && !horario.isMarcado()){
                horario.setMarcado(true);
                horarioMarcado = true;
                break;
            }
        }
        if(horarioMarcado){
            try(PrintWriter pw = new PrintWriter(new FileWriter(path))){
                pw.println("id,servicoId,data,horaInicio,funcionarioId,clienteId,marcado");
                for(Horario horario : horarios){
                    pw.println(horario.getId() + "," + 
                               horario.getServico().getId() + "," + 
                               horario.getData() + "," + 
                               horario.getHorarioInicio() + "," + 
                               horario.getFuncionario().getId() + "," + 
                               horario.getCliente().getId() + "," + 
                               horario.isMarcado());
                }
            } catch(IOException e){
                System.out.println("Erro ao atualizar o horário: " + e.getMessage());
                return false;
            }
        }

        return horarioMarcado;
    }
    
    
    public boolean verificaHorarioPorId(int id){
        List<Horario> horarios = retornaHorarios(); 
        if (horarios == null || horarios.isEmpty()){
            return false;
        }
        for (Horario horario : horarios){
            if (horario.getCliente().getId() == id){
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
        try(PrintWriter pw = new PrintWriter(new FileWriter(path, true))){
            pw.println(novoId + "," + 
                       servico.getId() + "," + 
                       data + "," + 
                       horaInicio + "," + 
                       funcionario.getId() + "," + 
                       cliente.getId() + "," + 
                       marcado);
        }catch (IOException e){
            System.out.println("Erro ao adicionar o horário: " + e.getMessage());
            return false;
        }
        return true;
    }
}
