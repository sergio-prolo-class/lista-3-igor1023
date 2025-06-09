package ifsc_atendimento;

import java.util.ArrayList;
import java.util.List;

public class Cliente{

    // Atributos
    private String nome;
    private String telefone;
    private List<Solicitacao> solicitacoes;

    public Cliente(String nome, String telefone){

        this.nome = nome;
        this.telefone = telefone;
        this.solicitacoes = new ArrayList<Solicitacao>();

    }

    public void setSolicitacao(String descricao, int categoria){

        Solicitacao s = new Solicitacao(descricao, categoria);
        
        solicitacoes.add(s);

    }

    public String getNome(){

        return this.nome;

    }

    public String getTelefone(){

        return this.telefone;

    }

    public List<Solicitacao> getSolicitacoes(){

        return this.solicitacoes;

    }
}