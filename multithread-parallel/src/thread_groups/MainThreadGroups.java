package thread_groups;

public class MainThreadGroups {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group1 = new ThreadGroup("Group1");
        ThreadGroup parent = group1.getParent();

        parent.setMaxPriority(7);
        System.out.println("Name: " + parent.getName() + " Priority: " + parent.getMaxPriority());

        Thread thread1 = new Thread(group1, new MyThread(), "Thread1");
        Thread thread2 = new Thread(group1, new MyThread(), "Thread2");
        Thread thread3 = new Thread(group1, new MyThread(), "Thread3");

        thread1.setPriority(10);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Thread sleeping for 3 seconds...");
        Thread.sleep(3000);

        group1.interrupt();
    }
}
