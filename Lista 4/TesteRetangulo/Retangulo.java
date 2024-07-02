public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(){ //construtor sem parâmetro
        this.comprimento=4;
        this.largura=2;
    }

    public Retangulo(double comprimento, double largura){ //construtor com parâmetros
        this.comprimento=comprimento;
        this.largura=largura;
    }

    public void setComprimento(double comprimento){ //modificar o atributo comprimento
        this.comprimento=comprimento;
    }

    public void setLargura(double largura){ //modificar o atributo largura
        this.largura=largura;
    }

    public double getComprimento(){ //exibir o comprimento
        return this.comprimento;
    }

    public double getLargura(){ //exibir a largura
        return this.largura;
    }

    public double calcularPerimetro(){
        return(comprimento+largura)*2;
    }

    public double calcularArea(){
        return comprimento*largura;
    }

    public void exibirPerimetro(){
        System.out.println("Perímetro do retângulo:"+calcularPerimetro());
    }

    public void exibirArea(){
        System.out.println("Área do retângulo:"+calcularArea());
    }
}
