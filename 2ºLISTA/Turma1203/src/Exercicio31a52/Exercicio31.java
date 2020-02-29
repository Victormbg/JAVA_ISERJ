package Exercicio31a52;
import javax.swing.*;
public class Exercicio31 {
    public static void main(String[] args) {
        int A,B,C;
        String aux;
        aux = JOptionPane.showInputDialog("Informe o valor A: ");
        A = Integer.parseInt(aux);    
        aux = JOptionPane.showInputDialog("Informe o valor B: ");
        B = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Informe o valor C: ");
        C = Integer.parseInt(aux);
        int soma = A+B+C;
        if(soma<=100){
            JOptionPane.showMessageDialog(null,"O valor da soma é "+soma);
        }
        if(soma>100){
            JOptionPane.showMessageDialog(null,"Operação errada");
        }    
    }
}
