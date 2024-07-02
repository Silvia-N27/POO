public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaNormal = new ContaCorrente(3000.00);
        ClienteEspecial contaEspecial = new ClienteEspecial(3000.00);

     
        System.out.println("Conta Normal:");
        System.out.println("Saldo inicial: " + contaNormal.getSaldo());
        contaNormal.depositar(500.00);
        System.out.println("Saldo após depósito:" + contaNormal.getSaldo());
        contaNormal.sacar(200.00);
        System.out.println("Saldo após saque:" + contaNormal.getSaldo());
        System.out.println("Taxa de operação:" + contaNormal.taxaOperacao(200));

        System.out.println("\nConta Especial:");
        System.out.println("Saldo inicial: " + contaEspecial.getSaldo());
        contaEspecial.depositar(500.00);
        System.out.println("Saldo após depósito: " + contaEspecial.getSaldo());
        contaEspecial.sacar(200.00);
        System.out.println("Saldo após saque:" + contaEspecial.getSaldo());
        System.out.println("Taxa de operação: " + contaEspecial.taxaOperacao(200));
    }
}
