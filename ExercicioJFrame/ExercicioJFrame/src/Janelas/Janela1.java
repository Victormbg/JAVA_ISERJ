package Janelas;
/**
 *
 * @author Victor Manuel - 1302
 */
import java.awt.*;
import javax.swing.*;
public class Janela1 extends JFrame{
    public Janela1(){
        setTitle("Janela Teste");
        setSize(560,260);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        Janela1 j1 = new Janela1();
    }
}
