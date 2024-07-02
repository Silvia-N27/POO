public class PortaAutomatica {
    private boolean ligado;

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public boolean isLigado(){ //retorna se a porta ta ligada
        return ligado;
    }

    public String observar(){ //método para exibir uma mensagem se ta ligada ou desligada
        if(ligado){
            return "Porta automática ligada";
        }
        else{
            return "Porta automática desligada";
        }
    }
}
