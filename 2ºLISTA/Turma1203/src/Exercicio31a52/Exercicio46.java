package Exercicio31a52;
import javax.swing.*;
public class Exercicio46 {
    public static void main(String[] args) {
        int A,B,C;float delta; String aux;
        aux = JOptionPane.showInputDialog("Informe o valor de A: ");
        A = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Informe o valor de B: ");
        B = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Informe o valor de C: ");
        C = Integer.parseInt(aux);
        delta = B*B-4*A*C;
        if(delta<0){JOptionPane.showMessageDialog(null,"Não existem soluções.");}
        if(delta==0){
            double x = ((-1)*B)/(2*A);
            JOptionPane.showMessageDialog(null,"A raiz é "+x);
        }else if(delta>0){
            double x1 = ((-1)*B-Math.sqrt(delta))/(2*A);
            double x2 = ((-1)*B-Math.sqrt(delta))/(2*A);
            JOptionPane.showMessageDialog(null,"A raiz de 1 é "+x1+"\nA raiz de 2 é "+x2);
        }
    }
}

