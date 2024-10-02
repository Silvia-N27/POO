public class MaisTres implements Series {
    private int inicio;
    private int valor;

    
    public MaisTres(int inicio, int valor) {
        this.inicio = inicio;
        this.valor = valor;
    }

    @Override
    public int getNext() {
        valor +=3;
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
