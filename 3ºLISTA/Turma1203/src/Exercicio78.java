import java.util.Scanner;
public class Exercicio78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo,numHoras;
        String sexo;
        float salarioLiquido=0,salarioBruto=0;
        System.out.println("Informe o codigo: ");
        codigo = sc.nextInt();
        while(codigo!=999){
            System.out.println("Informe o numero de horas trabalhadas: ");
            numHoras = sc.nextInt();
            System.out.println("Informe o sexo: ");
            sexo = sc.next();
            salarioBruto=numHoras*30f;
            if(sexo.equalsIgnoreCase("M")){
                salarioLiquido = salarioBruto - salarioBruto*0.1f; 
            }if(sexo.equalsIgnoreCase("F")){
                salarioLiquido = salarioBruto - salarioBruto*0.05f; 
            }
            System.out.println("Salario Bruto é "+salarioBruto+"\nSalarioLiquido é "+salarioLiquido);
            System.out.println("Informe o codigo: ");
            codigo=sc.nextInt();
            
        }
  }
}
