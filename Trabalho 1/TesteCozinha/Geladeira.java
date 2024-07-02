public class Geladeira {
    private boolean ligado;

    public void ligar(){
        ligado =  true;
    }

    public void desligar(){
        ligado = false;
    }

    public boolean isLigado(){ //retorna se a geladeira ligada
        return ligado;
    }

    public String observar(){ //método para exibir uma mensagem se ta ligada ou desligada
        if(ligado){
            return "Geladeira ligado";
        }
        else{
            return "Geladeira desligada";
        }
    }
}
