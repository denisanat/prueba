public class PruebaSync extends Thread {

    public static int numero = 0;
    private static Object lock = new Object();

    public PruebaSync(String nombre) {
        super(nombre);
    }

    public void run() {

        synchronized ( lock ) {

            numero++;
            for (int i = 0; i < 10; i++)
                System.out.println( getName() );

            System.out.println( numero );

        }
    }

    public static void main(String[] args) {
        new PruebaSync("primer hilo").start();
        new PruebaSync("segundo hilo").start();
        System.out.println("Hola mundo");
    }
}

