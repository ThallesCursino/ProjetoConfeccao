
package sc.senai.br.model;

/**
 *
 * @author thalles_cardin
 */
public class PedidoVenda {

        
    public int codigo;
    public int numero;
    public String cliente;
    public String dataCadastro;
    public String dataEntrega;
    public double valorTotal;
    public String formaPagamento;
    public String prazoEntrega;
    public String transportadoraResponsavel;
    public String notaFiscal;
    
    @Override
    public String toString(){
        return "Código - "+codigo+", Número - "+numero+", Cliente - "+cliente+", Data de cadastro - "+dataCadastro+", Data de entrega - "+dataEntrega+", Valor Total - "+valorTotal+", Forma de pagamento - "+formaPagamento+", Prazo de entrega - "+prazoEntrega+", Transportadora Responsável - "+transportadoraResponsavel+", Nota fiscal - "+notaFiscal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public String getTransportadoraResponsavel() {
        return transportadoraResponsavel;
    }

    public void setTransportadoraResponsavel(String transportadoraResponsavel) {
        this.transportadoraResponsavel = transportadoraResponsavel;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    
    
}