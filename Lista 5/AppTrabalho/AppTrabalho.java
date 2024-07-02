public class AppTrabalho {
    public static void main(String[] args) {
        //criando objetos
        Dispositivo dispositivo1=new Dispositivo(1, "Notebook");
        Dispositivo dispositivo2=new Dispositivo(2, "Desktop");

        Usuario usuario1= new Usuario(1, "Theodoro");
        Usuario usuario2= new Usuario(2, "Ana");

        usuario1.setDispositivo(dispositivo1); //associa o dispositivo 1 ao usuário 1
        usuario1.trabalhar(); //usuário 1 executa a ação trabalhar
        usuario2.setDispositivo(dispositivo2); //associa o dispositivo 1 ao usuário 1
        usuario2.trabalhar(); //usuário 1 executa a ação trabalhar
    }
}
