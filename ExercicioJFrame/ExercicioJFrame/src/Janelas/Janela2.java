package Janelas;
/**
 *
 * @author Victor Manuel - 1302
 */
import java.awt.*;
import javax.swing.*;
public class Janela2 extends JFrame{
    JButton b1;
    public Janela2(){
        setTitle("Janela Teste 2");
        setSize(560,260);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        b1 = new JButton("Botão 1");
        add(b1);       
        setVisible(true);
    }
    public static void main(String[] args) {
        Janela2 j2 = new Janela2();
    }
}
