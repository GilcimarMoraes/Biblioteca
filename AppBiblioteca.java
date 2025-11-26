import modelo.Autor;
import modelo.Categoria;
import modelo.LivroDigital;
import modelo.LivroFisico;
import modelo.Revista;
import negocio.Biblioteca;
public class AppBiblioteca {

    public static void main(String[] args) {

        // Cria alguns autores
        Autor autor1 = new Autor("J. R. R. Tolkien", "tolkien@exemplo.com");
        Autor autor2 = new Autor("Isaac Asimov", "asimov@exemplo.com");
        Autor autor3 = new Autor("Ana Paula", "anapaula@exemplo.com");

        // Cria algumas categorias
        Categoria fantasia = new Categoria("Fantasia", "Livros com mundos mágicos e criaturas fantásticas");
        Categoria ficcaoCientifica = new Categoria("Ficção Científica", "Histórias com tecnologia, espaço, futuro");
        Categoria Politica = new Categoria("Política", "Revistas sobre assuntos políticos e sociais");

        // Cria livros físicos e digitais
        LivroFisico livroFisico = new LivroFisico(
                "O Senhor dos Anéis",
                autor1,
                fantasia,
                1954,
                1200,
                1.2
        );

        LivroDigital livroDigital = new LivroDigital(
                "Fundação",
                autor2,
                ficcaoCientifica,
                1951,
                2.5,
                "EPUB"
        );

        // Cria a Revista
        //Revista revista1 = new Revista("Veja", autor3, Politica, 2023, 150, "1234-5678");

        // Cria a biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adiciona livros à biblioteca
        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(livroDigital);
        //biblioteca.adicionarLivro(revista1);

        // Lista todos os livros
        biblioteca.listarItens();

        // Remove um livro pelo título
        //biblioteca.removerLivroPorTitulo("Fundação");

        // Lista novamente para ver o resultado
        //biblioteca.listarLivros();
    }
}
