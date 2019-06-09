package Exercicio31a52;
import javax.swing.JOptionPane;
public class Exercicio38 {
    public static void main(String[] args) {
        int n1,n2; String aux;
        aux = JOptionPane.showInputDialog("Informe o primeiro número: ");
        n1 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Informe o segundo número: ");
        n2 = Integer.parseInt(aux);
        if(n1>n2){
            JOptionPane.showMessageDialog(null,"O primeiro número que é "+n1+" é o maior número comparado com o segundo número.");
        }else if(n2>n1){
            JOptionPane.showMessageDialog(null,"O segundo número que é "+n2+" é o maior número comparado com o primeiro número.");
        }
    }
}
