package ifsc_atendimento;

public class Cliente{

    // Atributos
    String nome;
    String telefone;
    Solicitacao solicitacao;

    public Cliente(String nome, String telefone){

        this.nome = nome;
        this.telefone = nome;

    }

    public void setSolicitacao(String descricao, int categoria){

        this.solicitacao.setDescricao(descricao);
        this.solicitacao.setCategoria(categoria);

    }

    public String getNome(){

        return this.nome;

    }

    public String getTelefone(){

        return this.telefone;

    }
}