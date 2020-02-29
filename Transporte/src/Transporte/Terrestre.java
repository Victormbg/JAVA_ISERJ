package Transporte;
/**
 *
 * @author aluno
 */
public class Terrestre extends Transporte{
    protected int numRodas;
    
    public Terrestre(int rodas){
        super();
        numRodas = rodas;
    }
    public int GetNumRodas(){
        return numRodas;
    }
    public void SetNumRodas(int num){
        numRodas = num;
    }
    
    
    
}
