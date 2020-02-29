package EstudoDeCaso;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Victor Manuel - 1302
 */
public class EstudoDeCaso extends JFrame{
    private JPanel painelTop,painelMid,painelDown;
    public EstudoDeCaso(){
        
        painelTop = new JPanel();
        painelMid = new JPanel();
        painelDown = new JPanel();
        
        setLayout(null);
        
        painelTop.setBackground(new Color(128,0,255));
        painelMid.setBackground(new Color(0,255,255));
        painelDown.setBackground(Color.LIGHT_GRAY);
        
        painelTop.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
        painelTop.setBounds(10,10,705,150);
        add(painelTop);
        
        painelMid.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
        painelMid.setBounds(10,170,705,150);
        add(painelMid);
        
        painelDown.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
        painelDown.setBounds(10,330,705,150);
        add(painelDown);
        
        setTitle("Estudo de Caso");
        setSize(740,560);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        public static void main(String[] args) {
            EstudoDeCaso frame = new EstudoDeCaso();
        }
}
