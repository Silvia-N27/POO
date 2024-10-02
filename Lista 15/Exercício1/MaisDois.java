public class MaisDois implements Series {
    private int inicio;
    private int valor;

    public MaisDois(int inicio, int valor) {
        this.inicio = inicio;
        this.valor = valor;
    }

    @Override
    public int getNext() {
        valor +=2;
        return valor;
    }

    @Override
    public void reset() {
        valor = inicio;
    }

    @Override
    public void setStart(int x) {
        inicio = x;
        valor = x;
    }
    
}
