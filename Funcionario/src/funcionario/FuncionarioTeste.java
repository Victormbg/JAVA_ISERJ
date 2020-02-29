package funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcUm = new Funcionario("Fernando Moreira");
        Funcionario funcDois = new Funcionario("Maria Aparecida");
        
        funcUm.funcIdade(58);
        funcUm.funcCargo("Senior Software Engineer");
        funcUm.funcSalario(1000);
        funcUm.printFuncionario();
        
        funcDois.funcIdade(21);
        funcDois.funcCargo("Software Engineer");
        funcDois.funcSalario(500);
        funcDois.printFuncionario();
    }
}
