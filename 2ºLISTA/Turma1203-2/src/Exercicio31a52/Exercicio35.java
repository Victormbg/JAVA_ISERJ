package Exercicio31a52;
import javax.swing.*;
public class Exercicio35 {
    public static void main(String[] args) {
        int idade;
        String aux;
        aux = JOptionPane.showInputDialog("Informe a idade: ");
        idade = Integer.parseInt(aux);    
         if(idade>18){
             JOptionPane.showMessageDialog(null,"Você é maior de idade voce possui "+idade);
         }else{
             JOptionPane.showMessageDialog(null,"Você é menor de idade voce possui "+idade);
         }
    }
}
