import java.util.Scanner;
public class Exercicio97 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A[] = new int[20], B[] = new int[20], i;
        
        for(i=0;i<20;i++){
            System.out.println("Digite o valor de A: ");
            A[i] = sc.nextInt();
            B[i] = A[i]+2;
        }
        
        for(i=0;i<20;i++){
            System.out.println("B["+i+"]= "+B[i]);
        }
    }
}
