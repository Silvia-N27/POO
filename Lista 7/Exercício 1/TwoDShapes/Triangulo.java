public class Triangulo extends TwoDShape {
    private String estilo;
    
    public double area() {
        return (getLargura() * getAltura()) / 2;
    }

    public void setEstilo(String estilo){
        this.estilo = estilo;
    }

    public String getEstilo(){
        return estilo;
    }
    
    public void mostraEstilo() {
        System.out.println("Triangulo = " + estilo);
    }
}