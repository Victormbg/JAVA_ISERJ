package EstudoEeCaso;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 *
 * @author Victor Manuel - 1302
 */
public class EstudoCaso extends JFrame {
private JPanel painelTop, painelMid, painelDown;
private JButton salvar, procurar, alterar, deletar, sair;
private JLabel nome, endereco, bairro, cidade, email, sexo, escolaridade,
        areasAtuacao, pretensaoSalarial, cargoDesejavel, estado;
private JTextField nomeText, enderecoText, bairroText, cidadeText,emailText;
private JTextArea areaTexto;
private JRadioButton feminino, masculino;
private ButtonGroup grupoSexo,grupoLAF;
private JComboBox comboEstados, comboEscolaridade,comboPretensaoSalarial,
        comboCargoDesejavel,comboAreasAtuacao;
private Object itensEstadosCombo[]={"AC","AL","AP","AM","BA","CE","DF","ES"
        ,"DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RR","RO",
        "RJ","RN","RS","SC","SP","SE","TO"};
private Object itensPretensaoSalarial[] = {"500,00","750,00","1000,00","1500,00",
"2000,00","2500,00","3000,00","3500,00","4000,00","4500,00","5000,00",
"Acima de 5000,00"};
private Object itensEscolaridade[] = {"Fundamental incompleto","Fundamental"
,"Média Incompleto","Média","Técnico","Superior Incompleto","Superior",
"Pós-Graduação","Nenhum dos Acima"};
private Object itensCargoDesejavel[] = {"Assistente","Supervisor","Gerente"
,"Diretor","Analista","Programador","Redator","Revisor","Auxiliar","Técnico",
"Especialista","Coordenador","Chefe de Departamento"};
private Object itensAreasAtuacao[] = {"Autônomo","Agrária","Administração"
,"Artísticas","Cálculo","Ciências Biológicas","Ciências Físicas","Literárias",
"Percursivas","Sociais","Outras"};    
private JMenuBar barraMenu;
private JMenuItem itemNovo, itemProcurar,itemSalvar,itemAlterar,itemDeletar,itemSair,itemSobre,itemHelp;
private JRadioButtonMenuItem radioMotif, radioWindows, radioMetal;
private JCheckBoxMenuItem checkNegrito, checkItalico;
private Border bordaPainelTop, bordaPainelMid, bordaPainelDown;
private JMenu arquivo, editar, sobre, texto, aparencia;

public EstudoCaso(){
        painelTop = new JPanel();
        painelMid = new JPanel();
        painelDown = new JPanel();
        salvar = new JButton("Salvar");
        procurar = new JButton("Procurar");
        alterar = new JButton("Alterar");
        deletar = new JButton ("Deletar");
        sair = new JButton ("Sair");
        nome = new JLabel("Nome");
        endereco = new JLabel("Endereço");
        bairro = new JLabel("Bairro");
        cidade = new JLabel("Cidade");
        email   = new JLabel("E-mail");
        sexo    = new JLabel("Sexo");
        escolaridade = new JLabel("Escolaridade");
        areasAtuacao = new JLabel("Áreas de Atuação");
        pretensaoSalarial = new JLabel("Pretensão Salarial");
        cargoDesejavel = new JLabel("Cargo Desejado"); 
        estado = new JLabel("Estado");
        nomeText = new JTextField();
        enderecoText = new JTextField();
        bairroText = new JTextField();
        cidadeText = new JTextField();
        emailText = new JTextField();
        areaTexto= new JTextArea(7, 62);
        JScrollPane barraRolagem = new JScrollPane(areaTexto);
        feminino = new JRadioButton("Feminino");
        masculino = new JRadioButton("Masculino");
        grupoSexo = new ButtonGroup();
        grupoLAF = new ButtonGroup();
        comboEstados = new JComboBox(itensEstadosCombo);
        comboAreasAtuacao = new JComboBox(itensAreasAtuacao);
        comboCargoDesejavel = new JComboBox(itensCargoDesejavel);
        comboEscolaridade = new JComboBox(itensEscolaridade);
        comboPretensaoSalarial = new JComboBox(itensPretensaoSalarial);
        barraMenu = new JMenuBar();
        arquivo = new JMenu("Arquivo");
        editar = new JMenu("Editar");
        sobre = new JMenu("Sobre");
        texto = new JMenu("Textos");
        aparencia = new JMenu("Aparencia");
        itemNovo = new JMenuItem("Novo");
        itemSalvar = new JMenuItem("Salvar");
        itemProcurar = new JMenuItem("Procurar");
        itemDeletar = new JMenuItem("Deletar");
        itemAlterar = new JMenuItem("Alterar");
        itemSair = new JMenuItem("Sair");
        itemHelp = new JMenuItem("Ajuda");
        itemSobre = new JMenuItem("Sobre");
        radioMetal = new JRadioButtonMenuItem("Metal(Padrão)");
        radioMotif = new JRadioButtonMenuItem("Motif");
        radioWindows = new JRadioButtonMenuItem("Windows");
        checkNegrito = new JCheckBoxMenuItem("Negrito");
        checkItalico = new JCheckBoxMenuItem("Italico");
        bordaPainelTop = BorderFactory.createTitledBorder("Informações Pessoais");
        bordaPainelMid = BorderFactory.createTitledBorder("Descrição Pessoal e Experiência Profissional");
        bordaPainelDown = BorderFactory.createTitledBorder("Objetivo Profissional");
     
//PAINEIS
        setLayout(null);
        //painelTop.setBackground(new Color(128,0,255));
        //painelMid.setBackground(new Color(255,128,0));
        //painelDown.setBackground(new Color(0,128,0));
        painelTop.setLayout(null);
        painelTop.setBounds(10,25,705,170);
        painelTop.setBorder(bordaPainelTop);
        painelMid.setLayout(new java.awt.FlowLayout(0,5,-3));
        painelMid.setBounds(10,200,705,145);
        painelMid.setBorder(bordaPainelMid);
        painelDown.setLayout(null); 
        painelDown.setBounds(10,345,705,140);
        painelDown.setBorder(bordaPainelDown);
//ICONES
        salvar.setIcon(new ImageIcon(getClass().getResource("/imagens/salvar.png")));
        procurar.setIcon(new ImageIcon(getClass().getResource("/imagens/procurar.png"))); 
        alterar.setIcon(new ImageIcon(getClass().getResource("/imagens/alterar.gif")));
        deletar.setIcon(new ImageIcon(getClass().getResource("/imagens/delete.png")));
        sair.setIcon(new ImageIcon(getClass().getResource("/imagens/sair.png")));
        arquivo.setIcon(new ImageIcon(getClass().getResource("/imagens/folder.png")));
        editar.setIcon(new ImageIcon(getClass().getResource("/imagens/hammer_left.png")));
        sobre.setIcon(new ImageIcon(getClass().getResource("/imagens/about.png")));
        texto.setIcon(new ImageIcon(getClass().getResource("/imagens/texto.png")));
        aparencia.setIcon(new ImageIcon(getClass().getResource("/imagens/aparencia.png")));
        itemNovo.setIcon(new ImageIcon(getClass().getResource("/imagens/new.png")));
        itemNovo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        itemProcurar.setIcon(new ImageIcon(getClass().getResource("/imagens/find.png")));
        itemProcurar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        itemSalvar.setIcon(new ImageIcon(getClass().getResource("/imagens/save.png")));
        itemSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        itemAlterar.setIcon(new ImageIcon(getClass().getResource("/imagens/alterar.gif")));
        itemAlterar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        itemDeletar.setIcon(new ImageIcon(getClass().getResource("/imagens/delete.png")));
        itemDeletar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        itemSair.setIcon(new ImageIcon(getClass().getResource("/imagens/sair.png")));
        itemSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        itemHelp.setIcon(new ImageIcon(getClass().getResource("/imagens/help.png")));
        itemHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0));
        itemSobre.setIcon(new ImageIcon(getClass().getResource("/imagens/sobre.png")));
        itemSobre.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
        checkNegrito.setIcon(new ImageIcon(getClass().getResource("/imagens/negrito.png")));
        checkNegrito.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
        checkItalico.setIcon(new ImageIcon(getClass().getResource("/imagens/italico.png")));
        checkItalico.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.ALT_MASK));

