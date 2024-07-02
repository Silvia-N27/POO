public class Cozinha {
    private Liquidificador liquidificador;
    private Microondas microondas;
    private Geladeira geladeira;

    public Cozinha(Liquidificador liquidificador, Microondas microondas, Geladeira geladeira){ //construtor
        this.liquidificador=liquidificador;
        this.microondas=microondas;
        this.geladeira=geladeira;
    }

    public void ligar(){ //método para ligar os eletrodomésticos
        liquidificador.ligar();
        microondas.ligar();
        geladeira.ligar();
    }

    public void desligar(){ //método para desligar os eletrodomésticos
        liquidificador.desligar();
        microondas.desligar();
        geladeira.desligar();
    }

    public void observar(){ //método para ver se os eletrodomésticos estão ligados ou desligados
        System.out.println(liquidificador.observar());
        System.out.println(microondas.observar());
        System.out.println(geladeira.observar());
    }
}
