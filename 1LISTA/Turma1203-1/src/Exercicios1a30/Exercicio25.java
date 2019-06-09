package Exercicios1a30;
import javax.swing.JOptionPane;
public class Exercicio25 {
    public static void main(String[] args) {
    String aux;
    float raio;
    double area;
    aux = JOptionPane.showInputDialog("Informe o raio: ");
    raio = Float.parseFloat(aux);
    area = Math.PI*raio*raio;
    JOptionPane.showMessageDialog(null,"O valor da area é "+area);
    }
}
