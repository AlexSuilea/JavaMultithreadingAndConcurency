package daemon_thread;

public class MyThread implements Runnable {
    private final int numberOfSeconds;

    public MyThread(int numberOfSeconds) {
        this.numberOfSeconds = numberOfSeconds;
    }

    @Override
    public void run() {
        for(int i=0; i<numberOfSeconds; i++) {
            try {
                System.out.println("Sleeping for " + (i+1) + "s, thread: " + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
