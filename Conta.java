public class Conta {
    private String numeroConta;
    private String nomeTitular;
    private int idade;
    protected double saldo;

    
    public Conta() {
    
    public Conta(String numeroConta, String nomeTitular, int idade, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.idade = idade;
        this.saldo = saldo;
    }
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos de transação
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public void emprestimo(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }
}
