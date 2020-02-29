package Exercicios1a30;
import javax.swing.JOptionPane;
public class Exercicio28 {
    public static void main(String[] args) {
        float base,expoente;
        double valor;
        String aux;
        aux = JOptionPane.showInputDialog("Informe a base: ");
        base = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog("Informe o expoente: ");
        expoente = Float.parseFloat(aux);
        valor = Math.pow(base,expoente);
        JOptionPane.showMessageDialog(null,"O valor é "+valor);
    }
}