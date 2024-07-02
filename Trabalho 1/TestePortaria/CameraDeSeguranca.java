public class CameraDeSeguranca {
    private boolean ligado;

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public boolean isLigado(){ //retorna se a camêra ta ligada
        return ligado;
    }

    public String observar(){ //método para exibir uma mensagem se ta ligada ou desligada
        if(ligado){
            return "Câmera de segurança ligada";
        }
        else{
            return "Câmera de segurança desligada";
        }
    }
}
