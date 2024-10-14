public class Entrevistador {
    String idioma;

    public void entrevista(Falante f) {
        if (f instanceof Aluno) {
            System.out.println("Oie, Aluno!");
            Aluno a = (Aluno) f;
            a.identificarSe();
        } else if (f instanceof Robo) {
            System.out.println("Oie, Robô!");
            Robo r = (Robo) f;
            r.reboot();
        }
        idioma = f.seuIdioma();
        f.falar();
        System.out.println("Vou entrevistar você em " + idioma);
    }
}