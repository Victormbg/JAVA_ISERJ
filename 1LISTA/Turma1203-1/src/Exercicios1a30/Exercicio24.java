package Exercicios1a30;
import javax.swing.JOptionPane;
public class Exercicio24 {
    public static void main(String[] args) {
        String aux;
        float raio;
        aux = JOptionPane.showInputDialog("Informe o valor do raio: ");
        raio = Float.parseFloat(aux);
        double comprimento = 2*raio*Math.PI;
        JOptionPane.showMessageDialog(null,"O comprimento da circuferencia é "+comprimento);
    }
}
