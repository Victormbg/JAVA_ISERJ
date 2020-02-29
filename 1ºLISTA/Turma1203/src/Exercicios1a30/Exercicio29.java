package Exercicios1a30;
import javax.swing.JOptionPane;
public class Exercicio29 {
    public static void main(String[] args) {
        int anoNascimento,anoAtual ;
        String aux;
        aux = JOptionPane.showInputDialog("Informe o ano de Nascimento: ");
        anoNascimento = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Informe o ano Atual: ");
        anoAtual = Integer.parseInt(aux);
        int idadeAtual = anoAtual - anoNascimento;
        int idade2050 = 2050 - anoNascimento;
        JOptionPane.showMessageDialog(null,"A sua idade atual é "+idadeAtual+
        "\nA sua idade em 2050 é "+idade2050);
    }
}