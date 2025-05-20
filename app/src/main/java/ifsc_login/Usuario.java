package ifsc_login;

public class Usuario{

    // Atributos
    // O compilador sugeriu utilizar os atributos como final
    // Faz sentido, uma vez que estes atributos são criados 
    // no método construtor e não serão alterados.
    private final String login;
    private final String senha;

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