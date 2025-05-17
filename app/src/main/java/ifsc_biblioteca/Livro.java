package ifsc_biblioteca;

import java.util.LinkedHashSet;
import java.util.Set;

public class Livro{

    // Atributos
    private String titulo;
    private String codigo;
    private Set<Autor> autores = new LinkedHashSet<Autor>();

    // Atributo da classe
    private static int codigoAtual = 1000;

    public Livro(String titulo, Set<Autor> autores){

        this.titulo = titulo;
        this.autores = autores;
        this.codigo = (codigoAtual + 1) + "";

        codigoAtual++; //para o proximo livro
    }

}