package priority_and_state;

public class MainState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            System.out.println("[1] State: " + currentThread.getState());
        });

        System.out.println("[2] State: " + thread.getState());

        thread.start();

        System.out.println("[3] State: " + thread.getState());

        thread.join();

        System.out.println("[3] State: " + thread.getState());
    }
}
