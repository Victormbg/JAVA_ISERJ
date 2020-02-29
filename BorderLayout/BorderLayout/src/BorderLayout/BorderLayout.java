package BorderLayout;
/**
 *
 * @author Victor Manuel - 1302
 */
import java.awt.*;
import javax.swing.*;
public class BorderLayout extends JFrame{
    private JButton norte,sul,leste,oeste,centro;
    public BorderLayout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        norte = new JButton("Norte");
        sul = new JButton("Sul");
        leste = new JButton("Leste");
        oeste = new JButton("Oeste");
        centro = new JButton("Centro");
        Container container = getContentPane();
        
        container.setLayout(new java.awt.BorderLayout());
        
        container.add(norte, java.awt.BorderLayout().NORTH);
        container.add(oeste,java.awt.BorderLayout().WEST);
        container.add(centro,java.awt.BorderLayout().CENTER);
        container.add(leste,java.awt.BorderLayout().EAST);
        container.add(sul,java.awt.BorderLayout().SOUTH);
        
        setTitle("BorderLayout");
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        BorderLayout frame = new BorderLayout();
    }
}
