public class Shapes {
    public static void main(String[] args) {
        //criação de objetos
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();
        
        t1.setLargura(4.0);
        t1.setAltura(4.0);
        t2.setLargura(8.0);
        t2.setAltura(12.0);
        t1.setEstilo("Cheio");
        t2.setEstilo("Contorno");

        r1.setLargura(5.0);
        r1.setAltura(5.0);
        r2.setLargura(6.0);
        r2.setAltura(9.0);

        
        System.out.println("Info para t1: ");
        t1.mostraEstilo();
        t1.mostraDim();
        System.out.println("Area = " + t1.area());

        System.out.println();

        System.out.println("Info para t2: ");
        t2.mostraEstilo();
        t2.mostraDim();
        System.out.println("Area = " + t2.area());

        System.out.println("Info para r1: ");
        System.out.println("É quadrado: " + r1.isQuadrado());
        r1.mostraDim();
        System.out.println("Area = " + r1.area());
        System.out.println();
        
        System.out.println("Info para r2: ");
        System.out.println("É quadrado: " + r2.isQuadrado());
        r2.mostraDim();
        System.out.println("Area = " + r2.area());
    }
}
    