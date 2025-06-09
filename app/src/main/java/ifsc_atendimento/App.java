package ifsc_atendimento;

public class App{

    public static void visualizarRelatorio(Atendimento a){

        System.out.println(a.getRelatorio());

    }

    public static void main(String[] args){

        System.out.println("\nTestando Questão 2 - ATENDIMENTO\n");

        Atendimento callCenter = new Atendimento();
        
        // CLIENTE 1
        Cliente cliente1 = new Cliente("Steve", "912345678");
        cliente1.setSolicitacao("Server muito lagado!!!", 1);
        cliente1.setSolicitacao("Quantos packs de diamantes tenho disponiveis?", 3);

        // CLIENTE 2
        Cliente cliente2 = new Cliente("Pelé", "40028922");
        cliente2.setSolicitacao("Quando é a proxima convocação?", 2);

        // CLIENTE 3
        Cliente cliente3 = new Cliente("Paulo de Brasilia", "67912345678");
        cliente3.setSolicitacao("Impacta 68 problema com praca voip", 1);

        // ADICIONAR À FILA
        callCenter.adicionarClienteNaFila(cliente1);
        callCenter.adicionarClienteNaFila(cliente2);
        callCenter.adicionarClienteNaFila(cliente3);

        visualizarRelatorio(callCenter);

        // Proximo cliente na fila
        System.out.println("Próximo cliente a ser atendido: " + callCenter.nomeProximoCliente() + "\n");

        // Vamos atender o proximo cliente na fila
        System.out.println(callCenter.atenderProximoCliente() + " está sendo atendido (Removido da fila)\n");

        // Proximo cliente na fila²
        System.out.println("Próximo cliente a ser atendido: " + callCenter.nomeProximoCliente() + "\n");
    }

}