import java.util.Stack;

public class ConvertDecimalToOctal{
    int decimal_num;

    public ConvertDecimalToOctal(int decimal_num) {
        this.decimal_num = decimal_num;
    }
    public int convertDecimalToOctal() {
        int octal_num = 0;
        int position = 1;
        Stack<Integer> st = new Stack<>();

        if (decimal_num == 0) {
            return 0;
        }
        while (decimal_num != 0) {
            int reminder = decimal_num % 8;
            st.push(reminder);
            decimal_num /= 8;
        }
        Stack<Integer> st2 = new Stack<>();
        while (!st.isEmpty()) {
            st2.push(st.pop());
        }
        while (!st2.isEmpty()) {
            octal_num += st2.pop() * position;
            position *= 10;
        }
        return octal_num;
    }
    public Stack<Integer> concatenateTwoStacks(Stack<Integer> st1, Stack<Integer> st2) {
        Stack<Integer> result = new Stack<>();

        Stack<Integer> temp1 = new Stack<>();
        temp1.addAll(st1);

        Stack<Integer> temp2 = new Stack<>();
        temp2.addAll(st2);

        while (!temp1.isEmpty()) {
            result.push(temp1.pop());
        }
        while (!temp2.isEmpty()) {
            result.push(temp2.pop());
        }

        return result;
    }
    public boolean identicalStacks(Stack<Integer> st1, Stack<Integer> st2) {
        if(st1.size() != st2.size()) {
            return false;
        }
        while (!st1.isEmpty()) {
            if(!st1.pop().equals(st2.pop())) {
                return false;
            }
        }
        return true;


    }
}
