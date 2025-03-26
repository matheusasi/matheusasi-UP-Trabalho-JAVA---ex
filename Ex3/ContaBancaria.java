public class ContaBancaria {
  
    private String numeroConta;
    private String nomeTitular;
    private double saldo;

   
    public ContaBancaria(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0; 
    }

   
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("depósito de $ " + valor + " realizado.");
        } else {
            System.out.println("valor inválido.");
        }
    }

    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("saque de $ " + valor + " realizado.");
        } else if (valor <= 0) {
            System.out.println("valor inválido.");
        } else {
            System.out.println("saldo insuficiente para o saque.");
        }
    }

    
    public double consultarSaldo() {
        return saldo;
    }

   
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

  
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
