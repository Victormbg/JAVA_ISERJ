import java.util.Scanner;
public class Exercicio87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[20], B[] = new int[20], C[] = new int[40], i;
        
        for(i=0;i<20;i++){
            System.out.println("Digite o elemento "+i+" de A: ");
            A[i] = sc.nextInt();
            System.out.println("Digite o elemento "+i+" de B: ");
            B[i] = sc.nextInt();
            C[i] = A[i];
            C[i+20] = B[i];
        }
        
        for(i=0;i<40;i++){
            System.out.print("\tC["+i+"]="+C[i]);
        }  
    }
}
