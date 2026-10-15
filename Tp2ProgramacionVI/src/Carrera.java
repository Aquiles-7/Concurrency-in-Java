
public class Carrera {

    public static void main(String[] args) {

        Corredor corredorA = new Corredor("A");
        Corredor corredorB = new Corredor("B");

        Thread hiloA = new Thread(corredorA);
        Thread hiloB = new Thread(corredorB);

        hiloA.start();
        hiloB.start();
    }
}
