package Exercicios1a30;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float c , f;
        System.out.println("Informe a temperatura em Celsius: ");
        c = sc.nextFloat();
        f = c * 1.8f+32;
        System.out.println("A temperatura em Fahrenheit é "+f);   
    } 
}

