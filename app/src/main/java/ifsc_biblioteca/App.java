package ifsc_biblioteca;

import java.util.HashSet;
import java.util.Set;

public class App{

    public static void main(String[] args){

        System.out.println("\n===== TESTANDO A BIBLIOTECA =====\n");

        Biblioteca biblioteca = new Biblioteca();

        // Criar autores
        Autor autor1 = new Autor("Machado Assis", "Português", new HashSet<>());
        Autor autor2 = new Autor("Fulano", "Inglês", new HashSet<>());

        biblioteca.cadastrarAutor(autor1);
        biblioteca.cadastrarAutor(autor2);

        // Criar livros
        Set<Autor> autores1 = new HashSet<>();
        autores1.add(autor1);

        Set<Autor> autores2 = new HashSet<>();
        autores2.add(autor2);

        Livro livro1 = new Livro("Dom Casmurro", autores1, 1);
        Livro livro2 = new Livro("Linguagem JAVA", autores2, 6);

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        // Integrar livro a leitor
        autor1.adicionarLivro(livro1);
        autor2.adicionarLivro(livro2);

        // Criar leitor
        Leitor leitor1 = new Leitor("João", "Palhoça");
        Leitor leitor2 = new Leitor("Maria", "São José", "48912345678");

        biblioteca.cadastrarLeitor(leitor1);
        biblioteca.cadastrarLeitor(leitor2);

        // Registrar emprestimo
        biblioteca.cadastrarEmprestimo(livro1, leitor1, "2025-05-21");
        biblioteca.cadastrarEmprestimo(livro2, leitor1, "2025-05-22");
        biblioteca.cadastrarEmprestimo(livro2, leitor2, "2025-05-23");

        // Exibir relatórios
        System.out.println(biblioteca.listarAutoresOrdemAlfabetica());
        System.out.println(biblioteca.listarLeitoresPorNome());
        System.out.println(biblioteca.listarLeitoresPorId());
        System.out.println(biblioteca.listarLivrosPorTitulo());
        System.out.println(biblioteca.listarLivrosPorCodigo());
        // Faltam implementar os outros relatorios

    }

}