package thread_groups;

public class MyThread implements Runnable {
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread currentThread = Thread.currentThread();
                System.out.println("Name: " + currentThread.getName() + " Priority: " + currentThread.getPriority());
                break;
            }
        }
    }
}
