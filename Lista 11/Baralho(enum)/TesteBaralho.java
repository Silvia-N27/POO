public class TesteBaralho {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.embaralhar();

        for (int i = 0; i < 5; i++) {
            Cartas carta = baralho.comprar();
            
            if (carta != null) {
                System.out.println(carta);
            }
        }

        System.out.println("Cartas restantes no baralho: " + baralho.cartasRestantesBaralho());
    }
}