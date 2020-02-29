package Exercicios1a30;
import javax.swing.JOptionPane;
public class Exercicio21 {
    public static void main(String[] args) {
        String aux;
        aux = JOptionPane.showInputDialog("Informe o salário: ");
        float salario = Float.parseFloat(aux);
        float salarioLiquido = salario - salario*0.10f+50f;
        JOptionPane.showMessageDialog(null,"O salário liquido é "+salarioLiquido);
    }
}
