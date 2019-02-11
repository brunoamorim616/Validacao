package validacao;

import javax.swing.JFrame;

public class Validacao {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Calculadora de IMC");
        CadastroClientes painelCadastro = new CadastroClientes();
        
        //Define atributos da TELA
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setSize(400, 320);
        janela.add(painelCadastro);
        janela.setVisible(true); 
    }
    
}
