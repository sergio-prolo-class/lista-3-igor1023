package ifsc_biblioteca;

import java.util.Set;
import java.util.LinkedHashSet;

public class Autor{

    // Atributos
    private String nome;
    private String idioma;
    private Set<Livro> livros = new LinkedHashSet<Livro>();

    public Autor(String nome, String idioma, Set<Livro> livros){

        this.nome = nome;
        this.idioma = idioma;
        this.livros.addAll(livros);

    }

    public void adicionarLivro(Livro livro){

        this.livros.add(livro);

    }

    public String getNome(){

        return this.nome;

    }

    public String getIdioma(){

        return this.idioma;

    }

    public Set<Livro> getLivros(){

        return this.livros;

    }

    public String getLivrosToString(){

        String str = "";

        for(Livro l : this.livros){

            str += l.getTitulo() + "; ";

        }

        return str;

    }

    public String exibirDados(){

        return "Autor: " + getNome() + "; Idioma: " + getIdioma() + "; Livros: " + getLivrosToString();

    }

}