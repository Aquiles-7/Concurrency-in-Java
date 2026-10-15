import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Corredor corredorA = new Corredor("A");
        Corredor corredorB = new Corredor("B");

        Thread hiloA = new Thread(corredorA);
        Thread hiloB = new Thread(corredorB);

        for (Thread thread : Arrays.asList(hiloA, hiloB)) {
            thread.start();
        }
    }
}
