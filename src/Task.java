public class Task {
    private String taskName = " ";
    private int priority;
    private int burst;

    private int burstLeft;

    private int arrivalTime;


    //Task Class Constructor
    public Task(String name, int priority, int burst){
        this.taskName = name;
        this.priority = priority;
        this.burst = burst;
        this.burstLeft = burst;
        this.arrivalTime = 0;
    }

    //Setters (ability to modify members)
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public void setBurst(int burst) {
        this.burst = burst;
    }
    public void setBurstLeft(int burstLeft) {
        this.burstLeft = burstLeft;
    }
    public void setArrivalTime(int arrival) {
        this.arrivalTime = arrival;
    }

    //Getters (retrieving members)
    public int getPriority() {
        return priority;
    }
    public String getTaskName() {
        return taskName;
    }
    public int getBurst() {
        return burst;
    }

    public int getArrivalTime() {return arrivalTime; }

    //Print Task
    public void printTask(){
        System.out.println(taskName + "\n" + priority + "\n" + burst);
    }
}
