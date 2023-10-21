import java.util.ArrayList;
import java.util.Random;

public class PreemptivePriority implements Runnable {
    String threadName;
    int avgWait;
    int avgTurn;
    Thread t;

    ArrayList<Task> arrList;

    final int arrSize;

    //Random Gen




    PreemptivePriority(String name, ArrayList<Task> taskList) {
        this.arrList = taskList;
        this.arrSize = arrList.size();
        this.threadName = name;
        t = new Thread(this, threadName);
        randomBurst();
        averageWait();
        avgTurnAround();
    }

    private void randomBurst(){
        Random rand = new Random();
        for (int i = 0; i < arrSize; i++) {
            arrList.get(i).setArrivalTime(rand.nextInt(100));
            if(i< arrSize - 1)
                System.out.print(arrList.get(i).getTaskName() +" Arrival Time: "+ arrList.get(i).getArrivalTime() + "ms, ");
            else
                System.out.print(arrList.get(i).getTaskName() +" Arrival Time: "+ arrList.get(i).getArrivalTime() + "ms ");
        }
    }

    private void averageWait(){
        int avg = 0;
        for (int i = 0; i < arrSize-1; i++) {
            avg += arrList.get(i).getBurst();
            avgWait+= avg;
        }
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
        avgTurn /= arrSize;
    }

    @Override
    public void run() {
        int avg = 0;
        int count= 0;
        for (Task task : arrList) {
            avg += arrList.get(count).getBurst();
            System.out.print(task.getTaskName() + "[" + (avg - arrList.get(count).getBurst()) + "-" + avg + "] ");
            count++;
        }
        System.out.println("\nAverage Wait Time: " + avgWait + "ms\n" + "Average Turnaround Time: " + avgTurn + "ms");
    }
}
