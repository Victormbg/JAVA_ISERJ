package Exercicio31a52;
import javax.swing.*;
public class Exercicio43 {
    public static void main(String[] args) {
        int codigo; float salario,novoSalario; String aux;
        aux = JOptionPane.showInputDialog("Informe o codigo: ");
        codigo = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Informe o salário: ");
        salario = Float.parseFloat(aux);
        if(codigo==1){
            novoSalario = salario*1.5f;
        }else if(codigo==2){
            novoSalario = salario*1.35f;
        }else if(codigo==3){
            novoSalario = salario*1.2f;
        }else if(codigo==4){
            novoSalario = salario*1.1f;
        }else{novoSalario = salario;}
        JOptionPane.showMessageDialog(null,novoSalario);
    }
}

