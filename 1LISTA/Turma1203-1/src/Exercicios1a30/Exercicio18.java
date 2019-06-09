package Exercicios1a30;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float salario, conta1, conta2, salarioRestante;
        System.out.println("Digite o salário do João: ");
        salario = sc.nextFloat();
        System.out.println("Digite o valor da conta 1: ");
        conta1 = sc.nextFloat();
        System.out.println("Digite o valor da conta 2: ");
        conta2 = sc.nextFloat();
        salarioRestante = salario - conta1*1.02f - conta2*1.02f;
        System.out.println("O salário restante é "+salarioRestante);
    }
}
