package ComboBoxActionListener;
/**
 *
 * @author Victor Manuel - 1302
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComboBoxActionListener extends JFrame{
    public ComboBoxActionListener(){
        setSize(300,300);
        setLocation(400,400);
        setTitle("Selecione seu Time");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        String[]times = new String[]{"Flamengo","Fluminense","Vasco","Botafogo","Bangu"};
        JComboBox comboBox = new JComboBox <String>(times);
        comboBox.setEditable(false);
        
        comboBox.addActionListener(new ActionListener(){
          public  void actionPerformed(ActionEvent event){
              JComboBox comboBox = (JComboBox)event.getSource();
              Object selecionado = comboBox.getSelectedItem();
              JOptionPane.showMessageDialog(null,"O Item da ComboBox selecionado foi = "+selecionado);
          }
          });
        add(comboBox);
        setVisible(true);
    }
    public static void main(String[] args) {
      ComboBoxActionListener comboboxdemo = new ComboBoxActionListener();  
    }
}
