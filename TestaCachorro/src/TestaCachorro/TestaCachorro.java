package TestaCachorro;
/**
 *
 * @author Victor Manuel - 1302
 */
public class TestaCachorro {
    public static void main(String[] args) {
        String nome = "Pingo";
        int idade = 5;
        int peso = 10;
        
        Cachorro pingo = new Cachorro(nome,idade,peso);
        pingo.exibir();
    }
}
