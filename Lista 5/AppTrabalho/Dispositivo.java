public class Dispositivo{
    private int codigo;
    private String nome;

    Dispositivo(int codigo, String nome){ //construtor
        this.codigo=codigo;
        this.nome=nome;
    }

    public void usar(String usuario){ //método pra mostrar o usuário e qual dispositivo ele ta usando
        System.out.println(usuario+" está usando o dispositivo "+nome);
    }
}