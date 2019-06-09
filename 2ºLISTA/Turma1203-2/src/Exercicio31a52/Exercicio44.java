package Exercicio31a52;
import javax.swing.*;
public class Exercicio44 {
    public static void main(String[] args) {
        int opcao; String aux;
        aux = JOptionPane.showInputDialog("Informe a opcao: ");
        opcao = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Informe o salario: ");
        float salario = Float.parseFloat(aux);
        if(opcao==1){
        float imposto=0;
        if(salario<500) {imposto=salario*0.05f;}
        if(salario<850) {imposto=salario*0.15f;}
        if(salario>=500 && salario<=850) {imposto=salario*0.10f;}
        JOptionPane.showMessageDialog(null,"Imposto "+imposto);
        }else if(opcao==2){
         float novoSalario=0;
         if(salario>1500){novoSalario=salario+25;}
         if(salario>=750 && salario<=1500){novoSalario=salario+50;}
         if(salario>=450 && salario<=7500){novoSalario=salario+75;}
         if(salario<450){novoSalario=salario+100;}
         JOptionPane.showMessageDialog(null,"Novo Salario de "+novoSalario);
        }else if(opcao==3){
        if(salario<=700){JOptionPane.showMessageDialog(null,"Mal remunerado");}    
        else{JOptionPane.showMessageDialog(null,"Bem remunerado");}
        }else{JOptionPane.showMessageDialog(null,"Opção Inválida");}
    }
}

