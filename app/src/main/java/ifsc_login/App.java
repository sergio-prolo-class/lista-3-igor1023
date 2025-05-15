package ifsc_login;

import java.util.List;

public class App{

    public static void main(String[] args){

        Usuario igor = new Usuario("IgoR_IFsC", "123456@#$");
        Gerenciador.adicionarUsuario(igor);

        Usuario tiago = new Usuario("TIAGO_IFsC", "123456#$");
        Gerenciador.adicionarUsuario(tiago);

        Usuario moecke = new Usuario("moecke_ifsC", "12346666");
        Gerenciador.adicionarUsuario(moecke);

        Gerenciador.listarLogins().forEach(System.out::println);
    }

}