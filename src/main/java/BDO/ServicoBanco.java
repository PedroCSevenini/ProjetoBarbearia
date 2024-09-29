package BDO;

import Model.Cliente;
import Model.Funcionario;
import Model.Pessoa;
import Model.Servico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ServicoBanco {

    private static final File path = new File(System.getProperty("user.dir") + "/src/main/java/BDO/Arquivo/Servico.txt");

    public List retornaServicos() {
        List<Servico> servicos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();
            if (line == null) {
                return servicos;
            }
            while (line != null) {
                String[] vet = line.split(";");
                int id = Integer.parseInt(vet[0]);
                String nome = vet[1];
                String preco = vet[2];
                int duracao = Integer.parseInt(vet[3]);
                servicos.add(new Servico(id, nome, preco, duracao));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return servicos;
    }

    public Servico procuraServicoPorID(int id) {
        List<Servico> servicos = retornaServicos();
        if (servicos == null || servicos.isEmpty()) {
            return null;
        }
        for (Servico servico : servicos) {
            if (servico.getId() == id) {
                return servico;
            }
        }
        return null;
    }

    public boolean editarServico(int idServico, String nome, String valor) {
        List<Servico> servicos = retornaServicos();

        boolean servicoEditado = false;
        if (servicos == null || servicos.isEmpty()) {
            return false;
        }

        for (Servico s : servicos) {
            if (s.getId() == idServico) {
                s.setNome(nome);
                s.setPreco(valor);
                servicoEditado = true;
                break;
            }
        }

        if (servicoEditado) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
                pw.println("id;nome;valor;duracao");
                for (Servico s : servicos) {
                    pw.println(s.getId() + ";"
                            + s.getNome() + ";"
                            + s.getPreco() + ";"
                            + s.getDuracao());
                }
                return true;
            } catch (IOException e) {
                System.out.println("Erro ao editar o serviço: " + e.getMessage());
                return false;
            }
        }
        return false;
    }

    public boolean removerServicoPorID(int idServico) {
        List<Servico> servicosAtualizados = new ArrayList<>();
        List<Servico> servicos = retornaServicos();

        HorarioBanco horarioBanco = new HorarioBanco();
        horarioBanco.removerHorariosPorServicoId(idServico);
        boolean servicoRemovido = false;

        if (servicos == null || servicos.isEmpty()) {
            return false;
        }

        // Itera sobre os serviços e remove o que tem o id correspondente
        for (Servico servico : servicos) {
            if (servico.getId() != idServico) {
                servicosAtualizados.add(servico); // Adiciona apenas os que não estão relacionados ao idServico
            } else {
                servicoRemovido = true; // Indica que o serviço foi encontrado e será removido
            }
        }

        // Se o serviço foi removido, atualiza o arquivo e remove os horários correspondentes
        if (servicoRemovido) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
                pw.println("id;nome;valor;duracao");
                for (Servico servico : servicosAtualizados) {
                    pw.println(servico.getId() + ";"
                            + servico.getNome() + ";"
                            + servico.getPreco() + ";"
                            + servico.getDuracao());
                }

                // Chama a função que remove os horários associados a este serviço
                return true;

            } catch (IOException e) {
                System.out.println("Erro ao remover o serviço: " + e.getMessage());
                return false;
            }
        }

        return false; // Retorna falso se o serviço não foi encontrado
    }

    public int retornaProximoID() {
        List<Servico> servicos = retornaServicos();

        if (servicos == null || servicos.isEmpty()) {
            return 1; // Retorna 1 se não houver nenhum serviço ainda
        }

        // Encontra o maior ID existente
        int maiorID = 0;
        for (Servico servico : servicos) {
            if (servico.getId() > maiorID) {
                maiorID = servico.getId();
            }
        }

        // O próximo ID será o maior ID + 1
        return maiorID + 1;
    }

    public boolean adicionarServico(String nome, String preco, int duracao) {
        // Obtém o próximo ID disponível para o novo serviço
        int novoId = retornaProximoID();

        // Cria uma nova instância de Servico
        Servico novoServico = new Servico(novoId, nome, preco, duracao);

        try (PrintWriter pw = new PrintWriter(new FileWriter(path, true))) { // Usando "true" para adicionar ao final do arquivo
            pw.println(novoServico.getId() + ";"
                    + novoServico.getNome() + ";"
                    + novoServico.getPreco() + ";"
                    + novoServico.getDuracao());
            return true; // Retorna verdadeiro se o serviço foi adicionado com sucesso
        } catch (IOException e) {
            System.out.println("Erro ao adicionar o serviço: " + e.getMessage());
            return false; // Retorna falso em caso de erro
        }
    }
}
