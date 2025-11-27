package modelo;

import java.time.LocalDate;

public interface Catalogavel {

    /**
     * Retorna o código único de catálogo (ID sequencial)
     * @return número inteiro único representando o ID do item
     */
    int getCodigoCatalogo();
    
    /**
     * Retorna a data de cadastro do item no sistema
     * @return LocalDate com a data de registro
     */
    LocalDate getDataCadastro();

}
