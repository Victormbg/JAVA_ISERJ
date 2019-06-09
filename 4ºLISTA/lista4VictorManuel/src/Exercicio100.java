

import java.util.Scanner;
public class Exercicio100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int [4] [5], i, j;
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.println("Digite o valor da linha "+i+" coluna "+j+" de A: ");
                A[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.println("A["+i+"]["+j+"]= "+A[i][j]);
                }
        }
    }
}
