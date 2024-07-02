public class Microondas {
    private boolean ligado;

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public boolean isLigado(){ //retorna se o microondas ligado
        return ligado;
    }

    public String observar(){ //método para exibir uma mensagem se ta ligado ou desligado
        if(ligado){
            return "Microondas ligado";
        }
        else{
            return "Microondas desligado";
        }
    }
}
