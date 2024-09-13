import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        ContaEmpresarial contaEmp1 = new ContaEmpresarial("123", "Empresa A", 30, 5000, 1000, 2000);
        ContaEmpresarial contaEmp2 = new ContaEmpresarial("124", "Empresa B", 45, 10000, 2000, 3000);

        
        ContaPessoaFisica contaPF1 = new ContaPessoaFisica("201", "João", 25, 3000, 500, 1000);
        ContaPessoaFisica contaPF2 = new ContaPessoaFisica("202", "Maria", 32, 4000, 600, 1500);
        ContaPessoaFisica contaPF3 = new ContaPessoaFisica("203", "Pedro", 29, 2500, 500, 1000);

        
        ContaPoupanca contaPoup1 = new ContaPoupanca("301", "José", 40, 2000);
        ContaPoupanca contaPoup2 = new ContaPoupanca("302", "Ana", 35, 3500);

    
        exibirExtrato(contaEmp1);
        exibirExtrato(contaEmp2);
        exibirExtrato(contaPF1);
        exibirExtrato(contaPF2);
        exibirExtrato(contaPF3);
        exibirExtrato(contaPoup1);
        exibirExtrato(contaPoup2);
    }


    public static void exibirExtrato(Conta conta) {
        System.out.println("Titular: " + conta.getNomeTitular());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println();
    }
    input.close();
}
