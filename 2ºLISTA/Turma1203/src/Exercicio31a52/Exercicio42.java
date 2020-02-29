package Exercicio31a52;
import javax.swing.*;
public class Exercicio42 {
    public static void main(String[] args) {
        int opcao;String aux;
        aux = JOptionPane.showInputDialog("Informe a opção: ");
        opcao = Integer.parseInt(aux);
        if(opcao==1){
            int n1,n2;
            aux = JOptionPane.showInputDialog("Informe o primeiro numero: ");
            n1 = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("Informe o segundo numero: ");
            n2 = Integer.parseInt(aux);
            JOptionPane.showMessageDialog(null,(n1+n2));
        }else if(opcao==2){
            int n;
            aux = JOptionPane.showInputDialog("Informe o numero: ");
            n = Integer.parseInt(aux);
            JOptionPane.showMessageDialog(null,Math.sqrt(n));
        }else{
            JOptionPane.showMessageDialog(null,"Opção Inválida");
        }
    }
}
