/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Entidad.TaskManager;
import Servicio.TaskManagerService;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;

/**
 *
 * @author new53
 */
public class TestEjercicio4 {
    private static TaskManager task1;
    private static TaskManager task2;
    private static TaskManager task3;
    
    public TestEjercicio4() {
    }
    
    @BeforeClass
    public static void setUpClass() { 
        task1 = new TaskManager("Clean the house");
        task2 = new TaskManager("Math homework");
        task3 = new TaskManager("Wash my clothes"); 
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void tasksAreAddingCorrectly(){
        System.out.println("before adding: " + TaskManagerService.taskList().toString());       
        TaskManagerService.addTask(task1);        
        System.out.println("after adding: " + TaskManagerService.taskList().toString());
        assertEquals(task1, TaskManagerService.taskList().get(TaskManagerService.taskList().indexOf(task1)));
    }  
    
    
    @Test
    public void tasksAreDeletingCorrectly(){ 
        TaskManagerService.addTask(task1);
        System.out.println("before deleting: " + TaskManagerService.taskList().toString());
        assertTrue(TaskManagerService.deleteTask(task1)); 
        System.out.println("After deleting: " + TaskManagerService.taskList().toString());       
    }  
    
    @Test
    public void taskListIsCorrect(){  
        TaskManagerService.addTask(task1); 
        TaskManagerService.addTask(task2);
        TaskManagerService.addTask(task3);
        TaskManager arrayTasks[] = {task1, task2, task3};
        assertArrayEquals(arrayTasks, TaskManagerService.taskList().toArray());
        System.out.println("Task list: " + TaskManagerService.taskList().toString());
    }     
}