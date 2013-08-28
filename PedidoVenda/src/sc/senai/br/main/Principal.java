package sc.senai.br.main;



import sc.senai.br.model.PedidoVenda;
import sc.senai.br.model.ProdutoVenda;

/**
 *
 * @author thalles_cardin
 */
public class Principal {

    public static void main(String[] args) {
        
        PedidoVenda p1 = new PedidoVenda();
        p1.codigo = 33;
        p1.numero = 13;
        p1.cliente = "13/08/13";
        p1.dataCadastro = "Débito";
        p1.dataEntrega = "16/08/13";
        p1.valorTotal = 120.0;
        p1.formaPagamento = "Débito";
        p1.prazoEntrega = "Em espera";
        p1.transportadoraResponsavel = "Exemplo";
        p1.notaFiscal = "16548";
        System.out.println(p1.toString());
        
        ProdutoVenda p2 = new ProdutoVenda();
        p2.nome = "Mouse Pad";
        p2.quantidade = 10;
        System.out.println(p2);
        
    }
    
}
