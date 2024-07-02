public class Retangulo extends TwoDShape {

    public boolean isQuadrado(){ //método para saber se é ou não um quadrado
        if(getLargura() == getAltura()){
            return true;
        }
        else{
            return false;
        }
    }

    public double area(){ //calcula area
        return getLargura() * getAltura();
    }
}
