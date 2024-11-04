import java.util.ArrayList; //importar arraylist e list para gerenciar os pedidos
import java.util.List;

public class Pedido implements Faturavel {
    private int numPedido;
    private Mesa mesa;
    private Cliente cliente;
    private List<Prato> pratos;
    private StatusPedido status;

    public Pedido(int numPedido, Mesa mesa, Cliente cliente) {
        this.numPedido = numPedido;
        this.mesa = mesa;
        this.cliente = cliente;
        this.pratos = new ArrayList<>();
        this.status = StatusPedido.EM_ANDAMENTO;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void adicionarPrato(Prato prato) throws PratoIndisponivelException { //função que pode lançar uma execeção de prato indisponível
        if (prato == null) { //se o prato for null vai lançar a execeção e mostra a mensagem que o prato ta indisponível
            throw new PratoIndisponivelException("Prato indisponível");
        }
        this.pratos.add(prato); //vai adiciona um prato no final da lista
    }

    public List<Prato> getPratos() {
        return new ArrayList<>(pratos);
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public double calcularTotal() { //função que calcula o total somando os preços de cada prato, para o prato principal e sobremesa tem a taxa de serviço
        double total = 0.0;
        for (Prato prato : pratos) {
            total += prato.getPreco();
            if (prato instanceof PratoPrincipal) { //usa instanceof para verificar se prato é um prato principal ou uma sobremesa
                total += ((PratoPrincipal) prato).calcularTaxaServico();
            } else if (prato instanceof Sobremesa) {
                total += ((Sobremesa) prato).calcularTaxaServico();
            }
        }
        return total;
    }
}