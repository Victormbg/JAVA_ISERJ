package GridLayout;
/**
 *
 * @author Victor Manuel - 1302
 */
import java.awt.*;
import javax.swing.*;
public class GridLayout extends JFrame{
    private JButton norte,sul,leste,oeste,centro;
    public GridLayout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        norte = new JButton("Norte");
        sul = new JButton("Sul");
        leste = new JButton("Leste");
        oeste = new JButton("Oeste");
        Container container = getContentPane();
        
        container.setLayout(new java.awt.GridLayout(2,2));
        
        container.add(norte);
        container.add(oeste);
        container.add(leste);
        container.add(sul);
        
        setTitle("GridLayout");
        pack();
        setVisible(true);
    }
public static void main(String[] args) {
    GridLayout frame = new GridLayout();
}
}
