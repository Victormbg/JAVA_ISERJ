package JMenus;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMenus extends JFrame {
    private JMenuBar barraMenu;
    private JMenu arquivo, editar;
    private JMenuItem item1, item2, item3;
    private JRadioButtonMenuItem radioMenu1, radioMenu2;
    private JCheckBoxMenuItem checkMenu1, checkMenu2;
    private ButtonGroup grupo;
    
    public JMenus() {
        barraMenu = new JMenuBar();
        arquivo  = new JMenu("Arquivo");
        editar = new JMenu("Editar");
        item1 = new JMenuItem("Novo");
        item2 = new JMenuItem("Salvar");
        item3 = new JMenuItem("Abrir");
        radioMenu1 = new JRadioButtonMenuItem("Português");
        radioMenu2 = new JRadioButtonMenuItem("Inglês");
        checkMenu1 = new JCheckBoxMenuItem("Negrito");
        checkMenu2 = new JCheckBoxMenuItem("Itálico");
        grupo = new ButtonGroup();
        
        barraMenu.add(arquivo);
        barraMenu.add(editar);
        
        arquivo.add(item1);
        arquivo.add(item2);
        arquivo.add(item3);
        editar.add(radioMenu1);
        editar.add(radioMenu2);
        editar.addSeparator();
        editar.add(checkMenu1);
        editar.add(checkMenu2);
        
        grupo.add(radioMenu1);
        grupo.add(radioMenu2);
        
        item1.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_N, ActionEvent.ALT_MASK));
        item1.setIcon(new ImageIcon( getClass().getResource("/figuras_icones//new.png")));
        item2.setIcon(new ImageIcon( getClass().getResource("/figuras_icones//save.png")));
        item3.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_A, ActionEvent.ALT_MASK)); 
        item3.setIcon(new ImageIcon( getClass().getResource("/figuras_icones//procurar.png")));
        radioMenu1.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_P, ActionEvent.ALT_MASK));
        radioMenu1.setIcon(new ImageIcon( getClass().getResource( "/figuras_icones//Brazil.png"))); 
        radioMenu2.setIcon(new ImageIcon( getClass().getResource( "/figuras_icones//United States of America.png"))); 
        checkMenu1.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_N, ActionEvent.CTRL_MASK)); 
        checkMenu2.setIcon(new ImageIcon( getClass().getResource( "/figuras_icones//italico.png"))); 

        setLayout(new BorderLayout());
        setTitle("Menus do Java");
        add(barraMenu);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        JMenus frame = new JMenus();
    }
}