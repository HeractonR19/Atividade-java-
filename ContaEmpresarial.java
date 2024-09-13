public class ContaEmpresarial extends Conta {
    private double limiteSaque;
    private double limiteEmprestimo;

    
    public ContaEmpresarial() {
        super();
    }


    public ContaEmpresarial(String numeroConta, String nomeTitular, int idade, double saldo, double limiteSaque, double limiteEmprestimo) {
        super(numeroConta, nomeTitular, idade, saldo);
        this.limiteSaque = limiteSaque;
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }


    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor + 5) {
            saldo -= (valor + 5);
        }
    }

    @Override
    public void emprestimo(double valor) {
        if (valor > 0 && saldo >= valor + 50) {
            saldo -= (valor + 50);
        }
    }
}
