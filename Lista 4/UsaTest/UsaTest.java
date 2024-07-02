public class UsaTest {
    public static void main(String[] args) {
        Test test1 = new Test(5);
        Test test2 = new Test(10);

        System.out.println("Antes da troca");
        System.out.println("ob1.a = " + test1.getA());
        System.out.println("ob2.a = " + test2.getA());

        troca (test1, test2);

        System.out.println("Depois da troca");
        System.out.println("ob1.a = " + test1.getA());
        System.out.println("ob2.a = " + test2.getA());
    }
    public static void troca(Test ob1, Test ob2){
        int aux=ob1.getA();
        ob1.setA(ob2.getA());
        ob2.setA(aux);
    }
    /*no método troca a varíavel aux é criada para armazenar o valor do atributo "a" do objeto "ob1" e depois
    o valor do atributo "a" do objeto "ob2" é atribuído ao atributo "a" do objeto "ob1" usando o método setA e depois
    o valor da varíavel "temp" é atribuído ao atributo "a" do objeto "ob2" usando o método setA*/
}