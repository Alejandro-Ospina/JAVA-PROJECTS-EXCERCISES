
package Entity;

import java.util.Arrays;


// @author new53
 
public class Student {
    private String studentName;
    private double grades[];

    public Student() {
    }

    public Student(String studentName, double[] grades) {
        this.studentName = studentName;
        this.grades = grades;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student information{" + "studentName=" + studentName + ", grades=" + Arrays.toString(grades) + '}';
    }
}