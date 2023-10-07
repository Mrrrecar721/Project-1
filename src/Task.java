public class Task {
    private String taskName = " ";
    private int priority;
    private int burst;

    //Constructor
    public Task(String name, int priority, int burst){
        this.taskName = name;
        this.priority = priority;
        this.burst = burst;
    }

    //Setters
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public void setBurst(int burst) {
        this.burst = burst;
    }

    //Getters
    public int getPriority() {
        return priority;
    }
    public String getTaskName() {
        return taskName;
    }
    public int getBurst() {
        return burst;
    }

    //Print Task
    public void printTask(){
        System.out.println(taskName + "\n" + priority + "\n" + burst);
    }
}
