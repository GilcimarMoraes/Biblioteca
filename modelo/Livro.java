package modelo;

public class Livro {
    private String titulo;
    private Autor autor;        // composição: um livro possui um autor
    private Categoria categoria; // composição: um livro possui uma categoria
    private int anoPublicacao;

    public Livro(String titulo, Autor autor, Categoria categoria, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    // Método que pode ser sobrescrito pelas subclasses (LivroDigital/LivroFisico)
    public String getTipo() {
        return "Livro (genérico)";
    }

    @Override
    public String toString() {
        return getTipo() + " - " + titulo +
                " | Autor: " + autor +
                " | Categoria: " + categoria +
                " | Ano: " + anoPublicacao;
    }
}
