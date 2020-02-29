package jpasswordfieldjava;
import javax.swing.*;
/**
 *
 * @author Victor Manuel - 1302
 */
public class JPasswordFieldJava extends JFrame {
    private final JPasswordField pass;
    private JLabel label;

    public JPasswordFieldJava(){
        pass = new JPasswordField(10);
        setLayout(new java.awt.FlowLayout());
        label = new JLabel("Digite Sua Senha:");
        add(label);
        add(pass);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        JPasswordFieldJava frame = new JPasswordFieldJava();
    }
}