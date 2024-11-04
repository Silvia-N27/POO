public class TesteRestaurante {
    public static void main(String[] args) {

        Restaurante restaurante = new Restaurante("Silk's Restaurant");

        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);
        restaurante.adicionarMesa(mesa1);
        restaurante.adicionarMesa(mesa2);

        Cliente cliente1 = new Cliente("Lunox", "99989-7858");
        Cliente cliente2 = new Cliente("Claude", "99785-2541");
        restaurante.adicionarCliente(cliente1);
        restaurante.adicionarCliente(cliente2);

        PratoPrincipal prato1 = new PratoPrincipal("Costela barbecue com mix de batatas doces", 50.00);
        Sobremesa sobremesa1 = new Sobremesa("Tiramisù", 15.00);
        PratoPrincipal prato2 = new PratoPrincipal("Salmão ao molho de pimenta rosa", 60.00);
        Sobremesa sobremesa2 = new Sobremesa("Petit Gâteau", 20.00);
        
        restaurante.adicionarPratoAoMenu(prato1);
        restaurante.adicionarPratoAoMenu(sobremesa1);
        restaurante.adicionarPratoAoMenu(prato2);
        restaurante.adicionarPratoAoMenu(sobremesa2);

        System.out.println(restaurante);

        System.out.println(mesa1);
        System.out.println(mesa2);
        try {
            restaurante.alocarMesa(mesa1, cliente1);
            System.out.println("Mesa " + mesa1.getNumero() + " alocada para o(a) cliente " + cliente1.getNome());
            System.out.println(mesa1);

            restaurante.alocarMesa(mesa2, cliente2);
            System.out.println("Mesa " + mesa2.getNumero() + " alocada para o(a) cliente " + cliente2.getNome());
            System.out.println(mesa2);
        } catch (MesaIndisponivelException e) {
            System.out.println(e.getMessage());
        }

        Pedido pedido1 = new Pedido(1, mesa1, cliente1);
        try {
            pedido1.adicionarPrato(prato1);
            pedido1.adicionarPrato(sobremesa1);
        } catch (PratoIndisponivelException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Prato principal: " + prato1 + " Sobremesa: " + sobremesa1);
        System.out.println("Valor total do pedido do(a) " + cliente1.getNome() + ": R$" + String.format("%.2f", pedido1.calcularTotal()));
        System.out.println("Status do pedido do(a) " + cliente1.getNome() + ": " + pedido1.getStatus());

        pedido1.setStatus(StatusPedido.PRONTO);
        System.out.println("Novo status do pedido do(a) " + cliente1.getNome() + ": " + pedido1.getStatus());

        pedido1.setStatus(StatusPedido.ENTREGUE);
        System.out.println("Novo status do pedido do(a) " + cliente1.getNome() + ": " + pedido1.getStatus());

        Pedido pedido2 = new Pedido(2, mesa2, cliente2);
        try {
            pedido2.adicionarPrato(prato2);
            pedido2.adicionarPrato(sobremesa2);
        } catch (PratoIndisponivelException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Prato principal: " + prato2 + " Sobremesa: " + sobremesa2);
        System.out.println("Valor total do pedido do(a) " + cliente2.getNome() + ": R$" + String.format("%.2f", pedido2.calcularTotal()));
        System.out.println("Status do pedido do(a) " + cliente2.getNome() + ": " + pedido2.getStatus());

        pedido2.setStatus(StatusPedido.PRONTO);
        System.out.println("Novo status do pedido do(a) " + cliente2.getNome() + ": " + pedido2.getStatus());

        pedido2.setStatus(StatusPedido.ENTREGUE);
        System.out.println("Novo status do pedido do(a) " + cliente2.getNome() + ": " + pedido2.getStatus());

        System.out.println("Pratos principais:");
        for (Prato prato : restaurante.buscarPratosPorCategoria(PratoPrincipal.class)) { //for-each para percorrer cada prato retornado pelo método buscarPratosPorCategoria
            System.out.println("* " + prato.getNome() + " - R$" + String.format("%.2f", prato.getPreco()));
        }

        System.out.println("Sobremesas:");
        for (Prato prato : restaurante.buscarPratosPorCategoria(Sobremesa.class)) {
            System.out.println("* " + prato.getNome() + " - R$" + String.format("%.2f", prato.getPreco()));
        }
    }
}