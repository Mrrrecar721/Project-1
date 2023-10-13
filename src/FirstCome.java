import java.util.ArrayList;

public class FirstCome implements Runnable{
    String threadName;
    int avgWait;
    int avgTurn;
    Thread t;

    ArrayList<Task> arrList;

    FirstCome(String name, ArrayList<Task> taskList) {
        this.arrList = taskList;
        this.threadName = name;
        t = new Thread(this, threadName);
        System.out.println("New Thread: " + t);
        averageWait();
    }

    private void averageWait(){
        int avg = 0;
        for (int i = 0; i < arrList.size()-1; i++) {
            avg += arrList.get(i).getBurst();
            avgWait+= avg;
            System.out.println(avgWait);
        }
        avgWait /= arrList.size();
    }

    @Override
    public void run() {
        for (Task task : arrList) {
            System.out.print(task.getTaskName() + "[" + task.getBurst() + "], ");
        }
        System.out.println("\nAverage Wait Time: " + avgWait + "ms\n" + "Average Turnaround Time: " + avgTurn + "ms");
    }
}
