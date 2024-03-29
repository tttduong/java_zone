import java.util.Scanner;
import java.io.*;

public class Students
{
    public static void main (String[] args) throws IOException
    {   String first_name, last_name;
        int grade, total=0, count=0;
        double average;
        String fileName = "Question 1.5/student.txt";
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext())
        {
            first_name = scanner.next();
            last_name = scanner.next();
            grade = scanner.nextInt();
            
            Student st = new Student(first_name, last_name, grade);
            
            System.out.println(st);
            total = total + grade; 
            count++;
        }
        average = (double)total/count;
        System.out.println("There are " + count + " students with average grade " + average);
    }
}