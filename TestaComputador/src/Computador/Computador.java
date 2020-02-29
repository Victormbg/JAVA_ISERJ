package Computador;
/**
 *
 * @author Victor Manuel - 1302
 */
public class Computador {
    int codigo;
    String marca;
    String modelo;
    
    public Computador(int codigo){
        this.codigo = codigo;
    }
    public void Marca(String Marca){
        marca = Marca;
    }
    public void Modelo(String Modelo){
        modelo = Modelo;
    }
    
    public void printComputador(){
        System.out.print("\n"+"Codigo: "+codigo+"\n");
        System.out.print("Marca: "+marca+"\n");
        System.out.print("Modelo: "+modelo+"\n");
        System.out.print("#####################"+"\n");
        
    }    
}
