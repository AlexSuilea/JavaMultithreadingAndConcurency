package priority_and_state;

public class MainPriority {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        Thread thread1 = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName() + " priority = " + currentThread.getPriority());
        });

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.setName("Thread_1");

        Thread thread2 = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName() + " priority = " + currentThread.getPriority());
        });

        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setName("Thread_2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
