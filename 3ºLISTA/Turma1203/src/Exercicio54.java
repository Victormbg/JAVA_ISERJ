
import java.util.Scanner;
public class Exercicio54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,soma=0;
        for(i=1;i<=100;i++){
            soma = soma+i;
        }
        System.out.println("A soma dos cem primeiros inteiros é "+soma);
    }   
}
