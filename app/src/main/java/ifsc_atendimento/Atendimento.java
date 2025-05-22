package ifsc_atendimento;

import java.util.*;

public class Atendimento{

    // Constantes
    private final int TAMANHO_RELATORIO = 3;

    // Atributos
    private Queue<Cliente> filaClientes;    
    private List<Cliente> clientesRegistrados;
    private List<Cliente> clientesJaAtendidos;    
    private int[] relatorio;  
    /*
     * relatorio[0] => armazena dados sobre total de solicitações registradas
     * relatorio[1] => armazena dados sobre total de solicitações atendidas
     * relatorio[2] => armazena dados sobre total de solicitações espera
    */

    public Atendimento(){

        filaClientes = new LinkedList<Cliente>();    
        clientesRegistrados = new LinkedList<Cliente>();
        clientesJaAtendidos = new LinkedList<Cliente>();    
        relatorio = new int[TAMANHO_RELATORIO]; 

    }

    public void adicionarClienteNaFila(Cliente cliente){

        filaClientes.add(cliente);
        this.relatorio[2]++;
        // incremento solicitacoes em espera

    }

    public void registarSolicitacao(Cliente cliente){

        clientesRegistrados.add(cliente);
        this.relatorio[0]++;
        // incremento solicitacoes registradas

    }

    public List<String> telefoneClientesRegistrados(){

        List<String> telefones = new LinkedList<String>();

        for(Cliente tel : this.clientesRegistrados)
            telefones.add(tel.getTelefone());

        return telefones;
    }

    public String nomeProximoCliente(){

        String nome = filaClientes.peek().getNome();

        return nome == null ? "Sem cliente na fila" : nome;
    }

    public String atenderProximoCliente(){

        // obtenho e depois removo o cliente da fila
        Cliente cliente = filaClientes.remove();
        this.relatorio[1]++; // incremento solicitacoes atendidas
        this.relatorio[2]--; // diminuo solicitacoes em espera
        clientesJaAtendidos.add(cliente);

        // retorno o nome do cliente que foi removido
        return cliente.getNome();

    }

    public List<String> nomeClientesAtendidos(){

        List<String> clientesAtendidos = new LinkedList<String>();

        for(Cliente cli : clientesJaAtendidos)
            clientesAtendidos.add(cli.getNome());

        return clientesAtendidos;

    }

    public List<String> telefonesClientesEspera(){

        List<String> telefoneClienteEspera = new LinkedList<String>();

        for(Cliente cli : filaClientes)
            telefoneClienteEspera.add(cli.getTelefone());

        return telefoneClienteEspera;
    }

    // Como o relatorio está fixo a tres parametros, fiz passo a passo (nao fiz generico)
    public String getRelatorio(){

        String r = "Relatório:\n{ ";

        r += "Registradas: " + this.relatorio[0] + "; ";
        r += "Atendidas: " + this.relatorio[1] + "; ";
        r += "Em espera: " + this.relatorio[2];
        r += " }";

        return r;

    }
}