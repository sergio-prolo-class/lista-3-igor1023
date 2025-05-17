package ifsc_biblioteca;

import java.util.Set;

public class Biblioteca{

    private Set<Autor> autores;
    private Set<Livro> livros;
    private Set<Leitor> leitores;
    private Set<Emprestimo> emprestimos;



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

        if(! livro.existeCopiaParaEmprestimo())
            return false;

        livro.emprestar();
        Emprestimo emp = new Emprestimo(livro, leitor, data);
        this.emprestimos.add(emp);
        return true;

    }

    /*
     * para depois...
     *  public void listarAutoresOrdemAlfabetica();
        public void listarLeitoresPorNome();
        public void listarLeitoresPorId();
        public void listarLivrosPorTitulo();
        public void listarLivrosPorAutor();
        public void listarLivrosPorCodigo();
        public void listarEmprestimosPorData();
        public void listarEmprestimosPorLeitor(Leitor leitor);
     */

}