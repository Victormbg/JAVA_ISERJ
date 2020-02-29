package TestaCarro;
/**
 *
 * @author Victor Manuel - 1302
 */
public class Carro {
    String Nome;
    String Montadora;
    String Categoria;
    double Custo;
    
    public Carro(String Nome){
        this.Nome = Nome;
    }
    public void CarMot (String CarMot){
        Montadora = CarMot;
    }
    
    public void CarCat (String CarCat){
        Categoria = CarCat;
    }
    
    public void CarCus (double CarCus){
        Custo = CarCus;
    }
    
    public void printCarro(){
        System.out.print("Nome: "+Nome+"\n");
        System.out.print("Montadora: "+Montadora+"\n");
        System.out.print("Categoria: "+Categoria+"\n");
        System.out.print("Custo: "+Custo+"\n");
    }
}
