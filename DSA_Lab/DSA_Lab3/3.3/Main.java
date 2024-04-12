import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input expression: ");
        String express = scanner.nextLine();

        try {
            int result = c.evaluateExpress(express);
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("error = " + e.getMessage());
        }
    }
}