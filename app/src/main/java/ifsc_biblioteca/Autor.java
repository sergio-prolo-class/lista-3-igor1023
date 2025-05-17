package ifsc_biblioteca;

import java.util.Set;
import java.util.LinkedHashSet;

public class Autor{

    // Atributos
    String nome;
    String idioma;
    Set<Livro> livros = new LinkedHashSet<Livro>();

    public Autor(String nome, String idioma, Set<Livro> livros){

        this.nome = nome;
        this.idioma = idioma;
        this.livros = livros;

    }

}