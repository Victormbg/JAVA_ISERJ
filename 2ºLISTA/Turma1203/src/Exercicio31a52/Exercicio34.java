package Exercicio31a52;
import javax.swing.*;
public class Exercicio34 {
    public static void main(String[] args) {
        int senha;
        String aux;
        aux = JOptionPane.showInputDialog("Informe sua senha: ");
        senha = Integer.parseInt(aux);    
        
        if(senha==4531){
            JOptionPane.showMessageDialog(null,"Permissão Concedida");
        }else{
            JOptionPane.showMessageDialog(null,"Permissão Negada");
        }
    }
}
