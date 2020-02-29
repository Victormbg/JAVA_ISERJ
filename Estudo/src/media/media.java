package media;

import javax.swing.JOptionPane;
public class media {

    public static void main(String[] args) {
        float n1,n2,n3,n4,media;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a primeira nota: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a segunda nota: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a terceira nota: "));
        n4 = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a quarta nota: "));
        
        media =(n1+n2+n3+n4)/2;
        
        if(media>=7){
            JOptionPane.showMessageDialog(null,"O aluno tirou nos bimentres :"+
                    "\nPrimeira nota: "+n1
                    +"\nPrimeira nota: "+n2
                    +"\nPrimeira nota: "+n3
                    +"\nPrimeira nota: "+n4
                    +"\nestá com média: "+media+" o aluno está aprovado");
        }else{
            JOptionPane.showMessageDialog(null,"O aluno tirou nos bimentres :"+
                    "\nPrimeira nota: "+n1
                    +"\nPrimeira nota: "+n2
                    +"\nPrimeira nota: "+n3
                    +"\nPrimeira nota: "+n4
                    +"\nestá com média: "+media+" o aluno está reprovado");
        }
    }
}
