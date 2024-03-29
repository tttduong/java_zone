/*
 * Reading student records from a file, generating Student objects, counting and averaging
 * Suggested exercises:
 * - Use grade to determine the type of the student: excellent (> 89), ok [60,89], and failure (< 60)
 * - Define an enum type {excellent, ok, failure} and use it to print the student type
 * - Do counting and averaging within each student type (excellent, ok, and failure)
 * - Count students by using a static variable in class Student
 */
import java.util.Scanner;
import java.io.*;

public class Students
{
    public static void main (String[] args) throws IOException
    {   String first_name, last_name;
        int grade, total=0, count=0, num_exce=0, num_ok=0, num_fail=0;
        double average;
        int numberOfStudents = 7; 
        Scanner fileInput = new Scanner(new File("students.txt"));
        // while (fileInput.hasNext())
        for(int i = 0; i < 7; i++)
        {
            first_name = fileInput.next();
            last_name = fileInput.next();
            grade = fileInput.nextInt();
            
            Student st = new Student(first_name, last_name, grade);
            
            // System.out.println(st);
            System.out.print(st.lname+ " ---- Type: "); 
            if(grade>89){
                System.out.println("excellent");
                num_exce++; 

            }if((grade>=60)&&(grade<=89)){
                System.out.println("ok"); 
                num_ok++;
            }if(grade < 60){
                System.out.println("failure"); 
                num_fail++; 
            }
            
/*explain: if students'names in Student.java are declared by private, we have to use getter, setter 
to print them in another class (Students.java): 
            System.out.println(st.getlname()); -- with function getlname() is defined in Student.java
        To print students'names by "System.out.println(st.lname); ", their names have to be defined 
        in Student.java as public.

*/

            total = total + grade; 
            count++;
        }
        average = (double)total/count;
        System.out.println("There are " + count + " students with average grade " + average);
        
        System.out.println("\nNumber of excelent students: "+num_exce+"\nAverage of excelent students: "+num_exce*1.0/numberOfStudents*1.0);

        System.out.println("\nNumber of ok students: "+num_ok+"\nAverage of ok students: "+num_ok*1.0/numberOfStudents*1.0);

        System.out.println("\nNumber of failure students: "+num_fail+"\nAverage of failure students: "+num_fail*1.0/numberOfStudents*1.0);

    }
}