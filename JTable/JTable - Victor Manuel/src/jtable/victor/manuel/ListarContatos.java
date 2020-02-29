package jtable.victor.manuel;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class ListarContatos extends JFrame {
    JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;
    Object [ ][ ] dados = {
    {"Ana Monteiro", "(48)9923-7898", "ana.monteiro@gmail.com","RJ"},
    {"João da Silva", "(48)8890-3345", "joaosilva@hotmail.com","MG"},
    {"Pedro Cascaes", "(48)9870-5634", "pedrinho@gmail.com","SP"},
    {"Luis Souza", "(21)5555-7777", "luissouza@gmail.com","RJ"},
    {"Maria das Dores", "(31)6666-5555", "mariadasdores@gmail.com","MG"},
    {"José Antunes","(21)3333-0012","jantunes@gmail.com","SP"}
    };
    
    String [ ] colunas = {"Nome", "Telefone", "Email","Cidade"};
    
    public ListarContatos() {
        super ("Lista de Contatos");
    }
    
    public void criaJanela(){
        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(1, 1));
        tabela = new JTable(dados, colunas);
        barraRolagem = new JScrollPane(tabela);
        painelFundo.add(barraRolagem);
        getContentPane().add(painelFundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650, 130);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        ListarContatos lc = new ListarContatos();
        lc.criaJanela();
    }
}
