public class TestePortaria {
    public static void main(String[] args) {
        //criação de objetos
        PortaoEletronico portaoEletronico = new PortaoEletronico();
        CameraDeSeguranca cameraDeSeguranca = new CameraDeSeguranca();
        PortaAutomatica portaAutomatica = new PortaAutomatica();
        Portaria portaria = new Portaria(portaoEletronico, cameraDeSeguranca, portaAutomatica);

        //observar se os dispositivos estão ligados ou desligados
        portaria.observar();
        portaria.ligar(); //ligar os dispositivos
        portaria.observar();
        portaria.desligar(); //desligar os dispositivos
        portaria.observar();
    }
}
