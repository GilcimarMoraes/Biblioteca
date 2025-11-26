package negocio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import modelo.ItemBiblioteca;
import modelo.Livro;

public class Biblioteca {

    // Lista de livros (pode ter LivroFisico e LivroDigital, pois ambos são Livro)
    private List<ItemBiblioteca> itens = new ArrayList<>();

    // Adiciona um livro na biblioteca
    public void adicionarLivro(ItemBiblioteca item) {
        itens.add(item);
        System.out.println("Livro adicionado: " + item.getTitulo());
    }

    // Remove um livro pelo título (simples para iniciantes)
    public void removerLivroPorTitulo(String titulo) {
        ItemBiblioteca itemParaRemover = null;

        // Procura o livro com o título informado
        for (ItemBiblioteca item : itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                itemParaRemover = item;
                break;
            }
        }

        if (itemParaRemover != null) {
            itens.remove(itemParaRemover);
            System.out.println("Livro removido: " + titulo);
        } else {
            System.out.println("Livro não encontrado: " + titulo);
        }
    }

    // Lista todos os livros cadastrados
    public void listarItens() {
        System.out.println("=== Itens Completos da Biblioteca ===");

        if (itens.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
        } else {
            for (ItemBiblioteca item : itens) {
                System.out.println(item); // usa o toString de cada livro
            }
        }
    }
}
