public class Livro extends Produto {
    private String autor;
    private int paginas;

    public Livro(int paginas, String autor, double preco, String nome) {
        super(nome, preco);
        this.paginas = paginas;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isExtenso() {
        return paginas > 100;
    }

    @Override
    public double desconto(){
        preco -= preco*0.20;
        return preco;
    }
}