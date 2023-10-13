import java.util.ArrayList;

public class NewThread implements Runnable {
    String threadName;
    Thread t;

    ArrayList<Task> arrList;

    NewThread(String name, ArrayList<Task> taskSet) {
        this.threadName = name;
        t = new Thread(this, threadName);
        System.out.println("New Thread: " + t);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + "Interrupted");
        }
        System.out.println(threadName + " exiting.");
    }
}
