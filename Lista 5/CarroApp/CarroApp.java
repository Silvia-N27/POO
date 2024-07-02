public class CarroApp { //exercício 2 e 3
    public static void main(String[] args) {
        //criação de objetos
        Motor m1 = new Motor("3.8L V6");
        Bancos b1 = new Bancos("Banco couro alcantra");
        Carro c1 = new Carro("Mustang", "Conversível", "Ford", m1,b1);

        Motor m2 = new Motor("Zetec Roçam 1.0");
        Bancos b2 = new Bancos(" Branco Couro Sintético");
        Carro c2 = new Carro("Ka", "Popular", "Ford", m2,b2);

        Motor m3 = new Motor("2.4 Ecotec");
        Bancos b3 = new Bancos("Banco Recaro");
        Carro c3 = new Carro("Captiva", "SUV", "Chevrolet", m3,b3);
        
        //imprimir informações
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
