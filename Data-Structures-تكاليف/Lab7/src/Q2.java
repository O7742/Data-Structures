import java.util.Stack;
public class Q2 {
    public static void removeAll(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            stack.pop();
            removeAll(stack);
        }
    }
}
