public class Main {
    public static void main(String[] args) {
       
        ContaBancaria conta = new ContaBancaria("123", "Lucas Bitten");

      
        System.out.println("conta criada: " + conta.getNumeroConta());
        System.out.println("titular da conta: " + conta.getNomeTitular());
        System.out.println("saldo inicial: $ " + conta.consultarSaldo());

       
        conta.depositar(500.00);
        System.out.println("saldo depósito: $ " + conta.consultarSaldo());

        
        conta.sacar(100.00); 
        System.out.println("saldo saque: $ " + conta.consultarSaldo());

        
        conta.sacar(1000.00);
        System.out.println("saldo atualizado: $ " + conta.consultarSaldo());
    }
}
