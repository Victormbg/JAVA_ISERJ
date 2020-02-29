import java.util.*;
/**
 *
 * @author Francisco Bruno - 1302
 */
public class CaixaEletronico {
    public static void main(String[] args) {
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1+numero.nextInt(9999);
        
        System.out.println("#### Cadastrando novo cliente ####");
        System.out.println("  Entre com seu nome:  ");
        nome = entrada.nextLine();
        
        System.out.println("  Entre com o valor incial depositado na conta: ");
        inicial = entrada.nextDouble();
        
        Conta minhaConta = new Conta(nome, conta, inicial);
        minhaConta.iniciar();
    }
}
