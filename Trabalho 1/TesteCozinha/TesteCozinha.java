public class TesteCozinha {
    public static void main(String[] args) {
        //criação de objetos
        Liquidificador liquidificador = new Liquidificador();
        Microondas microondas = new Microondas();
        Geladeira geladeira = new  Geladeira();
        Cozinha cozinha = new Cozinha(liquidificador, microondas, geladeira);

        //observar se os eletrodométicos estão ligados ou desligados
        cozinha.observar();
        cozinha.ligar(); //ligar os eletrodomésticos
        cozinha.observar();
        cozinha.desligar(); //desligar os eletrodomésticos
        cozinha.observar();
    }
}
