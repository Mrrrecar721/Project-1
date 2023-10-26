import java.util.ArrayList;

public class FirstCome implements Runnable{
    String threadName;
    int avgWait;
    int avgTurn;
    Thread t;

    ArrayList<Task> arrList;

    final int arrSize;
    //Constuctor, calls two functions to get average wait time and average turn around time
    FirstCome(String name, ArrayList<Task> taskList) {
        this.arrList = taskList;
        this.arrSize = arrList.size();
        this.threadName = name;
        t = new Thread(this, threadName);
        averageWait();
        avgTurnAround();
    }

    private void averageWait(){
        int avg = 0;
        for (int i = 0; i < arrSize-1; i++) {
            avg += arrList.get(i).getBurst();
            avgWait+= avg;
        }
        //Take sum of burst times and divide by number of tasks
        avgWait /= arrSize;
    }

    private void avgTurnAround(){
        int avg = 0;
        int count = 0;
        for (Task task : arrList) {
            avg += arrList.get(count).getBurst();
            avgTurn += avg;
            count++;
        }
        //Take sum of burst times and divide by number of tasks
        avgTurn /= arrSize;
    }

    @Override
    public void run() {
        int avg = 0;
        int count= 0;
        System.out.println("First Come First Serve\n----------------------");
        for (Task task : arrList) {
            avg += arrList.get(count).getBurst();
            System.out.print(task.getTaskName() + "[" + (avg - arrList.get(count).getBurst()) + "-" + avg + "] ");
            count++;
        }
        System.out.println("\nAverage Wait Time: " + avgWait + "ms\n" + "Average Turnaround Time: " + avgTurn + "ms");
    }
}


