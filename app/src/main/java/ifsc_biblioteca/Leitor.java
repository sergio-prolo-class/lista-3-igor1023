package ifsc_biblioteca;

public class Leitor{

    // constantes
    private final int MAX_EMPRESTIMOS = 5;

    // Atributos
    private String nome;
    private String endereco;
    private String telefone;
    private String id;
    private int quantidadeEmprestimos;

    // Atributo da classe
    private static int idAtual = 0;

    public Leitor(String nome, String endereco){

        this(nome, endereco, "N/A");

    }

    public Leitor(String nome, String endereco, String telefone){

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.id = String.format("%04d", idAtual + 1);
        this.quantidadeEmprestimos = 0;

        idAtual++; //para o proximo leitor

    }

    public String getNome(){

        return this.nome;

    }

    public String getEndereco(){

        return this.endereco;

    }

    public String getTelefone(){

        return this.telefone;

    }

    public String getId(){

        return this.id;

    }

    public void incrementarEmprestimos() {
        
        this.quantidadeEmprestimos++;

    }
    
    public void decrementarEmprestimos() {

        if (this.quantidadeEmprestimos > 0)
            this.quantidadeEmprestimos--;

    }
    
    public int getQuantidadeEmprestimos() {
       
        return this.quantidadeEmprestimos;

    }

    public boolean podeEmprestar() {

        return this.quantidadeEmprestimos < MAX_EMPRESTIMOS;

    }
    

    public String exibirDados(){

        return 
            "Nome: " + getNome() + "; Endereço: " + getEndereco() + 
            "; Telefone: " + getTelefone() + "; ID: " + getId();

    }

}