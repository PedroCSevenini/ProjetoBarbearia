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

    private static final File arquivoCSV = new File(System.getProperty("user.dir") + "/src/main/java/BDO/Arquivo/horarios_indisponiveis.csv");

    public static List retornaHorarios() {
        List<Horario> horarios = new ArrayList<>();
        String path = null;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();
            if (line == null) {
                return null;
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

                horarios.add(new Horario(id, servico, data, horaInicio, funcionario, cliente));
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

    private List<String> consultarHorariosIndisponiveis(String dataSelecionada) {
        List<String> horariosIndisponiveis = new ArrayList<>();
        String linha;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");  // Supondo que o CSV esteja separado por vírgulas
                String data = dados[0];  // Primeira coluna é a data
                String horarioInicio = dados[1];  // Segunda coluna é o horário

                // Se a data no arquivo CSV for igual à data selecionada, adiciona o horário à lista
                if (data.equals(dataSelecionada)) {
                    horariosIndisponiveis.add(horarioInicio);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return horariosIndisponiveis;
    }

    private void adicionarHorarioIndisponivel(String dataSelecionada, String horarioInicio, Servico servico, Funcionario funcionario, Cliente cliente) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(arquivoCSV, true))) {
            // Escreve a data, horário e outros dados no arquivo CSV, separados por vírgula
            pw.println(dataSelecionada + "," + horarioInicio + "," + servico.getId() + "," + funcionario.getId() + "," + cliente.getId());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
