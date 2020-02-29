package JList;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Victor Manuel - 1302
 */
public class JListJava extends JFrame{
    private JList lista;
    private String itensLista[]={"feijao","arroz","macarrao","leite","biscoito"
    ,"Farinha","Ovos"};
    private JPanel painel;
    private JScrollPane listPane;
    
    public JListJava(){
        painel = new JPanel();
        painel.setLayout(new java.awt.FlowLayout());
        lista = new JList(itensLista);
        listPane = new JScrollPane(lista);
        lista.setVisibleRowCount(4);
    
        painel.add(listPane);
        add(painel);
        setTitle("JListaJava");
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    public static void main(String[] args) {
        JListJava frame = new JListJava();
    }
}
