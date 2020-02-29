package FlowLayout;
/**
 *
 * @author Victor Manuel - 1302
 */
import java.awt.*;
import javax.swing.*;

public class FlowLayout extends JFrame{
    private JButton norte,sul,leste,oeste;
    public FlowLayout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        norte = new JButton("Norte");
        sul = new JButton("Sul");
        leste = new JButton("Leste");
        oeste = new JButton("Oeste");
        Container container = getContentPane();
        
        container.setLayout(new java.awt.FlowLayout());
        
        container.add(norte);
        container.add(oeste);
        container.add(leste);
        container.add(sul);
        
        setTitle("FlowLayout");
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        FlowLayout frame = new FlowLayout();
    }    
}