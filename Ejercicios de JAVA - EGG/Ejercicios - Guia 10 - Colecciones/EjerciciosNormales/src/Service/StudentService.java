
package Service;

import Entity.Student;
import java.util.ArrayList;
import java.util.Scanner;


// @author new53
 
public class StudentService {  
    private static final ArrayList<Student> studentList = new ArrayList<>();
    private static final Scanner read = new Scanner(System.in); 
       
    public static void createStudents(){                                
        System.out.print("Sign up the student name: ");
        String answer;
        while(true){
            Student student = new Student();
            double grades[] = new double[3];
            student.setStudentName(read.nextLine());
            System.out.println("Write down the three grades of student");
            for(int i=0; i<grades.length; i++){
                System.out.print("Grade number " + (i+1) + " of student: ");
                grades[i] = read.nextDouble();
            }
            read.nextLine();
            student.setGrades(grades);
            studentList.add(student);
            System.out.print("\n¿Would you like to add another student to list? (y/n): ");
            answer = read.nextLine();
            if("n".equalsIgnoreCase(answer)){
                System.out.println("¡No more students will be added!");                
                break;
            }else{
                System.out.print("Add another student name: ");
            }
        }
    }
    
    public static double finalStudentGrade(String studentName){
        double add = 0;
        for(int i=0; i<studentList.size(); i++){
            if(studentList.get(i).getStudentName().equalsIgnoreCase(studentName)){
                for(double gr : studentList.get(i).getGrades()){
                    add += gr;
                }
                return (add/studentList.get(i).getGrades().length);
            }
        }
        return 0.0d;
    }
    
    public static ArrayList<Student> studentsList(){
        return studentList;
    }
}