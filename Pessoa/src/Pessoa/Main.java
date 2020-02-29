package Pessoa;
/**
 *
 * @author Victor Manuel - 1302
 */
public class Main {
       public static void main(String[] args) {
        Pessoa per = new Pessoa();
        Miseravel per2 = new Miseravel();
        Rica ric = new Rica();
        Pobre per3 = new Pobre();
        
        
        per.SetNome("Bettina");
        per.SetIdade(22);
        ric.SetDinheiro(20000000);
        
        per2.SetNome("Marcos");
        per2.SetIdade(30);
        
        per3.SetNome("Ismael");
        per3.SetIdade(18);
                
        System.out.println("Nome: "+per.GetNome());
        System.out.println("Idade: "+per.GetIdade());
        System.out.println("Objetivo: "+ric.fazCompras());
                
        System.out.println("########################################");
        
        System.out.println("Nome: "+per2.GetNome());
        System.out.println("Idade: "+per2.GetIdade());
        System.out.println("Objetivo: "+per2.mendiga());
        
        System.out.println("########################################");
        
        System.out.println("Nome: "+per3.GetNome());
        System.out.println("Idade: "+per3.GetIdade());
        System.out.println("Objetivo: "+per3.trabalha());
    }
}

