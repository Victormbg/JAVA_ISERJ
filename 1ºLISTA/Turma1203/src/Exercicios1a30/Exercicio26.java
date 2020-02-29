package Exercicios1a30;
import javax.swing.JOptionPane;
public class Exercicio26 {
    public static void main(String[] args) {
        float numero,quadrado,cubo;
        String aux;
        aux = JOptionPane.showInputDialog("Informe o numero: ");
        numero = Float.parseFloat(aux);
        quadrado = numero*numero;
        cubo = numero*numero*numero;
        JOptionPane.showMessageDialog(null,"O quadrado é "+quadrado+
        "\n O cubo é "+cubo);
    }
}
