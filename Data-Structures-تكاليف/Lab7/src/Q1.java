import java.util.Stack;
public class Q1 {
    public static void transfer(Stack<Integer> S, Stack<Integer> T) {
        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }
}
