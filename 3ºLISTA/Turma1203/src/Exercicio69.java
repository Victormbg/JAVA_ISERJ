import java.util.Scanner;
public class Exercicio69 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero");
        numero = sc.nextInt();
        boolean Primo = false;
        for(int i=1;i<=numero;i++){
            if(numero%i==0){
                Primo = false;
            }
            if(Primo==false){
                System.out.println("Número não é primo");
            }else{
                System.out.println("Número é primo");
            }
        }
    }
}

