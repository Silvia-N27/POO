public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente clienteEspecial = new ClienteEspecial();
        
        double valorOriginal = 100.0;
        
        double valorComDescontoCliente = cliente.calcularDesconto(valorOriginal);
        double valorComDescontoClienteEspecial = clienteEspecial.calcularDesconto(valorOriginal);
        
        System.out.println("Valor original: " + valorOriginal);
        System.out.println("Valor com desconto para cliente: " + valorComDescontoCliente);
        System.out.println("Valor com desconto para cliente especial: " + valorComDescontoClienteEspecial);
    }
}