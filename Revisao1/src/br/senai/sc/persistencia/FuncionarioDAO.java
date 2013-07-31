
package br.senai.sc.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que guarda as informações referentes aos funcionarios
 * @version 1.0 31/07/13
 * @author thalles_cardin
 */
public class FuncionarioDAO {
    
    private List<Funcionario> funcionario = new ArrayList<>();
    
    
    public void adicionar(Funcionario f){
        funcionario.add(f);
        JOptionPane.showMessageDialog(null, "Funcionario"
                + "Adicionado com sucesso!");
    }
}
