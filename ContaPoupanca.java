public class ContaPoupanca extends Conta {
    private final double rendimento = 0.07;

    
    public ContaPoupanca() {
        super();
    }


    public ContaPoupanca(String numeroConta, String nomeTitular, int idade, double saldo) {
        super(numeroConta, nomeTitular, idade, saldo);
    }

    
    public double getRendimento() {
        return rendimento;
    }

    
    public void aplicarRendimento() {
        saldo += saldo * rendimento;
    }

    @Override
    public void emprestimo(double valor) {
        System.out.println("Conta poupança não permite empréstimos.");
    }
}
