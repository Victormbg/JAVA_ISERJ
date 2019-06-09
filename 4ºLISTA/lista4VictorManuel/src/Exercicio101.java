

import java.util.Scanner;
public class Exercicio101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10], i, j;
        long B[][] = new long[10][3];
        
        for(i=0;i<10;i++){
            System.out.println("Digite o elemento da linha "+i+" de A: ");
            A[i] = sc.nextInt();
            B[i][0] = A[i]+5;
            B[i][2] = A[i]*A[i]; 
            //Calcuando fatorial
            long fatorial=1;
            for(j=1;j<=A[i];j++){
            fatorial=fatorial*j;
            }
            B[i][1] = fatorial;
        }
        for(i=0;i<10;i++){
            System.out.println("B["+i+"][0]= "+B[i][0]+"\nB["+i+"][1]= "+B[i][1]+"\nB["+i+"][2]= "+B[i][2]);
        }
    }
}
