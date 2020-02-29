import java.util.Scanner;
public class Exercicio85 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A[] = new int[8], B[] = new int[8], i;
    
    for(i=0;i<8;i++){
        System.out.println("Digite o elemento "+i+" de A: ");
        A[i] = sc.nextInt();
        B[i] = 3*A[i];
    }
        
    for(i=0;i<8;i++){
        System.out.println("\tA["+i+"]="+A[i]);
        System.out.println("\tB["+i+"]="+B[i]);
        }        
    }
}
