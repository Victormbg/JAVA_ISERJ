package primeiraclasse;
import java.util.*;
public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("#################################################");
        System.out.println("Primeira Instancia de Aluno");
        Aluno al1 = new Aluno();
        Scanner entrada1 = new Scanner(System.in);
        
        System.out.print("Nome do aluno: ");
        al1.nome = entrada1.nextLine();
        
        System.out.print("Matricula de Número: ");
        al1.matricula = entrada1.nextInt();
        
        System.out.print("Nota de Matemática: ");
        al1.notaMat = entrada1.nextDouble();
        
        System.out.print("Nota de Fisica: ");
        al1.notaFis = entrada1.nextDouble();
        
        System.out.printf("O aluno \"%s\" de matricula \"%3d\" tirou %2.2f em Matemática, " + "%2.2f em Física e obteve média %2.2f\n", al1.nome,al1.matricula,al1.notaMat,al1.notaFis,(al1.notaMat+al1.notaFis)/2);
        System.out.println("###################################################");
        System.out.println("Proximo Instancia de Aluno");
        Aluno al2 = new Aluno();
        Scanner entrada2 = new Scanner(System.in);
        
        System.out.print("Nome do aluno: ");
        al2.nome = entrada2.nextLine();
        
        System.out.print("Matricula de Número: ");
        al2.matricula = entrada2.nextInt();
        
        System.out.print("Nota de Matemática: ");
        al2.notaMat = entrada2.nextDouble();
        
        System.out.print("Nota de Fisica: ");
        al2.notaFis = entrada2.nextDouble();
        
        System.out.printf("O aluno \"%s\" de matricula \"%3d\" tirou %2.2f em Matemática, " + "%2.2f em Física e obteve média %2.2f\n", al2.nome,al2.matricula,al2.notaMat,al2.notaFis,(al2.notaMat+al2.notaFis)/2);
        System.out.println("###################################################");
        
    }
}
