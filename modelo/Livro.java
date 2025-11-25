package modelo;

public class Livro extends ItemBiblioteca{


    public Livro(String titulo, Autor autor, Categoria categoria, int anoPublicacao) {
        
        super(titulo, autor, categoria, anoPublicacao);
    }

    @Override
    public int getPrazoDevolucao() {
        return 14; // prazo padrão de 14 dias para livros
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        // Exemplo: multa de R$ 0,50 por dia de atraso
        return diasAtraso * 0.50;
    }   

    @Override
    public String getDetalhes() {
        return "Tipo: Livro | Prazo: " + getPrazoDevolucao() + " dias";
    }

    // Método que pode ser sobrescrito pelas subclasses (LivroDigital/LivroFisico)
    public String getTipo() {
        return "Livro";
    }
}
