import java.util.Scanner;
public class Exercicio79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Informe o codigo: ");
        numero = sc.nextInt();
        int qtNumeros=0 , maior=numero, menor=numero,soma=0;
        int mediaPares=0,qtImpares=0, qtPares=0;
        while(numero!=99999){
            qtNumeros++;
            if(numero>maior){
                maior=numero;
            }
            if(numero>menor){
                maior=numero;
            }
            if(numero%2==0){
                mediaPares=mediaPares+numero;
                qtPares++;
            }else{
                qtImpares++;
            }
            soma=soma+numero;
            System.out.println("Informe o numero");
            numero=sc.nextInt();
        }
        System.out.println("A soma dos numeros digitados é "+soma);
        System.out.println("A quantidade dos numeros digitados é "+qtNumeros);
        System.out.println("A media dos numeros "+(soma/qtNumeros));
        System.out.println("O maior numero é "+maior+"\n o menor numero é "+menor);
        System.out.println("A media dos pares é "+(mediaPares/qtPares));
        System.out.println("A quantidade de numeros impares é "+qtImpares);
    }
}