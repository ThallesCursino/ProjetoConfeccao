
package br.senai.sc.model.negocio;

/**
 * Classe que representa clientes físicos do software
 * @Version 1.0 31/07/13
 * @author thalles_cardin
 */
public class ClientePF extends PessoaFisica{
    
    private double nrConta;
    private double limiteCompra;
    private char categoria;
    private int qtVezesCompra;
    private double vlTotalGasto;

    public ClientePF() {
    }

    public double getNrConta() {
        return nrConta;
    }

    public void setNrConta(double nrConta) {
        this.nrConta = nrConta;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
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
