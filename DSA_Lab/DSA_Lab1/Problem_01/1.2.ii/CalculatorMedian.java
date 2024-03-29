import java.util.Scanner;

public class CalculatorMedian {
    static int[] numbers;
    Scanner sc = new Scanner(System.in);
    
    public void inputArray() {
        
        System.out.println("Enter size: ");
        int s = sc.nextInt();
        numbers = new int[s];
        for(int i = 0; i < s; i++) {
            System.out.print("Enter number [" +(i + 1)+ "]: ");
            numbers[i] = sc.nextInt();
        }
    }

    public void printArray() {
        System.out.println("Array: ");
        for(int number : numbers) {
            System.out.println(number);
        }
    }

    public static int calculateMedian(int[] numbers) {
        int key = 0;
        int outcome;
        for(int i : numbers) {
            key += i;
        }
        outcome = key / numbers.length;
        return outcome;
    }
    public static void main(String[] args) {
        CalculatorMedian cm = new CalculatorMedian();
        cm.inputArray();
        cm.printArray();
        int median = calculateMedian(numbers); 
        System.out.println("Median: " + median);
    }

    
}
