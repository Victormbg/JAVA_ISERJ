package thismetodo;
public class thisMetodo {
    public static void main(String[] args) {
        String nome = "Fernando Moreira";
        int ID=1441;
        double salario=3500.50;
        Funcionario chefe = new Funcionario(nome,ID,salario);
        chefe.exibir();
    }
}
