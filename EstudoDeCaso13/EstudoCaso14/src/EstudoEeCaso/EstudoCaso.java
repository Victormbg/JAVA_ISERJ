package EstudoEeCaso;
import java.awt.*;
import javax.swing.*;
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
private ButtonGroup grupoSexo;
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
        cargoDesejavel = new JLabel("cargoDesejado"); 
        estado = new JLabel("Estado");
        nomeText = new JTextField();
        enderecoText = new JTextField();
        bairroText = new JTextField();
        cidadeText = new JTextField();
        emailText = new JTextField();
        areaTexto= new JTextArea(7, 62);
        feminino = new JRadioButton("Feminino");
        masculino = new JRadioButton("Masculino");
        grupoSexo = new ButtonGroup();
        comboEstados = new JComboBox(itensEstadosCombo);
        comboAreasAtuacao = new JComboBox(itensAreasAtuacao);
        comboCargoDesejavel = new JComboBox(itensCargoDesejavel);
        comboEscolaridade = new JComboBox(itensEscolaridade);
        comboPretensaoSalarial = new JComboBox(itensPretensaoSalarial);

        
        JScrollPane barraRolagem = new JScrollPane(areaTexto);
                
          
        setLayout(null);

        painelTop.setBackground(new Color(128,0,255));
        painelMid.setBackground(new Color(255,128,0));
        painelDown.setBackground(new Color(0,128,0));

        painelTop.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        painelTop.setBounds(10,10,705,150);
        painelTop.setLayout(null);
        painelTop.setBounds(10,10,705,170);
        
        painelMid.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        painelMid.setBounds(10,170,705,150);
        painelMid.setLayout(new java.awt.FlowLayout(0,10,8));
        painelMid.setBounds(10,190,705,130);
       
        painelDown.setLayout(new java.awt.GridLayout(2, 2)); 
        painelDown.setBounds(10,330,705,150);

        salvar.setIcon(new ImageIcon(getClass().getResource("/imagens/salvar.png")));
        procurar.setIcon(new ImageIcon(getClass().getResource("/imagens/procurar.png"))); 
        alterar.setIcon(new ImageIcon(getClass().getResource("/imagens/alterar.gif")));
        deletar.setIcon(new ImageIcon(getClass().getResource("/imagens/delete.png")));
        sair.setIcon(new ImageIcon(getClass().getResource("/imagens/sair.png")));

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
        masculino.setBackground(new Color(128,0,255));
        feminino.setBackground(new Color(128,0,255));
        feminino.setFocusable(false);
        masculino.setFocusable(false);

//Definição dos Paineis        
        painelTop.setLayout(null);
        painelTop.setBounds(10,10,705,170);
        
        painelMid.setLayout(new java.awt.FlowLayout(0,10,8));
        painelMid.setBounds(10,190,705,130);
        
        painelDown.setLayout(null);
        painelDown.setBounds(10,330,705,140);
        
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
        
        setTitle("Estudo de Caso");
        setSize(740,560);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }

        public static void main(String[] args) {
            EstudoCaso frame = new EstudoCaso();
        }
}
