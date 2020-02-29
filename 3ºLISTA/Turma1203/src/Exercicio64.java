import java.util.Scanner;
public class Exercicio64 {
    public static void main(String[] args) {
        int i,qtHoras;
        float salario=0;
        String categoria,turno;
        Scanner sc = new Scanner(System.in);
        for(i=1;i<=10;i++){
            System.out.println("Informe o turno do funcionario "+i+":");
            turno = sc.next();
            System.out.println("Informe a categoria do funcionario "+i+":");
            categoria = sc.next();
            System.out.println("Informe a quantidade de horas do funcionario "+i+":");
            qtHoras = sc.nextInt();
            if(categoria.equals("G")&&turno.equals("N")){
                salario = qtHoras*0.18f*995f;
            }
            if(categoria.equals("G")&&turno.equals("M") || turno.equals("V")){
                salario = qtHoras*0.15f*995f;
            }
            if(categoria.equals("O")&&turno.equals("N")){
                salario = qtHoras*0.12f*995f;
            }
            if(categoria.equals("O")&&turno.equals("M") || turno.equals("V")){
                salario = qtHoras*0.1f*995f;
            }
            if(salario<=300){
                salario=salario*1.2f;
            }
            if(salario>300 && salario<=600){
                salario=salario*1.15f;
            }
            if(salario>600){
                salario=salario*1.05f;
            }
            System.out.println("Salario do funcionario "+i+ " é "+salario);
        }
    }
}
