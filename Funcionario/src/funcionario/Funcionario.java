package funcionario;
public class Funcionario {
    String nome;
    int idade;
    String cargo;
    double salario;
    int matricula;
    
    public Funcionario(String nome){
        this.nome = nome;
    }
    public void funcIdade(int funcIdade){
        idade = funcIdade;
    }
    public void funcCargo(String funcCargo){
        cargo = funcCargo;
    }
    public void funcSalario(double funcSalario){
        salario = funcSalario;
    }
    public void printFuncionario(){
        System.out.print("Nome: "+nome);
        System.out.print("Idade: "+idade);
        System.out.print("Cargo: "+cargo);
        System.out.print("Salario: "+salario);
        
    }
}
