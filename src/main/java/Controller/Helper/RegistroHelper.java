package Controller.Helper;

import BDO.PessoaBanco;
import BDO.UsuarioBanco;
import Exception.EmailExistenteException;
import Exception.RegistroException;
import Exception.TelefoneExistenteException;
import Exception.UsuarioExistenteException;
import Model.Cliente;
import View.ViewRegistro;

public class RegistroHelper {

    private final ViewRegistro view;
    private final PessoaBanco bancoPessoa;
    private final UsuarioBanco bancoUsuario;

    public RegistroHelper(ViewRegistro view) {
        this.view = view;
        this.bancoPessoa = new PessoaBanco();
        this.bancoUsuario = new UsuarioBanco();
    }

    public boolean verificaCamposObrigatorios() {
        String nome = view.getjTextFieldNome().getText();
        String telefone = view.getjTextFieldTelefone().getText();
        String email = view.getjTextFieldEmail().getText();
        String dataNasc = view.getjTextFieldDataNasc().getText();
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = new String(view.getjPasswordFieldSenha().getPassword());

        // Verifica campo Nome
        if (nome.isEmpty()) {
            view.getjLabelAviso().setText("Campo obrigatório faltando: Nome");
            return false;
        }
        String regexNome = "^[A-Za-zÀ-ÖØ-ÿ]+(?: [A-Za-zÀ-ÖØ-ÿ]+)*$";
        if (!nome.matches(regexNome)) {
            view.getjLabelAviso().setText("Nome inválido");
            return false;
        }

        // Verifica campo Telefone
        if (telefone.isEmpty()) {
            view.getjLabelAviso().setText("Campo obrigatório faltando: Telefone");
            return false;
        }
        String regexTelefone = "^\\d{10,11}$"; // 10 ou 11 dígitos
        if (!telefone.matches(regexTelefone)) {
            view.getjLabelAviso().setText("Telefone inválido (Somente números)");
            return false;
        }

        // Verifica campo Email
        if (email.isEmpty()) {
            view.getjLabelAviso().setText("Campo obrigatório faltando: Email");
            return false;
        }
        String regexEmail = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        if (!email.matches(regexEmail)) {
            view.getjLabelAviso().setText("Email inválido");
            return false;
        }

        // Verifica campo Data de Nascimento
        if (dataNasc.isEmpty()) {
            view.getjLabelAviso().setText("Campo obrigatório faltando: Data de nascimento");
            return false;
        }
        String regexDataNasc = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if (!dataNasc.matches(regexDataNasc)) {
            view.getjLabelAviso().setText("Data de nascimento inválida (Formato: XX/XX/XXXX)");
            return false;
        }

        // Verifica campo Usuário
        if (usuario.isEmpty()) {
            view.getjLabelAviso().setText("Campo obrigatório faltando: Usuário");
            return false;
        }
        String regexUsuario = "^[a-zA-Z0-9]+$";
        if (!usuario.matches(regexUsuario)) {
            view.getjLabelAviso().setText("Usuário inválido (Apenas letras e números, sem espaços)");
            return false;
        }
        // Verifica campo Senha
        if (senha.isEmpty()) {
            view.getjLabelAviso().setText("Campo obrigatório faltando: Senha");
            return false;
        }
        String regexSenha = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        if (!senha.matches(regexSenha)) {
            view.getjLabelAviso().setText("Senha inválida (No mínimo 8 dígitos, apenas letras e números)");
            return false;
        }
        return true;
    }

    public Cliente obtemModelo() {
        String nome = view.getjTextFieldNome().getText();
        String email = view.getjTextFieldEmail().getText();
        String telefone = view.getjTextFieldTelefone().getText();
        String dataNasc = view.getjTextFieldDataNasc().getText();
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = new String(view.getjPasswordFieldSenha().getPassword());
        int id = bancoPessoa.retornaProximoID();
        Cliente modelo = new Cliente(usuario, senha, id, nome, telefone, dataNasc, email);
        return modelo;
    }

    public String registrar(Cliente modelo) throws RegistroException {
        // Verifica se telefone já está registrado
        if (bancoPessoa.buscaTelefone(modelo.getTelefone())) {
            throw new TelefoneExistenteException("Telefone já registrado.");
        }

        // Verifica se email já está registrado
        if (bancoPessoa.buscaEmail(modelo.getEmail())) {
            throw new EmailExistenteException("Email já registrado.");
        }

        // Verifica se usuário já está registrado
        if (bancoUsuario.buscaUsuario(modelo.getUsuario())) {
            throw new UsuarioExistenteException("Usuário já registrado.");
        }

        // Se tudo estiver correto, insere o cliente no banco
        bancoUsuario.insereUsuario(modelo);
        bancoPessoa.inserePessoa(modelo);
        return "Registrado com sucesso";
    }
}
