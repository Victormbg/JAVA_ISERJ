package Imovel;
/**
 *
 * @author Victor Manuel - 1302
 */
public class Novo extends Imovel{
    
    double precoNovo;
        
    public double precoNovo(){
        precoNovo = getPreco()*1.10;
        return precoNovo;
    }
}
