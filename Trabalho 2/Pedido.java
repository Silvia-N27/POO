public class Pedido {
    private int numero;
    private Cliente cliente;
    private Veiculo veiculo;

    public Pedido(int numero, Cliente cliente, Veiculo veiculo) {
        this.numero = numero;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void mostrarDados() {
        System.out.println("Número do Pedido: " + numero);
        cliente.mostrarDados();
        veiculo.mostrarDados();
    }
}