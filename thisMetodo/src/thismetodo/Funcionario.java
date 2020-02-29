package thismetodo;
public class Funcionario {
    private String nome;
    private int ID;
    private double salario;
    public Funcionario(){
        System.out.println("Método construtor padrão invocado");
}
    public Funcionario(String nome, int ID, double salario){
        this.nome=nome;
        this.salario=salario;
}
    public void exibir(){
        System.out.printf("O funcionária %s, de número %d recebe %.2f por mês",this.nome,this.ID,this.salario);
    }
}