public class Task {
    String taskName = " ";
    int priority;
    int burst;

    Task(String name, int priority, int burst){
        this.taskName = name;
        this.priority = priority;
        this.burst = burst;
    }

    public void printTask(){
        System.out.println(taskName + "\n" + priority + "\n" + burst);
    }
}
