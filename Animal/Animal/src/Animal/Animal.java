package Animal;
/**
 *
 * @author Victor Manuel - 1302
 */
public class Animal {
    private String nome;
    private String raca;

public Animal(){}

public String GetNome(){
    return nome;
}
public void SetNome(String nom){
    nome = nom;
}
public String GetRaca(){
    return raca;
}
public void SetRaca(String rac){
    raca = rac;
}
public String caminha(){
    return "Está caminhando";
}

    public static void main(String[] args) {
        Gato cat = new Gato();
        Cachorro dog = new Cachorro();
        
        dog.SetLate("AU-AU");
        dog.SetNome("TOTO");
        dog.SetRaca("Labrador");
        
        cat.SetMia("MIAAUU");
        cat.SetNome("GATO");
        cat.SetRaca("Siames");
        
        
        
        System.out.println("Nome: "+cat.GetNome());
        System.out.println("Raça: "+cat.GetRaca());
        System.out.println("Barulho: "+cat.GetMia());
        System.out.println(cat.caminha());
        
        System.out.println("########################################");
        
        System.out.println("Nome: "+dog.GetNome());
        System.out.println("Raça: "+dog.GetRaca());
        System.out.println("Barulho: "+dog.GetLate());
        System.out.println(dog.caminha());
    }
}