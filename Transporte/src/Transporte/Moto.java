package Transporte;
/**
 *
 * @author Victor Manuel -1302
 */
public class Moto extends Terrestre {
    private String cor;
    private String placa;
    private int marcha;
    
    public Moto(String ncor, String nplaca){
        
        super(2);
        cor = ncor;
        placa = nplaca;
        marcha = 0; 
    }
    public int GetMarcha(){
        return marcha;
    }
    public void TrocarMarcha(int novaMarcha){
        marcha = novaMarcha;
    }
    public void Acelerar(){
        velocidade += marcha * 5;
    }
    public void Frear(){
        velocidade -= marcha * 5;
    }   
}
