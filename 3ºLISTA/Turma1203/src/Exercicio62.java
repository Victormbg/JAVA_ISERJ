import java.util.*;
public class Exercicio62 {
public static void main(String[]args){
    int N;
    Scanner sc=new Scanner(System.in);
    System.out.println("Informe o valor de N");
N=sc.nextInt();
double E=1;
for(int i=1;i<=N;i++){
    int fatorial=1;
    for(int j=i;j<=i;j++){
        fatorial=fatorial*j;
    }
    E=E+1/fatorial;
    }System.out.println("O valor da expressão é :"+E);
}
}    
