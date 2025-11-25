package negocio;

import java.util.ArrayList;
import java.util.List;

import modelo.Livro;

public class Biblioteca {

    // Lista de livros (pode ter LivroFisico e LivroDigital, pois ambos são Livro)
    private List<Livro> livros = new ArrayList<>();

    // Adiciona um livro na biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    // Remove um livro pelo título (simples para iniciantes)
    public void removerLivroPorTitulo(String titulo) {
        Livro livroParaRemover = null;

        // Procura o livro com o título informado
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroParaRemover = livro;
                break;
            }
        }

        if (livroParaRemover != null) {
            livros.remove(livroParaRemover);
            System.out.println("Livro removido: " + titulo);
        } else {
            System.out.println("Livro não encontrado: " + titulo);
        }
    }

    // Lista todos os livros cadastrados
    public void listarLivros() {
        System.out.println("=== Lista de Livros da Biblioteca ===");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro); // usa o toString de cada livro
            }
        }
    }
}
