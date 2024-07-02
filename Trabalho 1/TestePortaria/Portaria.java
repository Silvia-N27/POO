public class Portaria {
    private PortaoEletronico portaoEletronico;
    private CameraDeSeguranca cameraDeSeguranca;
    private PortaAutomatica portaAutomatica;

    public Portaria(PortaoEletronico portaoEletronico, CameraDeSeguranca cameraDeSeguranca, PortaAutomatica portaAutomatica){ //construtor
        this.portaoEletronico = portaoEletronico;
        this.cameraDeSeguranca = cameraDeSeguranca;
        this.portaAutomatica = portaAutomatica;
    }

    public void ligar(){ //método para ligar os dispositivos
        portaoEletronico.ligar();
        cameraDeSeguranca.ligar();
        portaAutomatica.ligar();
    }

    public void desligar(){ //método para desligar os dispositivos
        portaoEletronico.desligar();
        cameraDeSeguranca.desligar();
        portaAutomatica.desligar();
    }

    public void observar(){ //método para ver se os dispositivos estão ligados ou desligados
        System.out.println(portaoEletronico.observar());
        System.out.println(cameraDeSeguranca.observar());
        System.out.println(portaAutomatica.observar());
    }
}
