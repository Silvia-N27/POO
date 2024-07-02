public class TwoDShape {
    private double largura;
    private double altura;

    public double getAltura(){
        return altura;
    }

    public double getLargura(){
        return largura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }
    
    public void mostraDim() {
        System.out.println("Largura e altura = " + largura + " e " + altura);
    }
}