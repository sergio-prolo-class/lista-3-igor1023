package ifsc_biblioteca;

public class Leitor{

    // Atributos
    private String nome;
    private String endereco;
    private String telefone;
    private String id;

    // Atributo da classe
    private static int idAtual = 0;

    public Leitor(String nome, String endereco){

        this(nome, endereco, "N/A");

    }

    public Leitor(String nome, String endereco, String telefone){

        this.nome = nome;
        this.nome = endereco;
        this.telefone = telefone;
        this.id = String.format("%4d", idAtual + 1);
        
        idAtual++; //para o proximo leitor

    }

}