package modelo;

import java.time.LocalDate;

public abstract class ItemBiblioteca implements Emprestavel, Catalogavel {

    // Contador estático para gerar IDs únicos
    private static int contadorID = 1;

    // Atributos comuns
    protected String titulo;
    protected Autor autor;
    protected Categoria categoria;
    protected int anoPublicacao;
    protected boolean disponivel;
    protected String usuarioEmprestimo;

    // Atributos Catalogavel
    protected int codigoCatalogo;
    protected final LocalDate dataCadastro;

    public ItemBiblioteca(String titulo, Autor autor, Categoria categoria, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true; // por padrão, o item está disponível
        this.usuarioEmprestimo = null;

        // Atribuição dos valores do Catalogavel
        this.codigoCatalogo = contadorID++;
        this.dataCadastro = LocalDate.now();
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

    @Override
    public abstract int getPrazoDevolucao();

    @Override
    public abstract double calcularMulta( int diasAtraso);


    @Override
    public int getCodigoCatalogo() {
        return codigoCatalogo;
    }

    @Override
    public LocalDate getDataCadastro() {
        return dataCadastro;
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
    public String getUsuarioEmprestimo() {
        return usuarioEmprestimo;
    }

    //Metodo estatico para verificar o proximo ID
    public static int getProximoID() {
        return contadorID;
    }




    //@Override
    //public String toString() {
    //    return getTipo() + " - " + titulo + " | Autor: " + autor + " | Categoria: " + categoria + " | Ano: " + anoPublicacao + 
    //        " | " + ( disponivel ? "Disponível" : "Emprestado para " + usuarioEmprestimo );
    //}

    @Override
    public String toString() {
        return String.format("[ID: %d] %s - %s | Autor: %s | Cadastro: %s | %s",
            codigoCatalogo,
            getTipo(),
            titulo,
            autor.getNome(),
            dataCadastro,
            disponivel ? "Disponível" : "Emprestado para: " + usuarioEmprestimo
        );
    }

    // Método abstrato para informações de cada tipo
    public abstract String getDetalhes();
    public abstract String getTipo();
}
