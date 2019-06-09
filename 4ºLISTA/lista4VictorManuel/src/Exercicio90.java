import java.util.Scanner;
public class Exercicio90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int [20], B[] = new int[20], i;

        for(i=0;i<20;i++){
            
            System.out.println("Informe o valor do vetor A: ");
            A[i] = sc.nextInt();
            B[19-i] = A[i];
        }
        
        for(i=0;i<20;i++){
            System.out.println("B["+i+"]= "+B[i]);
        }
    }
}
