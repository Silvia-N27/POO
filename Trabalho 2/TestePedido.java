import java.util.ArrayList;
import java.util.Scanner;

public class TestePedido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        int numeroPedido = 1; //atributo usado para atribuir um número a cada novo pedido feito
        Veiculo veiculo = null;

        while (true) {
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Exibir Clientes");
            System.out.println("3. Fazer Pedido");
            System.out.println("4. Exibir Pedidos");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                clientes.add(new Cliente(nome, cpf));

            }
            else if (opcao == 2) {
                for (Cliente cliente : clientes) {
                    cliente.mostrarDados();
                    System.out.println();
                }
            }
            else if (opcao == 3) {
                System.out.println("Clientes registrados:");

                for (int i = 0; i < clientes.size(); i++) {
                    System.out.println((i + 1) + ". " + clientes.get(i).getNome());
                }

                int numeroDoCliente = -1;

                while (numeroDoCliente < 0 || numeroDoCliente >= clientes.size()) {
                    System.out.print("Selecione um cliente pelo número: ");
                    numeroDoCliente = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (numeroDoCliente < 0 || numeroDoCliente >= clientes.size()) {
                        System.out.println("ERRO!!! Esse cliente não existe. Tente novamente");
                    }
                }

                System.out.println("1. Carro");
                System.out.println("2. Moto");
                int tipoVeiculo = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Modelo: ");
                String modelo = scanner.nextLine();
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();

                if (tipoVeiculo == 1) {
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    veiculo = new Carro(modelo, preco, ano);
                }
                
                else if (tipoVeiculo == 2) {
                    System.out.print("Quilometragem: ");
                    double km = scanner.nextDouble();
                    veiculo = new Moto(modelo, preco, km);
                }

                pedidos.add(new Pedido(numeroPedido++, clientes.get(numeroDoCliente), veiculo));
            }
            else if (opcao == 4) {
                for (Pedido pedido : pedidos) {
                    pedido.mostrarDados();
                    System.out.println();
                }
            }
            else if (opcao == 5) {
                break;
            }
        }

        scanner.close();
    }
}