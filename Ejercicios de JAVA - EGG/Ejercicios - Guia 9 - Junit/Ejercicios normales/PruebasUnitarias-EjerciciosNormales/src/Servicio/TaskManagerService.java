
package Servicio;

import Entidad.TaskManager;
import java.util.ArrayList;


// @author new53
 
public class TaskManagerService {
    private static ArrayList<TaskManager> task = new ArrayList<>();
    
    public TaskManagerService(){}
     
    public static void addTask(TaskManager task){
        if(!TaskManagerService.task.contains(task)){
            TaskManagerService.task.add(task);
        }       
    }
    
    public static boolean deleteTask(TaskManager task){
        if(TaskManagerService.task.contains(task)){
            TaskManagerService.task.remove(task);
            return true;
        }else{
            return false;
        }
    }
    
    public static ArrayList<TaskManager> taskList(){
        return task;
    }
}