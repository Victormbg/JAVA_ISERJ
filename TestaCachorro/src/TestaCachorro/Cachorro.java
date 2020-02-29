package TestaCachorro;
/**
 *
 * @author Victor Manuel - 1302
 */
public class Cachorro {
    public String nome;
    public int idade,peso;
    
    public Cachorro(String nome,int idade,int peso){
        this.nome=nome;
        this.idade=idade;
        this.peso=peso;
}
    public void exibir(){
        System.out.printf("O cachorro "+this.nome+", tem idade de "+this.idade+" anos e peso de "+this.peso+" quilos.");
    }
}
