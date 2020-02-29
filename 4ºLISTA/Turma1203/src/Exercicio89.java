import java.util.Scanner;
public class Exercicio89 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i, A[] = new int[15], B[] = new int[15];
        
        for(i=0;i<15;i++){
            System.out.println("Digite o elemento "+i+" de A: ");
            A[i] = sc.nextInt();
            B[i] = A[i]*A[i];
        }
        
        for(i=0;i<15;i++){
            System.out.println("B["+i+"]="+B[i]);
        }
    }
}
