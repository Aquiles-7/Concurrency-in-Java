
public class Corredor implements Runnable {

    private String nombre;

    public Corredor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int metros = 10; metros <= 100; metros += 10) {
            System.out.println("Corredor " + nombre
                    + " ha avanzado " + metros + " metros");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("La carrera del corredor "
                        + nombre + " fue interrumpida.");
                return;
            }
        }

        System.out.println("Corredor " + nombre
                + " ha finalizado la carrera");
    }
}
