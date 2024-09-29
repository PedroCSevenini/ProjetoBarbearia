package Controller.Helper;

import Exception.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Validador {

    public boolean validaNome(String nome) throws NomeException {
        if (nome.isEmpty()) {
            throw new NomeException("Campo obrigatório faltando: Nome");
        }
        String regexNome = "^[A-Za-zÀ-ÖØ-ÿ]+(?: [A-Za-zÀ-ÖØ-ÿ]+)*$";
        if (!nome.matches(regexNome)) {
            throw new NomeException("Nome inválido");
        }
        return true;
    }

    public boolean validaTelefone(String telefone) throws TelefoneException {
        if (telefone.isEmpty()) {
            throw new TelefoneException("Campo obrigatório faltando: Telefone");
        }
        String regexTelefone = "^\\d{10,11}$"; // 10 ou 11 dígitos
        if (!telefone.matches(regexTelefone)) {
            throw new TelefoneException("Telefone inválido (Somente números)");
        }
        return true;
    }

    public boolean validaEmail(String email) throws EmailException {
        if (email.isEmpty()) {
            throw new EmailException("Campo obrigatório faltando: Email");
        }
        String regexEmail = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        if (!email.matches(regexEmail)) {
            throw new EmailException("Email inválido");
        }
        return true;
    }

    public boolean validaDataNasc(String dataNasc) throws DataNascException {
        if (dataNasc.isEmpty()) {
            throw new DataNascException("Campo obrigatório faltando: Data de nascimento");
        }

        String regexDataNasc = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if (!dataNasc.matches(regexDataNasc)) {
            throw new DataNascException("Data de nascimento inválida (Formato: XX/XX/XXXX)");
        }

        // Verifica se a data de nascimento é válida
        LocalDate dataNascimento;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dataNascimento = LocalDate.parse(dataNasc, formatter);
        } catch (DateTimeParseException e) {
            throw new DataNascException("Data de nascimento inválida (Formato: XX/XX/XXXX)");
        }

        // Verifica se a pessoa tem pelo menos 14 anos
        LocalDate dataLimite = LocalDate.now().minusYears(14);
        if (dataNascimento.isAfter(dataLimite)) {
            throw new DataNascException("A idade deve ser pelo menos 14 anos.");
        }

        return true;
    }

    public static boolean verificaNomeServico(String nome) throws NomeServicoException {
        if (nome.matches("^[a-zA-ZÀ-ÖØ-öø-ÿ\\s]+$")) {
            return true;
        }
        throw new NomeServicoException("Nome inválido");
    }

    public static boolean verificaValorServico(String valor) throws ValorServicoException {
        if (valor.matches("^\\d{1,3}(?:\\.\\d{3})*,\\d{2}$")) { // Ex: 1.000,00
            return true;
        }
        throw new ValorServicoException("Valor inválido");
    }

    public boolean validaUsuario(String usuario) throws UsuarioException {
    if (usuario.isEmpty()) {
        throw new UsuarioException("Campo obrigatório faltando: Usuário");
    }

    // Regex para permitir apenas letras e números, mas exige ao menos uma letra
    String regexUsuario = "^(?=.*[a-zA-Z])[a-zA-Z0-9]+$";
    
    if (!usuario.matches(regexUsuario)) {
        throw new UsuarioException("Usuário inválido (Apenas letras e números, sem espaços, deve conter pelo menos uma letra)");
    }
    
    return true;
}

    // Função para validar o campo Senha
    public boolean validaSenha(String senha) throws SenhaException {
        if (senha.isEmpty()) {
            throw new SenhaException("Campo obrigatório faltando: Senha");
        }
        String regexSenha = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        if (!senha.matches(regexSenha)) {
            throw new SenhaException("Senha inválida (No mínimo 8 dígitos, apenas letras e números)");
        }
        return true;
    }
}
