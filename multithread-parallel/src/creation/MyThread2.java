package creation;

public class MyThread2 extends Thread implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("MyThread2");
        System.out.println("Current Thread: " + Thread.currentThread().getName());
    }
}
