import java.util.Stack;
public class Q3 {
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else if (c == '+'  c == '-'  c == '*' || c == '/') {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(num1 + num2);
                        break;
                    case '-':
                        stack.push(num1 - num2);
                        break;
                    case '*':
                        stack.push(num1 * num2);
                        break;
                    case '/':
                        stack.push(num1 / num2);
                        break;
                }
}
