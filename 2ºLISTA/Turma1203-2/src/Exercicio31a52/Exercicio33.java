package Exercicio31a52;
import javax.swing.*;
public class Exercicio33 {
    public static void main(String[] args) {
        float A,B;
        String aux;
        aux = JOptionPane.showInputDialog("Informe o valor de A: ");
        A = Float.parseFloat(aux);    
        aux = JOptionPane.showInputDialog("Informe o valor de B: ");
        B = Float.parseFloat(aux);    
        
        if(A>B){
            JOptionPane.showMessageDialog(null,"O valor de A maior que B");
        }else if(A<B){
            JOptionPane.showMessageDialog(null,"O valor de B maior que A");
        }else if(A==B){
            JOptionPane.showMessageDialog(null,"São valores iguais");
        }
    }
}
