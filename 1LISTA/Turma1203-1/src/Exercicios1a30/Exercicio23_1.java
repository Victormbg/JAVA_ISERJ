package Exercicios1a30;
import javax.swing.JOptionPane;
public class Exercicio23 {
    public static void main(String[] args) {
        String aux;
        aux = JOptionPane.showInputDialog("Informe o valor da base: ");
        float base = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog("Informe o valor da altura: ");
        float altura = Float.parseFloat(aux);
        float area = (base*altura)/2;
        JOptionPane.showMessageDialog(null,"A área é "+area);
    }
}
