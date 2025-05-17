package ifsc_atendimento;

import java.util.*;

public class Atendimento{

    // Constantes
    private final int TAMANHO_RELATORIO = 3;

    // Atributos
    private Queue<Cliente> filaClientes = new LinkedList<Cliente>();    
    private List<Cliente> clientesRegistrados = new LinkedList<Cliente>();
    private List<Cliente> clientesJaAtendidos = new LinkedList<Cliente>();    
    private int[] relatorio = new int[TAMANHO_RELATORIO];

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

        List<String> telefone = new LinkedList<String>();

        for(Cliente tel : this.clientesRegistrados)
            telefone.add(tel.getTelefone());

        return telefone;
    }

    public String nomeProximoCliente(){

        return filaClientes.peek().getNome();

    }

    public String atenderProximoCliente(){

        this.relatorio[1]++; // incremento solicitacoes atendidas
        this.relatorio[2]--; // diminuo solicitacoes em espera
        return filaClientes.remove().getNome();

    }

    public List<String> nomeClientesAtendidos(){

        List<String> clientesAtendidos = new LinkedList<String>();

        for(Cliente cli : clientesJaAtendidos){

            clientesAtendidos.add(cli.getNome());

        }

        return clientesAtendidos;

    }

    public List<String> telefonesClientesEspera(){

        List<String> telefoneClienteEspera = new LinkedList<String>();

        for(Cliente cli : filaClientes){

            telefoneClienteEspera.add(cli.getTelefone());

        }

        return telefoneClienteEspera;
    }
}