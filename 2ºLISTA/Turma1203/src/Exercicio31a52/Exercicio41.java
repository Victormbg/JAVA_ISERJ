package Exercicio31a52;
import javax.swing.*;
public class Exercicio41 {
    public static void main(String[] args) {
        int A;
        String aux;
        aux = JOptionPane.showInputDialog("Informe o valor de A: ");
        A = Integer.parseInt(aux);    
        
        if(A%2==0){
            JOptionPane.showMessageDialog(null,"Número par");
        }else{
            JOptionPane.showMessageDialog(null,"Número ímpar");
        }
    }
}
