public class PortaoEletronico{
    private boolean ligado;

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public boolean isLigado(){ //retorna se o portão ta ligado
        return ligado;
    }

    public String observar(){ //método para exibir uma mensagem se ta ligado ou desligado
        if(ligado){
            return "Portão eletrônico ligado";
        }
        else{
            return "Portão eletrônico desligado";
        }
    }
}