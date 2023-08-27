
package Entidad;


// @author new53
 
public class TaskManager {
    private String task;

    public TaskManager() {
    }

    public TaskManager(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "TaskManager{" + "task=" + task + '}';
    }   
}