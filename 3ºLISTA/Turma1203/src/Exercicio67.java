import java.util.Scanner;
public class Exercicio67 {
    public static void main(String[] args) {
        int j; float media,n1,n2,quantaprov=0,quantrepro=0,quantexame=0,mediaalunos=0;
        Scanner sc = new Scanner(System.in);
            for(j=1;j<=6;j++){
                System.out.println("Informe a primeira nota do aluno "+j);
                n1 = sc.nextFloat();
                System.out.println("Informe a segunda nota do aluno "+j);
                n2 = sc.nextFloat();
                media=(n1+n2)/2f;
                if(media<=3){
                    System.out.println("Reprovado");
                    quantrepro+= 1; 
                }
                if(media>3&&media<=7){
                    System.out.println("Exame");
                    quantexame+= 1; 
                }
                if(media>=7){
                    System.out.println("Aprovado");
                    quantaprov+= 1; 
                }
                mediaalunos+=media;
                }
            System.out.println("Quantidade de alunos reprovados "+quantaprov);
            System.out.println("Quantidade de alunos aprovados "+quantexame);
            System.out.println("Quantidade de alunos em exame"+quantrepro);
            System.out.println("Media de notas dos alunos "+mediaalunos/6);
        }
}


