import java.util.ArrayList; //importar para armazenar e gerenciar mesas, clientes e pratos do restaurante
import java.util.List;

public class Restaurante {
    private String nome;
    private List<Mesa> mesas;
    private List<Cliente> clientes;
    private List<Prato> pratos;

    public Restaurante(String nome) {
        this.nome = nome;
        this.mesas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.pratos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarMesa(Mesa mesa) {
        this.mesas.add(mesa);
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionarPratoAoMenu(Prato prato) {
        this.pratos.add(prato);
    }

    public List<Prato> getMenu() {
        return pratos;
    }

    public Prato buscarPratoPorNome(String nome) {
        for (Prato prato : pratos) {
            if (prato.getNome().equalsIgnoreCase(nome)) { //equalsignorecase ignora as letras maiúsculas/minúsculas
                return prato;
            }
        }
        return null;
    }

    public List<Prato> buscarPratosPorCategoria(Class<?> categoria) {
        List<Prato> pratosEncontrados = new ArrayList<>();
        for (Prato prato : pratos) {
            if (categoria.isInstance(prato)) { //verifica o tipo de prato
                pratosEncontrados.add(prato); //adiciona os pratos encontrados numa lista
            }
        }
        return pratosEncontrados;
    }

    public void alocarMesa(Mesa mesa, Cliente cliente) throws MesaIndisponivelException { //função de alocar a mesa para um cliente que pode lançar uma execeção da mesa já estar ocupada
        if (mesa.isOcupada()) { //se a mesa já estiver ocupada vai lançar a execeção de mesa indisponível e mostra a mensagem que já está ocupada
            throw new MesaIndisponivelException("Mesa " + mesa.getNumero() + " já está ocupada");
        }
        mesa.setOcupada(true);
        adicionarCliente(cliente);
    }

    @Override
    public String toString() {
        return "Restaurante: " + nome;
    }
}