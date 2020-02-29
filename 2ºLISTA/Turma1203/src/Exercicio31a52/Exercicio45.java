package Exercicio31a52;
import javax.swing.*;
public class Exercicio45 {

    public static void main(String[] args) {
        String aux;
        float salario,bonificacao,auxilioEscola,novoSalario;
        aux = JOptionPane.showInputDialog("Informe o sálario: ");
        salario = Float.parseFloat(aux);
        if(salario<=500){
        bonificacao =salario*0.05f;
        }
        if(salario>=500&&salario<=1200){
        bonificacao =salario*0.12f;
        }
        if(salario>1200){
        JOptionPane.showMessageDialog(null, "nao tem");;
        }
    }
}
