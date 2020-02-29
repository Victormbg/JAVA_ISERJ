

import java.util.Scanner;
public class Exercicio102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[12], B[] = new int[12], C[][] = new int[12][2], i, j;
        for(i=0;i<12;i++){
            for(j=0;j<2;j++){
                System.out.println("Informe o valor da linha "+i+" de A: ");
                A[i] = sc.nextInt();
                System.out.println("Informe o valor da linha "+i+" de B: ");
                B[i] = sc.nextInt();
                C[i][0] = A[i]*2;
                C[i][1] = B[i]-5;
                System.out.println("C["+i+"]["+j+"]= "+C[i][j]);        
            }
            
        }
    }
}
