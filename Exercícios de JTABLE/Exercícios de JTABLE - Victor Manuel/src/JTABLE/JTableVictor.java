package JTABLE;
import javax.swing.*;
/**
 *
 * @author Victor Manuel - 13092
 */
public class JTableVictor extends JFrame {
    JTable tabelaFunc;
    JScrollPane Scroll;
    
    public JTableVictor() {
        tabelaFunc = new JTable(new Object[][] {
            {"1","Pedro","5000"},
            {"2","Maria","3000"},
            {"3","Larissa","560"},
            {"4","Joaquim","10000"},
            {"5","Jose","300"},
            {"6","Mario","455"}, 
            {"7","Luisa","1500"}, 
            {"8","Rita","2000"},
            {"9","Alfredo","2100"},
            {"10","Jair","380"}}, 
        new String[] 
        {"RG","Nome","Salário"});
        
        Scroll = new JScrollPane(tabelaFunc);
        setSize(300, 200);
        tabelaFunc.setBounds(30,40,200,300);
        add(Scroll);
        setTitle("Tabela de Salários de Funcionários");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTableVictor();
    }
}