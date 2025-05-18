package ifsc_biblioteca;

import java.util.LinkedHashSet;
import java.util.Set;

public class Livro{

    // Atributos
    private String titulo;
    private String codigo;
    private int totalCopias;
    private int copiasDisponiveis;
    private int totalEmprestimos;
    private Set<Autor> autores = new LinkedHashSet<Autor>();


    // Atributo da classe
    private static int codigoAtual = 1001;

    public Livro(String titulo, Set<Autor> autores, int totalCopias){

        this.titulo = titulo;
        this.autores = autores;
        this.codigo = codigoAtual + "";
        this.totalCopias = this.copiasDisponiveis = totalCopias;
        this.totalEmprestimos = 0;

        codigoAtual++; //para o proximo livro
    }

    public String getTitulo(){

        return this.titulo;

    }

    public String getCodigo(){

        return this.codigo;

    }

    public int getTotalCopias(){

        return this.totalCopias;

    }

    public int getTotalCopiasDisponiveis(){

        return this.copiasDisponiveis;

    }

    public int getTotalEmprestados(){

        return this.totalEmprestimos;

    }

    public Set<Autor> getAutores(){

        return this.autores;

    }

    public String getAutoresToString(){

        String str = "";

        for(Autor autor : this.autores){
            str += autor.getNome() + "; ";
        }

        return str;

    }

    public boolean existeCopia(){

        return this.totalCopias > 0;

    }

    public boolean existeCopiaParaEmprestimo(){

        return this.copiasDisponiveis > 0;

    }

    public boolean emprestar(){

        if(! existeCopiaParaEmprestimo())
            return false;

        this.totalEmprestimos++;
        this.copiasDisponiveis--;

        return true;

    }

    public void devolver(){

        this.copiasDisponiveis++;

    }

    public String exibirDados(){

        return 
            "Título: " + this.titulo + "; Código: " + this.codigo +
             "; Cópias disponíveis: " + this.copiasDisponiveis;

    }

}