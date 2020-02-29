package radiobuttonitemlistener1;
/**
 *
 * @author Victor Manuel - 1302
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class radiobuttonitemlistener1 extends JFrame{
    private JRadioButton Flamengo, Vasco;
    private JLabel meuLabel;
    private ButtonGroup grupo1;
    private RadioButtonOpcao opt;
    
    private class RadioButtonOpcao implements ItemListener{
        public void itemStateChanged(ItemEvent event) {
            if(Flamengo.isSelected())
                JOptionPane.showMessageDialog(null, "Parabens, voce escolheu o Flamengo");
            if(Vasco.isSelected())
                JOptionPane.showMessageDialog(null, "Parabens, voce escolheu o Vasco");
        }
    }
        
    public radiobuttonitemlistener1() {
        setTitle("Botões de Radio com ItemListener");
        setSize(600,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        meuLabel = new JLabel("Qual o melhor time do Campeonato?");
        Flamengo = new JRadioButton("Flamengo", false);
        Vasco = new JRadioButton("Vasco", false);
        grupo1 = new ButtonGroup();
        opt = new RadioButtonOpcao();
        
        add(meuLabel);
        add(Flamengo);
        add(Vasco);
        grupo1.add(Flamengo);
        grupo1.add(Vasco);
        
        Flamengo.addItemListener(opt);
        Vasco.addItemListener(opt);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        radiobuttonitemlistener1 radioItemListener = new radiobuttonitemlistener1();
    }
}


    