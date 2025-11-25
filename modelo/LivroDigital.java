package modelo;

public class LivroDigital extends Livro {
    private double tamanhoEmMb; // tamanho do arquivo em MB
    private String formato;     // ex: PDF, EPUB, MOBI

    public LivroDigital(String titulo,
                        Autor autor,
                        Categoria categoria,
                        int anoPublicacao,
                        double tamanhoEmMb,
                        String formato) {

        // chama o construtor da superclasse (Livro)
        super(titulo, autor, categoria, anoPublicacao);
        this.tamanhoEmMb = tamanhoEmMb;
        this.formato = formato;
    }

    public double getTamanhoEmMb() {
        return tamanhoEmMb;
    }

    public String getFormato() {
        return formato;
    }

    // Sobrescreve o método da classe mãe para identificar o tipo
    @Override
    public String getTipo() {
        return "Livro Digital";
    }

    // Opcional: sobrescrever toString para incluir os novos dados
    @Override
    public String toString() {
        return super.toString() + " | Tamanho: " + tamanhoEmMb + "MB | Formato: " + formato;
    }
}
