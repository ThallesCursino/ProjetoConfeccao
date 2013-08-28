
package sc.senai.br.model;

/**
 *
 * @author thalles_cardin
 */
public class ProdutoVenda {
    public String nome;
    public int quantidade;
    
    public String toString(){
        return "Nome - "+nome+", Quantidade - "+quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
