package modelo;

public abstract class ItemBiblioteca implements Emprestavel {

    protected String titulo;
    protected Autor autor;
    protected Categoria categoria;
    protected int anoPublicacao;
    protected boolean disponivel;
    protected String usuarioEmprestimo;

    public ItemBiblioteca(String titulo, Autor autor, Categoria categoria, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true; // por padrão, o item está disponível
        this.usuarioEmprestimo = null; // nenhum usuário inicialmente
    }
    
    // Implementação básicos dos métodos da interface Emprestavel
    @Override
    public void emprestar(String usuario) {
        if( disponivel ) {
            this.disponivel = false;
            this.usuarioEmprestimo = usuario;
            System.out.println( titulo + " emprestado para " + usuario + "." );
        } 
        else {
            System.out.println( "Item indisponível para empréstimo." );
        }
    }

    @Override
    public void devolver() {
        this.disponivel = true;
        this.usuarioEmprestimo = null;
        System.out.println( titulo + " devolvido com sucesso." );
    }

    @Override
    public boolean isDisponivel() {
        return disponivel;
    }

    //Getters
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

    // Método abstrato para informações de cada tipo
    public abstract String getDetalhes();

    @Override
    public String toString() {
        return getTitulo() + " - " + titulo + " | Autor: " + autor + " | Categoria: " + categoria + " | Ano: " + anoPublicacao + 
            " | " + ( disponivel ? "Disponível" : "Emprestado para " + usuarioEmprestimo );
    }

    public abstract String getTipo();
}
