package Exercicios1a30;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
    float n1,n2,n3,media;
        System.out.println("Informe a 1º nota: ");
        n1=sc.nextFloat();
        System.out.println("Informe a 2º nota: ");
        n2=sc.nextFloat();
        System.out.println("Informe a 3º nota: ");
        n3=sc.nextFloat();
        media=(n1+n2+n3)/3;
        System.out.println("Sua media é: "+media);
     }
}