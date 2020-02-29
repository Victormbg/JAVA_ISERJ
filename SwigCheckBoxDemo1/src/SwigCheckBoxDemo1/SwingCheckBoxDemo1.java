package SwigCheckBoxDemo1;
/**
 *
 * @author Victor Manuel - 1302
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingCheckBoxDemo1 extends JFrame{
    private JCheckBox checkboxUm = new JCheckBox("100");
    private JCheckBox checkboxDois = new JCheckBox("200");
    private JCheckBox checkboxTres = new JCheckBox("300");
    private JLabel labelSoma = new JLabel("Soma");
    private JTextField textFieldSoma = new JTextField(10);
    private int soma =0;
    public SwingCheckBoxDemo1(){
        super("Programa Swing JCheckBox Demo");
        setLayout(new FlowLayout());
        add(checkboxUm);
        add(checkboxDois);
        add(checkboxTres);
        add(labelSoma);
        add(textFieldSoma);
        ActionListener actionListener = new ActionHandler();
        checkboxUm.addActionListener(actionListener);
        checkboxDois.addActionListener(actionListener);
        checkboxTres.addActionListener(actionListener);
        setSize(500,90);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    class ActionHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JCheckBox checkbox = (JCheckBox)event.getSource();
            if(checkbox.isSelected()){
                if(checkbox==checkboxUm){
                    soma+= 100;
                }else if(checkbox==checkboxDois){
                    soma+= 200;
                }else if(checkbox==checkboxTres){
                    soma+= 300;
                }
            }else{
                if(checkbox==checkboxUm){
                    soma-= 100;
                }else if(checkbox==checkboxDois){
                    soma-= 200;
                }else if(checkbox==checkboxTres){
                    soma-= 300;
                }
            }
            textFieldSoma.setText(String.valueOf(soma));
        }
    }   
    public static void main(String[] args) {
        SwingCheckBoxDemo1 checkBox_acoes = new SwingCheckBoxDemo1();
    }
}
