package Imovel;
import javax.swing.JOptionPane;
/**
 *
 * @author Victor Manuel - 1302
 */
public class TestaImovel extends Imovel{
    public static void main(String[] args) {
        
        Novo pn = new Novo();
        Velho pv = new Velho();
                
        pv.setEndereco("Rua Central, nº 450 - Rio de Janeiro/RJ");
        pn.setEndereco("Rua Principal, nº 250 - Rio de Janeiro/RJ");
        pv.setPreco(1000);
        pn.setPreco(2000);
               
        String opcao = JOptionPane.showInputDialog("Informe o sua opção: "+"\n"+"1 - Imóvel Velho"+"\n"+"2 - Imóvel Novo");

        if(null != opcao)switch (opcao) {
            case "1":
                JOptionPane.showMessageDialog(null,"O Imóvel Velho está no endereço: "+pv.getEndereco()+" com o preço de R$"+pv.precoVelho());
                break;
            case "2":
                JOptionPane.showMessageDialog(null,"O Imóvel Novo está no endereço: "+pn.getEndereco()+" com o preço de R$"+pn.precoNovo());
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção Invalida!!");
                break;
        }
        
    }
}

