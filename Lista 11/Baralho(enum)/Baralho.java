public class Baralho {
    private Cartas[] cartas;
    private int tamanho;

    public Baralho() {
        cartas = new Cartas[52];
        int posicao = 0;
        
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()) {
                cartas[posicao++] = new Cartas(naipe, valor);
            }
        }

        tamanho = cartas.length;
    }

    public void embaralhar() {
        for (int i = 0; i < tamanho; i++) {
            int j = (int) (Math.random() * tamanho);
            Cartas aux = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = aux;
        }
    }

    public Cartas comprar() {
        if (tamanho == 0) {
            return null;
        }
        return cartas[--tamanho];
    }

    public int cartasRestantesBaralho() {
        return tamanho;
    }
}