//Definição dos botões e de sus posições.
        salvar.setBounds(105,490,110,25);
        procurar.setBounds(230,490,110,25);
        alterar.setBounds(355,490,110,25);
        deletar.setBounds(480,490,110,25);
        sair.setBounds(605,490,110,25);
              
        nome.setBounds(10,10,40,25);
        endereco.setBounds(10,60,60,25);
        bairro.setBounds(10,110,40,25);
        cidade.setBounds(150,110,60,25);
        estado.setBounds(310,60,60,25);
        email.setBounds(310,110,50,25);
        sexo.setBounds(430,35,40,25);

//Definição dos JTextFields
        nomeText.setBounds(10,35,280,21);
        enderecoText.setBounds(10,85,280,21);
        bairroText.setBounds(10,135,120,21);
        cidadeText.setBounds(10,135,120,21);
        emailText.setBounds(310,135,250,21);

//Definição dos JRadioButton
        feminino.setBounds(462,58,90,25);
        masculino.setBounds(462,35,90,25);
        //masculino.setBackground(new Color(128,0,255));
        //feminino.setBackground(new Color(128,0,255));
        feminino.setFocusable(false);
        masculino.setFocusable(false);

//Definição dos Paineis        
        escolaridade.setBounds(40,10,80,25);
        areasAtuacao.setBounds(40,70,110,25);
        pretensaoSalarial.setBounds(450,10,130,25);
        cargoDesejavel.setBounds(450,70,110,25);
        
        comboEstados.setBounds(310,85,50,21);
        comboEscolaridade.setBounds(40,40,180,25);
        comboAreasAtuacao.setBounds(40,100,180,25);
        comboPretensaoSalarial.setBounds(450,40,180,25);
        comboCargoDesejavel.setBounds(450,100,180,25);
        
