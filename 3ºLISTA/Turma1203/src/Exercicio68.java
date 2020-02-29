import java.util.Scanner;
public class Exercicio68 {
    public static void main(String[] args) {
        int i,j;int qtMenores=0, qtAcima80=0; float mediaIdade=0,mediaAltura=0;
        Scanner sc = new Scanner(System.in);
        for(i=1;i<=3;i++){
            for(j=1;j<=3;j++){
                int idade; float altura,peso;
                System.out.println("Informe a idade do jogador "+j+" da equipe "+i);
                idade = sc.nextInt();
                System.out.println("Informe a altura do jogador "+j+" da equipe "+i);
                altura = sc.nextFloat();
                System.out.println("Informe o peso do jogador "+j+" da equipe "+i);
                peso = sc.nextFloat();
                if(idade<18){
                    qtMenores += 1; 
                }
                mediaIdade += idade;
                mediaAltura += altura;
                if(peso>80){
                    qtAcima80 += 1;
                }
            }
            System.out.println("Quantidade Jogadores menores que 18 anos "+qtMenores);
            System.out.println("Media das idades dos jogadores "+mediaIdade/9);
            System.out.println("Media das alturas dos jogadores "+mediaAltura/9);
            System.out.println("Percentual de jogadores acima de 80 quilos "+qtAcima80/9);
        }
    }
}

