package ifsc_login;

public class Usuario{

    // Atributos
    private String login;
    private String senha;

    public Usuario(String login, String senha){

        this.login = formatarLogin(login);
        this.senha = senha;

    }

    private String formatarLogin(String str){

        return str.toLowerCase();

    }

    public String getLogin(){

        return this.login;

    }

    public String getSenha(){

        return this.senha;

    }

}