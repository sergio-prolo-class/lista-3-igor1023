package ifsc_atendimento;

public class Solicitacao{

    // Constantes
    private final String[] categorias = {"Suporte Técnico", "Informação", "Atendimento Financeiro"};
    // usuario entrará com 1 para cadastrar uma solicitaca com categoria SUPORTE TECNICO
    // no método, será tratado com N-1. É melhor para um usuario/funcionario utilizar 1, 2 e 3
    // do que 0, 1 e 2

    // Atributos
    private String descricao;
    private String categoria;

    public Solicitacao(String descricao, int categoria){

        setDescricao(descricao);
        setCategoria(categoria);

    }

    private void setDescricao(String descricao){

        this.descricao = descricao;

    }

    public String getDescricao(){

        return this.descricao;

    }

    private boolean setCategoria(int num){

        if(num < 1 || num > 3)
            return false;

        this.categoria = categorias[num - 1];
        return true;

    }

    public String getCategoria(){

        return this.categoria;

    }
}