public class Livro {
    private String autor; //private=encapsular
    private String titulo;

    public Livro(String autor, String titulo){ //construtor
        this.autor = autor; //this na frente signifca que ta criando uma referencia ao atributo da classe(atributo global)
        this.titulo = titulo;
    }
    public void setAutor(String autor){ //modificar o atributo autor
        this.autor = autor;
    }
    public void setTitulo(String titulo){ //modificar o atributo titulo
        this.titulo = titulo;
    }
    public String getAutor(){ //exibir o nome do autor
        return autor;
    }
    public String getTitulo(){ //exibir o título
        return titulo;
    }
    public void exibirMensagem(){
        System.out.println("Nome do livro:"+getTitulo()+"\nAutor:"+getAutor());
    }
}