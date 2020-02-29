
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela1 extends JFrame{
   public Janela1(){
    setTitle("JANELA TESTE");
    setVisible(true);
    setDefaultCloseOperation(Janela1.DISPOSE_ON_CLOSE);
    getContentPane().setBackground( Color.yellow);
   }
    public static void main(String[] args) {
        Janela1 j = new Janela1();
        
        j.setLayout(null);
	j.setBounds(0,0,200,200);
        
        JLabel label = new JLabel("OLA MUNDO");
        label.setBounds(0,-88,200,200);
        label.setFont(new Font("Courier New", Font.ITALIC, 20));
        label.setForeground(Color.BLUE);
        j.add(label);
    
    }
}