//Adiciona os componetes no JFrame.
        add(barraMenu).setBounds(0,0,740,20);
        barraMenu.add(arquivo);
        barraMenu.add(sobre);
        barraMenu.add(editar);
        add(painelTop);
        add(painelMid);
        add(painelDown);
        add(salvar);
        add(procurar);
        add(alterar);
        add(deletar);
        add(sair);
        
        grupoSexo.add(masculino);
        grupoSexo.add(feminino);
        grupoLAF.add(radioMetal);
        grupoLAF.add(radioMotif);
        grupoLAF.add(radioWindows);
        painelTop.add(comboEstados);
        painelTop.add(nome);
        painelTop.add(endereco);
        painelTop.add(estado);
        painelTop.add(email);
        painelTop.add(cidade);
        painelTop.add(sexo);
        painelTop.add(bairro);
        painelTop.add(nomeText);
        painelTop.add(enderecoText);
        painelTop.add(bairroText);
        painelTop.add(cidadeText);
        painelTop.add(emailText);
        painelTop.add(masculino);
        painelTop.add(feminino);
        painelMid.add(barraRolagem);
        painelDown.add(escolaridade);
        painelDown.add(areasAtuacao);
        painelDown.add(cargoDesejavel);
        painelDown.add(pretensaoSalarial);
        painelDown.add(comboEscolaridade);
        painelDown.add(comboAreasAtuacao);
        painelDown.add(comboPretensaoSalarial);
        painelDown.add(comboCargoDesejavel);
        arquivo.add(itemNovo);
        arquivo.add(itemProcurar);
        arquivo.add(itemSalvar);
        arquivo.add(itemAlterar);
        arquivo.add(itemDeletar);
        arquivo.addSeparator();
        arquivo.add(itemSair);
        editar.add(texto);
        editar.add(aparencia);
        texto.add(checkNegrito);
        texto.add(checkItalico);
        aparencia.add(radioMetal);
        radioMetal.setSelected(true);
        aparencia.add(radioMotif);
        aparencia.add(radioWindows);
        sobre.add(itemHelp);
        sobre.add(itemSobre);
        
        setTitle("Estudo de Caso");
        setSize(740,560);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }

        public static void main(String[] args) {
            EstudoCaso frame = new EstudoCaso();
        }
}
