
package br.senai.sc.model.negocio;

/**
 * Classe que representa as pessoas juridicas dos sistemas.
 * @version 1.0 31/07/13
 * @author thalles_cardin
 */
public class ClientePJ extends PessoaJuridica{
    
    private double limite;
    private int nrConta;
    private char categoria;
    private int qtVezesCompra;
    private double vlTotalGasto;

    public ClientePJ() {
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNrConta() {
        return nrConta;
    }

    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getQtVezesCompra() {
        return qtVezesCompra;
    }

    public void setQtVezesCompra(int qtVezesCompra) {
        this.qtVezesCompra = qtVezesCompra;
    }

    public double getVlTotalGasto() {
        return vlTotalGasto;
    }

    public void setVlTotalGasto(double vlTotalGasto) {
        this.vlTotalGasto = vlTotalGasto;
    }
    
    
    
}
