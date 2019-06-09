import java.util.Scanner;
public class Exercicio86 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, A[] = new int[15]; 
    long B[] = new long[15];
     
    for(i=0;i<15;i++){
         System.out.println("Informe o elemento "+i+" de A: ");
         A[i] = sc.nextInt();
         long fatorial=1;
         
    for(int j=1;j<=A[i];j++){
         fatorial = fatorial*j;
    }
         
    B[i] = fatorial;
    System.out.println("B["+i+"]="+B[i]);
    
    }
  }
}
