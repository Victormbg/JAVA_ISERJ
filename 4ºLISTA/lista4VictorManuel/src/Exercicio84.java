import java.util.Scanner;
public class Exercicio84 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i;
    int elementos[] = new int[20];
    
    for(i=0;i<20;i++){
         System.out.println("Informe o elemento da posição "+i);
     elementos[i]=sc.nextInt();
    } 
     
    for(i=0;i<20;i++){
         System.out.println("Elemento["+i+"]="+elementos[i]);
    }
  }
}
