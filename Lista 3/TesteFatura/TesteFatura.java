public class TesteFatura {
    public static void main(String[] args) {
        Fatura f1 = new Fatura ("001", "HeadSet Astro A50", 1, 1320.00); //cria um objeto
        Fatura f2 = new Fatura ("002", "Microfone HyperX", 2, 379.90); //cria outro objeto
        System.out.println("Núumero do pedido: " + f1.getNumero());
        System.out.println("Descrição:" + f1.getDescricao());
        System.out.println("Quantidade:" + f1.getQuantidade());
        System.out.println("Preço:" + f1.getPreco());
        System.out.println("Total da fatura:" + f1.getQuantidadeFatura());
        System.out.println("Número do pedido:" + f2.getNumero());
        System.out.println("Descrição:" + f2.getDescricao());
        System.out.println("Quantidade:" + f2.getQuantidade());
        System.out.println("Preço:" + f2.getPreco());
        System.out.println("Total da fatura:" + f2.getQuantidadeFatura());
    }
}
