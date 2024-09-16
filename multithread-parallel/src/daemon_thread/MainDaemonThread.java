package daemon_thread;

public class MainDaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyThread(10), "Thread1");
        Thread thread2 = new Thread(new MyThread(5), "Thread2");

        thread1.setDaemon(true); //stops thread1 if thread 2 finished processing first

        thread1.start();
        thread2.start();

//        thread1.join();// not working with Daemon!
    }
}
