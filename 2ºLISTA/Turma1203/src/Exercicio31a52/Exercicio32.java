package Exercicio31a52;
import javax.swing.*;
public class Exercicio32 {
    public static void main(String[] args) {
        float nota1,nota2,nota3,nota4,media;
        String aux;
        aux = JOptionPane.showInputDialog("Informe a primeira nota: ");
        nota1 = Float.parseFloat(aux);    
        aux = JOptionPane.showInputDialog("Informe a segunda nota: ");
        nota2 = Float.parseFloat(aux);    
        aux = JOptionPane.showInputDialog("Informe a terceira nota: ");
        nota3 = Float.parseFloat(aux);    
        aux = JOptionPane.showInputDialog("Informe a quarta nota: ");
        nota4 = Float.parseFloat(aux);    
        
        media = (nota1+nota2+nota3+nota4)/4;
        
        if(media>6){
            JOptionPane.showMessageDialog(null,"Aprovado com media de "+media);
        }else{
            JOptionPane.showMessageDialog(null,"Reprovado");
        }
    }
}
