public class Liquidificador{
    private boolean ligado;
    
    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public boolean isLigado(){ //retorna se o liquidificador ligado
        return ligado;
    }

    public String observar(){ //método para exibir uma mensagem se ta ligado ou desligado
        if(ligado){
            return "Liquidificador ligado";
        }
        else{
            return "Liquidificador desligado";
        }
    }
}