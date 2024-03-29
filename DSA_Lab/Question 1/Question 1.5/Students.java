import java.util.Scanner;
import java.io.*;

public class Students {
    public static void main(String[] args) throws IOException {
        String first_name, last_name;
        int grade, total = 0, count = 0, excellent = 0, OK = 0, failure = 0;
        double average;
        int numberOfStudents = 7;
        Scanner fileInput = new Scanner(new File("students.txt"));
        for (int i = 0; i < 7; i++) {
            first_name = fileInput.next();
            last_name = fileInput.next();
            grade = fileInput.nextInt();

            Student st = new Student(first_name, last_name, grade);
            System.out.print(st.lname + " ---- Type: ");
            if (grade > 89) {
                System.out.println("Excellent");
                excellent++;
            }
            if (grade >= 60 && grade <= 89) {
                System.out.println("OK");
                OK++;
            }
            if (grade < 60) {
                System.out.println("Failure");
                failure++;
            }

            total = total + grade;
            count++;
        }
        average = (double) total / count;
        System.out.println("There are " + count + " students with average grade " + average);

        System.out.println("\nNumber of excelent students: " + excellent + "\nAverage of excelent students: "
                + excellent * 1.0 / numberOfStudents * 1.0);

        System.out.println(
                "\nNumber of ok students: " + OK + "\nAverage of ok students: " + OK * 1.0 / numberOfStudents * 1.0);

        System.out.println("\nNumber of failure students: " + failure + "\nAverage of failure students: "
                + failure * 1.0 / numberOfStudents * 1.0);

    }
}