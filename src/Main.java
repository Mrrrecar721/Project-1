import java.util.ArrayList;


// Richard Recar
// CSCI-340 Project-1
public class Main {
    public static void main(String[] args) {

        //Create Hardcoded Input and place in list to be used by algorithms
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
        ArrayList<Task> taskSet2 = new ArrayList<>(taskSet);
        ArrayList<Task> taskSet3 = new ArrayList<>(taskSet);

        //Instance of First Come First Serve Algorithm Class
        FirstCome firstComeFirstServe = new FirstCome("one", taskSet);
        firstComeFirstServe.run();

        //Spacing
        System.out.print("\n");
        //Instance of Shortest Job First Algorithm Class
        ShortJobFirst shortJobFirst = new ShortJobFirst("two", taskSet2);
        shortJobFirst.run();

        //Spacing
        System.out.print("\n");

        //Instance of Preemptive Priority Algorithm Class
        PreemptivePriority preemptivePriority = new PreemptivePriority("three", taskSet3);
        System.out.print("\n");
        preemptivePriority.run();

        //Instance of Round Robin Algorithm Class

    }
}