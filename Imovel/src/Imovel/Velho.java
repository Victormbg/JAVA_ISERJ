package Imovel;
/**
 *
 * @author Victor Manuel - 1302
 */
public class Velho extends Imovel{
    
    double precoVelho;
    
    public double precoVelho(){
        precoVelho = getPreco()*0.10;
        return precoVelho;
    }
}
