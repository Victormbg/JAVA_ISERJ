import java.util.Scanner;
public class Exercicio96 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A[] = new int[30], B[] = new int[30], i;
        
        for(i=0;i<30;i++){
            System.out.println("Digite um elemento "+i+" de A: ");
            A[i] = sc.nextInt();
            B[i] = A[i]*A[i]*A[i];
        }
        
        for(i=0;i<30;i++){
            System.out.println("B["+i+"]= "+B[i]);
        }
    }
}
