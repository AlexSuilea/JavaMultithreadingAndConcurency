package creation;

public class MyThread extends Thread{
    public void run() {
        setName("MyThread");
        System.out.println("Current thread: " + Thread.currentThread().getName());
    }
}
