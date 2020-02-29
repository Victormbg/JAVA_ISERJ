import java.util.Scanner;
public class Exercicio99 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A[] = new int[7], B[] = new int[7], C[][]= new int[7][2], i, j;
        
        for(i=0;i<7;i++){
            System.out.println("Informe o valor da linha "+i+" de A: ");
            A[i] = sc.nextInt();
            System.out.println("Informe o valor da linha "+i+" de B: ");
            B[i] = sc.nextInt();
            C[i][0] = A[i];
            C[i][1] = B[i];
        }
        
        for (i=0;i<7;i++) {
            for(j=0;j<2;j++){
                System.out.println("C["+i+"]["+j+"]= "+C[i][j]);
            }
        }
    }
}
