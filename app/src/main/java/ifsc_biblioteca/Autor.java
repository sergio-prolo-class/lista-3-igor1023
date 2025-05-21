package ifsc_biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Autor{

    // Atributos
    private String nome;
    private String idioma;
    private Set<Livro> livros = new HashSet<Livro>();

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

        String str = "Livros {";

        for(Livro l : this.livros)
            str += l.getTitulo() + "; ";

        str += " }";
        
        return str;

    }

    public String exibirDados(){

        return "Autor: " + getNome() + "; Idioma: " + getIdioma() + "; Livros: " + getLivrosToString();

    }

}