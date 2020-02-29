import java.util.Scanner;
public class Exercicio77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Informe o valor de m: ");
        m = sc.nextInt();
        System.out.println("Informe o valor de n: ");
        n = sc.nextInt();
        while(m<n){
            int soma=0;
            for(int i=m; i<=n;i++){
                soma = soma+i;
            }
            System.out.println("O valor da soma enter "+m+" e "+n+" é "+soma);
            System.out.println("Informe o valor de m: ");
            m = sc.nextInt();
            System.out.println("Informe o valor de n: ");
            n = sc.nextInt();
    }
  }
}
