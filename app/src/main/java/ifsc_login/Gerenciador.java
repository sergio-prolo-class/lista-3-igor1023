package ifsc_login;

import java.util.List;
import java.util.ArrayList;

public class Gerenciador{

    // Atributos
    static List<Usuario> usuarios = new ArrayList<Usuario>();

    public static boolean adicionarUsuario(Usuario user){

        if(! usuarioExiste(user)){

            usuarios.add(user);
            return true;

        }

        return false;

    }

    public static boolean removerUsuario(Usuario user){

        if(usuarioExiste(user)){

            usuarios.removeIf(usuario -> usuario.equals(user));
            return true;

        }

        return false;

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

            if(usuario.getLogin().equals(user))
                return false;

        }

        return true;
    }
}