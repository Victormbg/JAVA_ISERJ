package TestaCarro;
/**
 *
 * @author Victor Manuel - 1302
 */
public class TestaCarro {
    public static void main(String[] args) {
        Carro carUm = new Carro("Onix");
        
        carUm.CarMot("GM");
        carUm.CarCat("Popular");
        carUm.CarCus(35000);
        carUm.printCarro();
    }
}
