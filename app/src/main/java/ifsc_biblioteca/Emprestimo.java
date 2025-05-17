package ifsc_biblioteca;

public class Emprestimo{

    // Atributos (referencias)
    private Livro livro;
    private Leitor leitor;
    private String dataEmprestimo;

    public Emprestimo(Livro livro, Leitor leitor, String data){

        this.livro = livro;
        this.leitor = leitor;
        this.dataEmprestimo = data;

    }

    public Livro getLivro(){

        return this.livro;

    }

    public Leitor getLeitor(){

        return this.leitor;

    }

    public String getData(){

        return this.dataEmprestimo;

    }

    public String exibirDados(){

        return "Empréstimo: " +
            "Livro: {" + this.livro.getTitulo() + "}; Leitor: {" + 
            this.leitor.getNome() + "; Data: {" + this.dataEmprestimo + "}";

    }

}