
import java.util.*;
public class Exercicio56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,contador=1;
        System.out.println("Informe o número: ");
        numero = sc.nextInt();
        if(numero>=1 && numero<=50){
            int valor = numero;
            while(valor<=250){
                System.out.println(valor);
                valor = valor*2;
                contador++;
            }
        }else{
            System.out.println("Você deve informar um número entre 1 e 250!");
        }
    }
}
