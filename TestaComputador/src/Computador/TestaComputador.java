package Computador;
/**
 *
 * @author Victor Manuel - 1302
 */
public class TestaComputador {
    public static void main(String[] args) {
        Computador pc1 = new Computador(2);
        Computador pc2 = new Computador(6);
        
        pc1.Marca("HP");
        pc1.Modelo("NXY000");
        pc1.printComputador();
        
        pc2.Marca("ACER");
        pc2.Modelo("YXU200");
        pc2.printComputador();
    }
}
