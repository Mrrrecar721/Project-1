import java.util.ArrayList;
import java.util.Random;

public class PreemptivePriority implements Runnable {
    String threadName;
    int completionTime;
    int turnAroundT;
    int waitTime;

    Thread t;

    ArrayList<Task> arrList;

    final int arrSize;

    PreemptivePriority(String name, ArrayList<Task> taskList) {
        this.arrList = taskList;
        this.arrSize = arrList.size();
        this.threadName = name;
        t = new Thread(this, threadName);
        randomBurst();
        ArrivalSort.quickSort(taskList, 0, arrSize-1);
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

    public void process(){
        ArrayList<Task> tempList = new ArrayList<Task>(arrList);
        ArrayList<Integer> arrivalTimes = new ArrayList<Integer>();
        ArrayList<Task> scheduled = new ArrayList<Task>();
        scheduled.add(tempList.get(0));

        for (int i = 0; i < arrSize; i++) {
            arrivalTimes.add(tempList.get(i).getArrivalTime());
            System.out.println(tempList.get(i).getArrivalTime() + " " + tempList.get(i).getPriority() + " " + tempList.get(i).getBurst());
//            System.out.println(arrivalTimes.get(i));
        }
    }




    @Override
    public void run() {
        int avg = 0;
        int count= 0;

        this.process();

    }
}
