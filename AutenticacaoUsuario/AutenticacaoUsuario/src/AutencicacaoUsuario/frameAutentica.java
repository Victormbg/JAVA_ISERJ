package AutencicacaoUsuario;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;
/**
 *
 * @author Victor Manuel - 1302
 */
public class frameAutentica extends JFrame{
private JPanel painel;
private JButton blogin;
private JLabel Nome,Senha;
private JTextField txuser;
private Botao handler;
private JPasswordField pass;
    public frameAutentica(){
        painel = new JPanel();
        txuser = new JTextField();
        pass = new JPasswordField();
        blogin = new JButton("Login");
        Nome = new JLabel("Nome: ");
        Senha = new JLabel("Senha: ");
        
        txuser.setBounds(70,30,150,20);
        pass.setBounds(70,65,150,20);
        Nome.setBounds(20,10,150,60);
        Senha.setBounds(20,45,150,60);
        blogin.setBounds(110,100,80,20);
        
        add(painel);
        painel.add(Nome);
        painel.add(Senha);
        painel.add(pass);
        painel.add(txuser);
        painel.add(blogin);
        
        handler = new Botao(blogin);
        painel.addActionListener(handler);
        add(blogin);
        
        painel.setLayout(null);
        setTitle("Autenticação de Usuário");
        setSize(320,200);
        setVisible(true);
        setLocation(300,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
    
    private void ActionPerformed(java.awt.event.ActionEvent evt) {
       String user = txuser.getText();
       String senha = pass.getText();
       if(user=="teste" && senha=="12345"){
           JOptionPane.showMessageDialog(null, "Autenticacao Válida,Login e Senhas corretos");
       }else{
           JOptionPane.showMessageDialog(null, "Senhas errada ou Nome de Usuário Errado");
       }

}
    
    
    
    public static void main(String[] args) {
        frameAutentica frame = new frameAutentica();
    }
}