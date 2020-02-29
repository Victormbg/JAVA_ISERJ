package Exercicio31a52;
import javax.swing.*;
public class Exercicio36 {
    public static void main(String[] args) {
        int idade;
        String aux;
        aux = JOptionPane.showInputDialog("Informe a idade: ");
        idade = Integer.parseInt(aux);    
        if(idade>=5 && idade<=7){
             JOptionPane.showMessageDialog(null,"Sua categoria é Infatil");
         }else if(idade>=8 && idade<=10){
             JOptionPane.showMessageDialog(null,"Sua categoria é Juvenil");
         }else if(idade>=11 && idade<=15){
             JOptionPane.showMessageDialog(null,"Sua categoria é Adolescente");
         }else if(idade>=16 && idade<=30){
             JOptionPane.showMessageDialog(null,"Sua categoria é Adulto");
         }else if(idade>30){
             JOptionPane.showMessageDialog(null,"Sua categoria é Senior");
         }else{
             JOptionPane.showMessageDialog(null,"Você nao posuil idade para nadar");
         }
    }
}
