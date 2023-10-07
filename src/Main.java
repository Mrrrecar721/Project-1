import java.util.ArrayList;

// Richard Recar
// CSCI-340 Project-1
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello there, lets get it");

        Task t1 = new Task("T1", 1, 20);

        String firstTaskName = t1.getTaskName();


        ArrayList<Task> taskSet = new ArrayList<>();
        t1.printTask();
        System.out.println(firstTaskName);
    }
}