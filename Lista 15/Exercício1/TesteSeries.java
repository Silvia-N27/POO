public class TesteSeries {
    public static void main(String[] args) {
        Series serie;

        serie = new MaisDois(0, 0);
        System.out.println("Série MaisDois:");

        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }

        serie.reset();
        System.out.println("Série MaisDois depois do reset:");

        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }

        serie.setStart(100);
        System.out.println("Série MaisDois a partir de 100:");

        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }

        serie = new MaisTres(0, 0);
        System.out.println("Série MaisTres:");

        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }

        serie.reset();
        System.out.println("Série MaisTres depois do reset:");

        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }

        serie.setStart(100);
        System.out.println("Série MaisTres a partir do 100: ");

        for (int i = 0; i < 5; i++) {
            System.out.println(serie.getNext());
        }
    }
}
