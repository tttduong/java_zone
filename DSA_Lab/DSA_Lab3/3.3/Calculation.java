import java.util.Stack;

public class Calculation {
    public int evaluateExpress(String express) {
        
        Stack <Integer> operand_stack = new Stack<>();
        Stack <Character> operator_stack = new Stack<>();

        for (int i = 0; i < express.length(); i++) {
            char token = express.charAt(i);

            if (token == ' ') {
                continue;                           // bỏ qua space
            }

            if (Character.isDigit(token)) {
                StringBuilder string_builder = new StringBuilder();
                string_builder.append(token);
                while (i + 1 < express.length() && Character.isDigit(express.charAt(i + 1))) {
                    string_builder.append(express.charAt(++i));
                }
                operand_stack.push(Integer.parseInt(string_builder.toString()));
            } else if (token == '(') {
                operator_stack.push(token);
            } else if (token == ')') {
                while (operator_stack.peek() != '(') {
                    process_operation(operand_stack, operator_stack);
                }
                operator_stack.pop();
            } else if (isOperator(token)) {                       
                while (!operator_stack.isEmpty() && precedence(operator_stack.peek()) >= precedence(token)) {
                    process_operation(operand_stack, operator_stack);
                }
                operator_stack.push(token);
            } else {
                throw new IllegalArgumentException("Invalid character: " + token);
            }
        }

        while (!operator_stack.isEmpty()) process_operation(operand_stack, operator_stack);

        return operand_stack.pop();
    }

    private boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    private static void process_operation(Stack<Integer> operand_stack, Stack<Character> operator_stack) {
        char or = operator_stack.pop();
        int od2 = operand_stack.pop(); 
        int od1 = operand_stack.pop();
        int result = perform_operation(od1, od2, or); 
        operand_stack.push(result); 
    }

    private static int perform_operation(int od1, int od2, char or) {
        switch (or) {
            case '+':
                return od1 + od2;
            case '-':
                return od1 - od2;
            case '*':
                return od1 * od2;
            case '/':
                if (od2 == 0) {
                    throw new ArithmeticException("Divide zero");
                }
                return od1 / od2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + or);
        }
    }
}
