import java.util.*;  
public class Exercicio63{
 public static void main (String args[]){
    int fatorial =  1,n;
    Scanner sc = new Scanner(System.in);
    System.out.println( " Digite um numero: " );    
    n = sc.nextInt();
    if(n>0){
    System.out.println("Serão lidos a seguir "+n+" números positivos");
    for(int i=1 ;i<=n; i ++ ) {
      fatorial = fatorial * i;
      System.out.println( " Fatorial de "+i+" é "+fatorial);
    }
    }else{
        System.out.println("Esse número e negativo!!!");
    }
    
  }
}