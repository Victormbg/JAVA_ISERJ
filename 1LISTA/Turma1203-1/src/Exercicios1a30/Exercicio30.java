package Exercicios1a30;
import javax.swing.JOptionPane;
public class Exercicio30 {
    public static void main(String[] args) {
        float custoEspetaculo,precoConvite;
        String aux;
        aux = JOptionPane.showInputDialog("Informe o custo do Espetaculo: ");
        custoEspetaculo = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog("Informe o preço do convite: ");
        precoConvite = Float.parseFloat(aux);
        float quantidadeConvite = custoEspetaculo/precoConvite;
        JOptionPane.showMessageDialog(null,"Sera necessario vender "+quantidadeConvite+
        " de convites");
    }
}