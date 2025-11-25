package modelo;

public class Revista extends ItemBiblioteca{

    private int numeroEdicao;
    private String issn;

    public Revista( String titulo, Autor autor, Categoria categoria, int anoPublicacao, int numeroEdicao, String issn) {
        super(titulo, autor, categoria, anoPublicacao);
        this.numeroEdicao = numeroEdicao;
        this.issn = issn;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public String getIssn() {
        return issn;
    }

    @Override
    public int getPrazoDevolucao() {
        return 7; // Prazo de devolução padrão para revistas
    }

    @Override
    public double calcularMulta( int diasAtraso) {
        return diasAtraso * 0.20; //Multa menor para revistas
    }

    public String getDetalhes() {
        return "Tipo: Revista: | Edição: " + numeroEdicao + " | ISSN: " + issn + " | Prazo Devolução: " + getPrazoDevolucao() + " dias"; 
    }

    @Override
    public String getTipo() {
        return "Revista";
    }

    @Override
    public String toString() {
        return super.toString() + " | Edição: " + numeroEdicao + " | ISSN: " + issn;
    }
}
