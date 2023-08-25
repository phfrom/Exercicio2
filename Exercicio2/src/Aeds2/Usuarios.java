package Aeds2;


public class Usuarios {
    private String login;
    private String senha;
    private int codigo;
    private char sexo;

    public Usuarios( ) {
        this.login = " ";
        this.senha = " ";
        this.codigo = -1;
        this.sexo = '*';
    }

    public Usuarios(int codigo, String login, String senha, char sexo) {
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
        this.sexo = sexo;
    }

     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Usuário [codigo=" + codigo +", login=" + login + ", senha=" + senha + ", sexo=" + sexo + "]";
    }
}
