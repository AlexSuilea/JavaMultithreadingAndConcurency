package creation;

import creation.MyThread;
import creation.MyThread2;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = Thread.currentThread();
        System.out.println("Current thread: " + thread.getName());

        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            System.out.println("Thread interrupted");
        }

        MyThread myThread = new MyThread();
        MyThread2 myThread2 = new MyThread2();
        myThread.start();
        myThread2.start();
    }
}