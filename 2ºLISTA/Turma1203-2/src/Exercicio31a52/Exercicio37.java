package Exercicio31a52;
import javax.swing.*;
public class Exercicio37 {
    public static void main(String[] args) {
        float nota1,nota2,nota3,media,notaExame;
        String aux;
        aux = JOptionPane.showInputDialog("Informe a primeira nota: ");
        nota1 = Float.parseFloat(aux);    
        aux = JOptionPane.showInputDialog("Informe a segunda nota: ");
        nota2 = Float.parseFloat(aux);    
        aux = JOptionPane.showInputDialog("Informe a terceira nota: ");
        nota3 = Float.parseFloat(aux);    
        
        media = (nota1+nota2+nota3)/3;
        
        if(media<=3){
             JOptionPane.showMessageDialog(null,"Reprovado");
         }else if(media>=7){
             JOptionPane.showMessageDialog(null,"Aprovado");
         }else{
             aux = JOptionPane.showInputDialog("Informe a nota do Exame: ");
             notaExame = Float.parseFloat(aux);
             if(media+notaExame>=12){
                JOptionPane.showMessageDialog(null,"Aprovado"); 
             }else{
                JOptionPane.showMessageDialog(null,"Reprovado");
             }
         }
    }
}
