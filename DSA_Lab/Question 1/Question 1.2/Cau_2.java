import java.util.Scanner;

public class Cau_2 {
    static int[] numbers;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Cau_2 c2 = new Cau_2();
        c2.Input();
        c2.Output();
        int outcome_2 = Median(numbers); 
        System.out.println("Outcome: " + outcome_2);
    }

    public void Input() {
        System.out.println("Input size: ");
        int s = sc.nextInt();
        numbers = new int[s];
        for(int i = 0; i < s; i++) {
            System.out.print("Input number [" +(i + 1)+ "]: ");
            numbers[i] = sc.nextInt();
        }
    }

    public void Output() {
        System.out.println("Outcome: ");
        for(int number : numbers) {
            System.out.println(number);
        }
    }

    public static int Median(int[] numbers) {
        int key = 0;
        int outcome;
        for(int i : numbers) {
            key += i;
        }
        outcome = key / numbers.length;
        return outcome;
    }
}
