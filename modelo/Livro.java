package modelo;

public class Livro extends ItemBiblioteca{


    public Livro(String titulo, Autor autor, Categoria categoria, int anoPublicacao) {
        
        super(titulo, autor, categoria, anoPublicacao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        // Exemplo: multa de R$ 0,50 por dia de atraso
        return diasAtraso * 0.50;
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

    @Override
    public int getPrazoDevolucao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrazoDevolucao'");
    }
}
