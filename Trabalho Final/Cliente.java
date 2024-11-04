import java.util.ArrayList; //importar arraylist e list para armazenar uma lista de pedidos dos clientes
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private List<Pedido> pedidos;

    public Cliente(String nome, String telefone) {
        if (nome == null || nome.isEmpty() || telefone == null || telefone.isEmpty()) { //verifica se o nome e o telefone vão estar null ou ser apenas uma string vazia
            throw new IllegalArgumentException("Nome e telefone não podem estar vazios");
        }

        this.nome = nome;
        this.telefone = telefone;
        this.pedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void adicionarPedido(Pedido pedido){
        this.pedidos.add(pedido); //add adiciona um pedido no final da lista de pedidos do cliente
    }

    public List<Pedido> getPedidos() {
        return new ArrayList<>(pedidos); //retorna uma cópia da lista de pedidos protegendo a original de alteração externa
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " Telefone: " + telefone + " Pedidos: " + pedidos.size();
    }
}