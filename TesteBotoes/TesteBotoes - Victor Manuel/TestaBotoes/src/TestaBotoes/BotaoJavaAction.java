package TestaBotoes;
/**
 *
 * @author Victor Manuel - 1302
 */
import java.awt.*;
import javax.swing.*;
public class BotaoJavaAction extends JFrame{
    private JButton ok = new JButton("OK");
    private JButton cancela = new JButton("Cancela");
    private ButtonHandler handler;
public BotaoJavaAction(){
    setTitle("Criando Botões");
    setLayout(new FlowLayout());
    //setLocationReativeTo(null);
    setLocation(500,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(350,90);
    setVisible(true);
    handler = new ButtonHandler(ok,cancela);
    ok.addActionListener(handler);
    add(ok);
    cancela.addActionListener(handler);
    add(cancela);
}
}
