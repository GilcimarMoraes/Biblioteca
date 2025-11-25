package modelo;

public class LivroFisico extends Livro {
    private int numeroPaginas;
    private double pesoEmKg;

    public LivroFisico(String titulo, Autor autor, Categoria categoria, int anoPublicacao, int numeroPaginas, double pesoEmKg) {
        super(titulo, autor, categoria, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
        this.pesoEmKg = pesoEmKg;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public double getPesoEmKg() {
        return pesoEmKg;
    }

    @Override
    public String getTipo() {
        return "Livro Físico";
    }

    @Override
    public String toString() {
        return super.toString() + " | Páginas: " + numeroPaginas + " | Peso: " + pesoEmKg + "kg";
    }
}
