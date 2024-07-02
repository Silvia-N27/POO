public class Ponto2D {
    private double x;
    private double y;
    private static int contador=0;

    public Ponto2D(){ //construtor sem parâmetro
        this.x=0;
        this.y=0;
        ++contador;
    }

    public Ponto2D(double x, double y){ //construtor com parâmetro
        this.x=x;
        this.y=y;
        ++contador;
    }

    public void setX(double x){ //modificar o atributo x
        this.x=x;
    }

    public void setY(double y){ //modificar o atributo y
        this.y=y;
    }

    public double getX(){ //exibir o x
        return this.x;
    }

    public double getY(){ //exibir o y
        return this.y;
    }

    public static int getContador(){ //exibir o valor do contador
        return contador;
    }

}