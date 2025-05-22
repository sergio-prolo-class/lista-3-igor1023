package ifsc_biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca{

    private Set<Autor> autores;
    private Set<Livro> livros;
    private Set<Leitor> leitores;
    private Set<Emprestimo> emprestimos;

    public Biblioteca(){

        this.autores = new LinkedHashSet<>();
        this.livros = new LinkedHashSet<>();
        this.leitores = new LinkedHashSet<>();
        this.emprestimos = new LinkedHashSet<>();

    }

    public void cadastrarAutor(Autor autor){

        this.autores.add(autor);

    }

    public void cadastrarLivro(Livro livro){

        this.livros.add(livro);

    }

    public void cadastrarLeitor(Leitor leitor){

        this.leitores.add(leitor);

    }

    public boolean cadastrarEmprestimo(Livro livro, Leitor leitor, String data){

        if(! livro.existeCopiaParaEmprestimo() || ! leitor.podeEmprestar())
            return false;

        for (Emprestimo e : emprestimos) {

            if (e.getLeitor().equals(leitor) && e.getLivro().equals(livro)) 
                return false; // Leitor já possui esse livro emprestado

        }

        if(livro.emprestar()) {

            leitor.incrementarEmprestimos();
            Emprestimo emp = new Emprestimo(livro, leitor, data);
            this.emprestimos.add(emp);
            return true;

        }
        
        return true;

    }

    // Conheci o método sort da classe Collections
    // https://www.youtube.com/watch?v=wViUmn3YFoE
    public String listarAutoresOrdemAlfabetica(){

        String autores = "Autores { ";
        List<String> autoresNomes = new ArrayList<String>();


        for(Autor autor : this.autores)
            autoresNomes.add(autor.getNome());

        Collections.sort(autoresNomes);

        for(String str : autoresNomes)
            autores += str + "; ";

        autores += "}";

        StringBuilder str = new StringBuilder(autores);
        str.deleteCharAt(autores.length() - 3);

        return str.toString();
    }

    // mesma ideia dos autores em ordem alfabetica foi
    // aplicada nos métodos abaixo

    public String listarLeitoresPorNome(){

        String leitores = "Leitores { ";
        List<String> leitoresNomes = new ArrayList<String>();

        for(Leitor leitor : this.leitores)
            leitoresNomes.add(leitor.getNome());

        Collections.sort(leitoresNomes);

        for(String str : leitoresNomes)
            leitores += str + "; ";

        leitores += "}";

        StringBuilder str = new StringBuilder(leitores);
        str.deleteCharAt(leitores.length() - 3);

        return str.toString();

    }

    public String listarLeitoresPorId(){

        String ids = "IDs { ";

        List<String> idsLeitores = new ArrayList<String>();

        for(Leitor leitorId : this.leitores)
            idsLeitores.add(leitorId.getId());

        Collections.sort(idsLeitores);

        for(String str : idsLeitores)
            ids += str + "; ";
        

        ids += "}";
        
        StringBuilder str = new StringBuilder(ids);
        str.deleteCharAt(ids.length() - 3);

        return str.toString();

    }

    public String listarLivrosPorTitulo(){

        String livros = "Livros { ";

        List<String> livrosNomes = new ArrayList<String>();

        for(Livro livro : this.livros)
            livrosNomes.add(livro.getTitulo());

        Collections.sort(livrosNomes);

        for(String str : livrosNomes)
            livros += str + "; ";

        livros += "}";

        StringBuilder str = new StringBuilder(livros);
        str.deleteCharAt(livros.length() - 3);

        return str.toString();

    }

    public String listarLivrosPorAutor(){
        return ""; // A fazer
    }

    // encontrei um método para remover um caractere
    // espefico: utilizar um objeto da classe StringBuilder,
    // utilizar o método deleteCharAt, depois retornar
    // o objeto+método toString. 
    // Utilizei isto para remover o ';' que ficava ao final
    // da impressão das listagens. Funcionou.
    public String listarLivrosPorCodigo(){

        String codigos = "Livros por Código { ";

        List<String> livrosCodigos = new ArrayList<String>();

        for(Livro livro : this.livros)
            livrosCodigos.add(livro.getCodigo());

        Collections.sort(livrosCodigos);

        for(String str : livrosCodigos)
            codigos += str + "; ";

        codigos += "}";

        StringBuilder str = new StringBuilder(codigos);
        str.deleteCharAt(codigos.length() - 3);

        return str.toString();

    }

    public String listarEmprestimosPorData(){
        return ""; // a fazer
    }

    public String listarEmprestimosPorLeitor(Leitor leitor){
        return ""; // a fazer
    }

}