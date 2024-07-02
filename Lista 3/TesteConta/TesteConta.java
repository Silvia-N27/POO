import java.util.*;

public class TesteConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta c1 = new Conta(1000.00); //cria um objeto
        Conta c2 = new Conta(150.00); //cria mais um objeto
        System.out.printf("Saldo da Conta 1 : R$ %.2f\n", c1.getSaldo());
        System.out.printf("Saldo da Conta 2 : R$ %.2f\n", c2.getSaldo());

        System.out.print("Digite o valor de retirada da conta 1 : ");
        double qtdeRetirada1 = scanner.nextDouble();
        System.out.printf("Subtraindo R$ %.2f do saldo da conta 1\n", qtdeRetirada1);

        c1.debitar(qtdeRetirada1); //debitar na conta 1

        System.out.printf("Saldo da Conta 1 : R$ %.2f\n", c1.getSaldo());
        System.out.printf("Saldo da Conta 2 : R$ %.2f\n", c2.getSaldo());

        System.out.print("Digite o valor de retirada da conta 2: ");
        double qtdeRetirada2 = scanner.nextDouble();
        System.out.printf("Subtraindo R$ %.2f do saldo da conta 2\n", qtdeRetirada2);

        c2.debitar(qtdeRetirada2); //debitar na conta 2

        System.out.printf("Saldo da Conta 1 : R$ %.2f\n", c1.getSaldo());
        System.out.printf("Saldo da Conta 2 : R$ %.2f\n", c2.getSaldo());

        scanner.close();
    }
}