package example;

public class JoinExample {

    public static void main(String[] args) throws InterruptedException {
        // Thread 1: conta da 0 a 10
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        // Thread 2: conta da 11 a 20
        Thread t2 = new Thread(() -> {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        // Thread 3: conta da 21 a 30
        Thread t3 = new Thread(() -> {
            for (int i = 21; i <= 30; i++) {
                System.out.println("Thread 3: " + i);
            }
        });

        // Avvio dei thread
        t1.start();
        t2.start();
        t3.start();

        // Aspetto che tutti e 3 i thread finiscano
        t1.join(); // aspetta che t1 finisca
        t2.join(); // aspetta che t2 finisca
        t3.join(); // aspetta che t3 finisca

        // Questo viene stampato solo dopo che tutti i thread sono terminati
        System.out.println("Fine!");
    }
}