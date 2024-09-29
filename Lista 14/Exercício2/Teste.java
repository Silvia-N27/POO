public class Teste {
    public static void main(String[] args) {
        try {
            throw new ExceptionC("Lançando a ExceptionC :D");
        } catch (ExceptionA e) {
            System.out.println("Erro:" + e.getMessage());
        }

        try {
            throw new ExceptionB("Lançando a ExceptionB :D");
        } catch (ExceptionA e) {
            System.out.println("Erro:" + e.getMessage());
        }

        try {
            throw new ExceptionA("Lançando a ExceptionA :D");
        } catch (ExceptionA e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}