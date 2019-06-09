import java.util.Scanner;
public class Exercicio92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[8], B[] = new int[8], i;
        
        for(i=0;i<8;i++){
            System.out.println("Digite o valor do vetor A: ");
            A[i] = sc.nextInt();
            B[i] = A[i]*5;
        }
        
        for(i=0;i<8;i++){
            System.out.println("B["+i+"]= "+B[i]);
                
        }
    }
}
