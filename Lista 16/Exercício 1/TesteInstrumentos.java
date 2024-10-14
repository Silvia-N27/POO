public class TesteInstrumentos {
    public static void main(String[] args) {
        
        Instrumento[] instrumentos = new Instrumento[5];
        instrumentos[0] = new SoproMetal();
        instrumentos[1] = new SoproMadeira();
        instrumentos[2] = new Percussao();
        instrumentos[3] = new Corda();

        sinfonia(instrumentos);
    }

    public static void sinfonia(Instrumento[] instrumentos) {
        for (Instrumento instru : instrumentos) {
            instru.nome();
            instru.tocar();
            instru.afinar();
            System.out.println();
        }
    }
}