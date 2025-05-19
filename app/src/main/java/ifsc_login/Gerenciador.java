package ifsc_login;

import java.util.List;
import java.util.ArrayList;

public class Gerenciador{

    // Atributos
    private static List<Usuario> usuarios = new ArrayList<Usuario>();

    public static boolean cadastrarUsuario(Usuario user){

        if(! usuarioExiste(user)){

            usuarios.add(user);
            return true;

        }

        return false; // ja tem um login com este usuario cadastrado

    }

    public static boolean removerUsuario(Usuario user){

        if(usuarioExiste(user)){

            usuarios.removeIf(usuario -> usuario.equals(user));
            return true;

        }

        return false; // usuario nao existe

    }

    public static List<String> listarLogins(){

        List<String> logins = new ArrayList<String>();

        for(Usuario login : usuarios){

            logins.add(login.getLogin());

        }

        return logins;

    }

    private static boolean usuarioExiste(Usuario user){

        for(Usuario usuario : usuarios){

            if(usuario.getLogin().equals(user.getLogin()))
                return true;

        }

        return false;
    }

    // Eu sei que ficou parecido com o usuarioExiste
    // mas os métodos possuem funcoes diferentes.
    public static Usuario getUsuario(String login){

        for(Usuario usuario : usuarios){

            if(usuario.getLogin().equals(login))
                return usuario;

        }

        return null;

    }
}