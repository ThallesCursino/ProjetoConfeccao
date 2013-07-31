
package br.senai.sc.model.negocio;

/**
 * Essa classe representa as pessoas do software
 * @version 1.0 31/07/13
 * @author thalles_cardin
 */

public class Pessoa {
    
    private int id;
    private String endereco;
    private String telefone;
    private String dateCadastro;

    public Pessoa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDateCadastro() {
        return dateCadastro;
    }

    public void setDateCadastro(String dateCadastro) {
        this.dateCadastro = dateCadastro;
    }

   
    
    
    
}
