import java.util.ArrayList;

// Richard Recar
// CSCI-340 Project-1
public class Main {
    public static void main(String[] args) {

        Task t1 = new Task("T1", 2, 20);
        Task t2 = new Task("T2", 4, 25);
        Task t3 = new Task("T3", 3, 25);
        Task t4 = new Task("T4", 3, 15);
        Task t5 = new Task("T5", 1, 10);
        ArrayList<Task> taskSet = new ArrayList<>();
        taskSet.add(0, t1);
        taskSet.add(1, t2);
        taskSet.add(2, t3);
        taskSet.add(3, t4);
        taskSet.add(4, t5);

        FirstCome firstComeFirstServe = new FirstCome("one", taskSet);
        firstComeFirstServe.run();
    }
}