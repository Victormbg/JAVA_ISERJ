package Exercicios1a30;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     float num1, num2, num3, num4, soma;
        System.out.println("Digite  número 1: ");   
        num1=sc.nextFloat();
        System.out.println("Digite  número 2: ");   
        num2=sc.nextFloat();
        System.out.println("Digite  número 3: ");   
        num3=sc.nextFloat();
        System.out.println("Digite  número 4: ");   
        num4=sc.nextFloat();
        soma=num1+num2+num3+num4;
        System.out.println("A soma é: "+soma);   
    }
}
