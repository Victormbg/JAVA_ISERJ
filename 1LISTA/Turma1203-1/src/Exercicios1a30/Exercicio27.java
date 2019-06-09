package Exercicios1a30;
import javax.swing.JOptionPane;
public class Exercicio27 {
    public static void main(String[] args) {
        String aux;
        float numero;
        double quadrado,cubo,RaizQuadrada,RaizCubica;
        aux = JOptionPane.showInputDialog("Informe o numero: ");
        numero = Float.parseFloat(aux);
        quadrado = Math.pow(numero,2);
        cubo = Math.pow(numero,3);
        RaizQuadrada = Math.sqrt(numero);
        RaizCubica = Math.cbrt(numero);
        JOptionPane.showMessageDialog(null,"O quadrado é "+quadrado+
        "\n O cubo é "+cubo+"\n A raiz quadrado é "+RaizQuadrada+"\n O cubo é "+RaizCubica);
    }
}
