public class Usuario {
    private String nome;
    private int matricula;
    private Dispositivo dispositivo;

    Usuario(int matricula, String nome){ //construtor
        this.matricula=matricula;
        this.nome=nome;
    }

    public void setDispositivo(Dispositivo dispositivo){ //modificar o dispositivo
        this.dispositivo=dispositivo;
    }

    public void trabalhar(){
        dispositivo.usar(nome); //chama o método usar do dispositivo passando nome como argumento
    }
}
