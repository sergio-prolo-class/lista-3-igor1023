package ifsc_atendimento;

public class Solicitacao{

    // Constantes
    private final String[] categorias = {"Suporte Técnico", "Informação", "Atendimento Financeiro"};

    // Atributos
    String descricao;
    String categoria;

    public void setDescricao(String descricao){

        this.descricao = descricao;

    }

    public String getDescricao(){

        return this.descricao;

    }

    public boolean setCategoria(int num){

        if(num < 1 || num > 3)
            return false;

        this.categoria = categorias[num - 1];
        return true;

    }

    public String getCategoria(){

        return this.categoria;

    }
}