public class TestaFigura {
    public static void main(String[] args) {
        
        Figura quadrado = new Quadrado();
        Figura circulo = new Circulo();
        
        double lado = 5.0;
        double raio = 3.0;
        
        System.out.println("Área do Quadrado: " + quadrado.area(lado));
        System.out.println("Área do Círculo: " + circulo.area(raio));
    }
}