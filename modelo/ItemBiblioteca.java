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
}
