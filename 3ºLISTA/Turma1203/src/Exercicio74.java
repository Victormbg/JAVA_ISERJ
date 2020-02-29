import java.util.Scanner;
public class Exercicio74 {
    public static void main(String[] args) {
       float base=0, altura=0, area;
       Scanner sc = new Scanner(System.in);
       while(base<=0&&altura <= 0){
        System.out.println("Digite a medida da base: ");
        base = sc.nextFloat();
        System.out.println("Digite a medida da altura: ");
        altura = sc.nextFloat();
       } 
       area = base * altura / 2;
        System.out.println("A área de um triângulo é "+area);
    }
}