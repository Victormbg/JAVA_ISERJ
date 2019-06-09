import java.util.Scanner;
public class Exercicio98 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A[][] = new int[5][3], B[][] = new int[5][3], C[][] = new int[5][3], i, j;
        
        for(i=0;i<5;i++){ 
            
            for(j=0;j<3;j++){
                System.out.println("Digite o elemento da linha "+i+" coluna "+j+" de A");
                A[i][j] = sc.nextInt();
                System.out.println("Digite o elemento da linha "+i+" coluna "+j+" de B");
                B[i][j] = sc.nextInt();
                C[i][j] = A[i][j]+B[i][j];
                System.out.println("C["+i+"]["+j+"]"+C[i][j]);
           }
        }
    }
}
