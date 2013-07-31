package br.senai.sc.view;

import javax.swing.JOptionPane;

/**
 * Classe que controla toda a parte visual de aplicação
 *
 * @author thalles_cardin
 */
public class JanelaPrincipal {

    public void mostraMenu() {
        int opcao = 0;

        do {
            opcao = integer.parteInt(JOptionPane.showInputDialog("Iforme a opção:"
                    + "\n1 - funcionario"
                    + "\n2 - cliente"
                    + "\n3 - fornecedor"
                    + "\n4 - transportadora"
                    + "\n5 - Sair"));
        }
        
        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
        }
    }
}
