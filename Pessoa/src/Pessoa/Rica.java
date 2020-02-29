package Pessoa;
/**
 *
 * @author Victor Manuel - 1302
 */
public class Rica extends Pessoa {
    private double dinheiro;
       
    public double GetDinheiro(){
        return dinheiro;
    }
    public void SetDinheiro(double dia){
        this.dinheiro = dia;
    }
    public String fazCompras(){
        return "Comprando Ações";
    }
}