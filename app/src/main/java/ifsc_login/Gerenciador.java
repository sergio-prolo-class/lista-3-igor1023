package ifsc_login;

import java.util.List;
import java.util.ArrayList;

public class Gerenciador{

    // Atributos
    private static List<Usuario> usuarios = new ArrayList<Usuario>();
    private static List<Usuario> usuariosAutenticados = new ArrayList<Usuario>();

    public static boolean cadastrarUsuario(Usuario user){

        if(! usuarioExiste(user)){

            usuarios.add(user);
            return true;

        }

        return false; // ja tem um login com este usuario cadastrado

    }

    public static void autenticarUsuario(String login, String senha){

        // Vou obter o Usuario que tenha um login igual a String login de entrada
        // lembrando que getUsuario retorna o usuario ou NULL
        Usuario user = getUsuario(login.toLowerCase());

        if(user != null && user.getSenha().equals(senha))
            usuariosAutenticados.add(user);

    }

    public static boolean estaAutenticado(String login, String senha){

        // lembrando que getUsuario retorna o usuario ou NULL
        Usuario user = getUsuario(login.toLowerCase());

        return user != null && user.getSenha().equals(senha);
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

    public static List<Usuario> obtemUsuariosCadastrados(){

        return usuariosAutenticados;

    }

    private static boolean usuarioExiste(Usuario user){

        return usuarios.contains(user);

    }

    // vou buscar se existe um usuario com este login
    // e retornarei o usuario
    public static Usuario getUsuario(String login){

        for(Usuario usuario : usuarios){

            if(usuario.getLogin().equals(login))
                return usuario;

        }

        return null;

    }
}