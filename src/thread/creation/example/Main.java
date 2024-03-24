package thread.creation.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are now in thread " + Thread.currentThread().getName());
                System.out.println("Current thread priority is set to " + Thread.currentThread().getPriority());
            }
        });

        thread.setName("New Worker Thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are now in thread " + Thread.currentThread().getName() + " before starting the new thread");
        thread.start();
        System.out.println("We are now in thread " + Thread.currentThread().getName() + " after starting the new thread");
    }
}