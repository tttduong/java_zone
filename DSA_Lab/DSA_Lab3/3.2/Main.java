import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        int decimal_num = scanner.nextInt();

        ConvertDecimalToOctal convert = new ConvertDecimalToOctal(decimal_num);
        int octal_num = convert.convertDecimalToOctal();
        System.out.println("Convert from " +decimal_num+ " to " +octal_num);
//--------------------------------------------------------------------
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
//--------------------------------------------------------------------
        Stack<Integer> st2 = new Stack<>();
        st2.push(4);
        st2.push(5);
        st2.push(6);
        Stack<Integer> result1 = convert.concatenateTwoStacks(st1, st2);
        System.out.println(result1);
//--------------------------------------------------------------------
        System.out.println("-------------------------------");
        Stack<Integer> st3 = new Stack<>();
        st3.push(1);
        st3.push(2);
        st3.push(3);
        boolean result2 = convert.identicalStacks(st1, st2);
        System.out.println(result2);
    }

}
