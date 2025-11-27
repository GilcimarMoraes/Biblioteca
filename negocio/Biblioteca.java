package negocio;

import java.util.ArrayList;
import java.util.List;

import modelo.ItemBiblioteca;

public class Biblioteca {

    // Lista de livros (pode ter LivroFisico e LivroDigital, pois ambos são Livro)
    private List<ItemBiblioteca> itens = new ArrayList<>();

    // Adiciona um livro na biblioteca
    public void adicionarItem(ItemBiblioteca item) {
        itens.add(item);
        System.out.printf("Item Cadastrado - ID: %d | Tipo: %s | Título: %s%n",
            item.getCodigoCatalogo(), item.getTipo(), item.getTitulo()        );
    }

    // Remove um item pelo ID
    public void removerItemPorId( int id ) {
        ItemBiblioteca itemParaRemover = null;

        // Procura o item com o ID informado
        for (ItemBiblioteca item : itens) {
            if (item.getCodigoCatalogo() == id) {
                itemParaRemover = item;
                break;
            }
        }

        if (itemParaRemover != null) {
            itens.remove(itemParaRemover);
            System.out.println("Item removido: ID " + id);
        } else {
            System.out.println("Item não encontrado: ID " + id);
        }
    }

    //busca um item pelo ID
    public ItemBiblioteca buscarPorId( int id ) {
        for( ItemBiblioteca item : itens ) {
            if( item.getCodigoCatalogo() == id ) {
                return item;
            }
        }
        return null; // não encontrado
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
            System.out.println("Item removido: " + titulo);
        } else {
            System.out.println("Item não encontrado: " + titulo);
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
