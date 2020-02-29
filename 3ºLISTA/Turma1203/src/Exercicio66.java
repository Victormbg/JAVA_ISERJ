import java.util.*;
public class Exercicio66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n1=2, n2=7,n3=3,termo;
        System.out.println("Informe o numero de termos");
        termo=sc.nextInt();
        
        System.out.print(n1+","+n2+","+n3);
        for(i=2;i<=termo;i++){
            n1=n1*2;
            n2=n2*3;
            n3=n3*4;
            System.out.print(","+n1+","+n2+","+n3);
        }        
    }
}
