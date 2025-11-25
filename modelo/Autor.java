package modelo;

public class Autor {
    // Atributos privados (encapsulamento)
    private String nome;
    private String email;

    // Construtor: usado para criar um autor já com nome e email
    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Métodos GET e SET para acessar e modificar os atributos de forma controlada

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Retorna uma representação em texto do autor
    @Override
    public String toString() {
        return nome + " (" + email + ")";
    }
}
