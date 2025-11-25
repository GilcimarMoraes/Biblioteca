package modelo;

public interface Emprestavel {

        // Método para emprestar o item
    void emprestar(String usuario);
    
    // Método para devolver o item
    void devolver();
    
    // Verifica se o item está disponível para empréstimo
    boolean isDisponivel();
    
    // Obtém o prazo de devolução em dias
    int getPrazoDevolucao();
    
    // Calcula multa por atraso
    double calcularMulta(int diasAtraso);
    
}
