
import java.util.*;
public class Exercicio55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,i;
        System.out.println("Informa o número que voce deseja saber a tabuada: ");
        numero = sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(numero+"x"+i+"="+numero*i);
       }
    }
}
