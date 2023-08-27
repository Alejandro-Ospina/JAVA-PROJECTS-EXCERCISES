
package Main;

//  @author new53

import Service.StudentService;

public class Ejercicio3 {

    public static void main(String[] args) {
        StudentService.createStudents();
        System.out.println("\nFinal grade for alejo: " + StudentService.finalStudentGrade("pedro"));
        System.out.println("\nStudents data: \n" + StudentService.studentsList());
    }
}