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

        String autores = "{ ";
        List<String> autoresNomes = new ArrayList<String>();


        for(Autor autor : this.autores)
            autoresNomes.add(autor.getNome());

        Collections.sort(autoresNomes);

        for(String str : autoresNomes)
            autores += str + "; ";

        autores += " }";

        return autores;
    }

    // mesma ideia dos autores em ordem alfabetica foi
    // aplicada nos métodos abaixo

    public String listarLeitoresPorNome(){

        String leitores = "{ ";
        List<String> leitoresNomes = new ArrayList<String>();

        for(Leitor leitor : this.leitores)
            leitoresNomes.add(leitor.getNome());

        Collections.sort(leitoresNomes);

        for(String str : leitoresNomes)
            leitores += str + "; ";

        leitores += "}";
        return leitores;

    }

    public String listarLeitoresPorId(){

        String ids = "{ ";

        List<String> idsLeitores = new ArrayList<String>();

        for(Leitor leitorId : this.leitores)
            idsLeitores.add(leitorId.getId());

        Collections.sort(idsLeitores);

        for(String str : idsLeitores)
            ids += str + "; ";
        

        ids += " }";
        return ids;

    }

    public String listarLivrosPorTitulo(){

        String livros = "{ ";

        List<String> livrosNomes = new ArrayList<String>();

        for(Livro livro : this.livros)
            livrosNomes.add(livro.getTitulo());

        Collections.sort(livrosNomes);

        for(String str : livrosNomes)
            livros += str + "; ";

        livros += " }";
        return livros;

    }

    public void listarLivrosPorAutor(){

    }

    public String listarLivrosPorCodigo(){

        String codigos = "{ ";

        List<String> livrosCodigos = new ArrayList<String>();

        for(Livro livro : this.livros)
            livrosCodigos.add(livro.getCodigo());

        Collections.sort(livrosCodigos);

        for(String str : livrosCodigos)
            codigos += str + "; ";

        codigos += " }";
        return codigos;


    }

    public String listarEmprestimosPorData(){
        return ""; // a fazer
    }

    public String listarEmprestimosPorLeitor(Leitor leitor){
        return ""; // a fazer
    }

}