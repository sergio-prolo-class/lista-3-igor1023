package ifsc_login;

public class App{

    public static void criarUsuarios(){

        Usuario igor = new Usuario("IgoR_IFsC", "123456@#$");
        Gerenciador.cadastrarUsuario(igor);

        Usuario tiago = new Usuario("TIAGO_IFsC", "123456#$");
        Gerenciador.cadastrarUsuario(tiago);

        Usuario moecke = new Usuario("moecke_ifsC", "12346666");
        Gerenciador.cadastrarUsuario(moecke);

    }

    public static void imprimirLogins(){

        Gerenciador.listarLogins().forEach(System.out::println);

    }

    public static void removerUsuario(String login){

        Usuario user = Gerenciador.getUsuario(login);
        Gerenciador.removerUsuario(user);

    }

    public static void main(String[] args){

        // vou criar alguns usuarios e cadastrá-los
        criarUsuarios();

         // Vou imprimi-los
        imprimirLogins();

        System.out.println("\n=======//=====//======\n");

        // vou remover um usuario
        removerUsuario("tiago_ifsc");
        imprimirLogins();
    
    }
}