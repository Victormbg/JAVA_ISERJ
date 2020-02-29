package TestaBotoes;
/**
 *
 * @author Victor Manuel - 1302
 */
import java.awt.event.*;
import javax.swing.*;
public class ButtonHandler implements ActionListener{
    private JButton ok,cancela;

public ButtonHandler(JButton ok, JButton cancela){
    this.ok = ok;
this.cancela = cancela;
}
public void actionPerformed(ActionEvent evento){
    if(evento.getSource()==ok)
        JOptionPane.showMessageDialog(null,"O Botao OK foi clicado");
    if(evento.getSource()==cancela)
        JOptionPane.showMessageDialog(null,"O Botao CANCELA foi clicado");
}
}
