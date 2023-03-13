import java.util.Stack;
public class Q4 {
    public class ArrayStack<T> implements Stack<T> {
        private T[] data;
        private int top = -1;

        // Constructor
        public ArrayStack(int capacity) {
            data = (T[]) new Object[capacity];
        }

        // Clone method
        @Override
        public ArrayStack<T> clone() throws CloneNotSupportedException {
            ArrayStack<T> cloneStack = (ArrayStack<T>) super.clone();
            cloneStack.data = data.clone();
            return cloneStack;
        }

        // Other methods of ArrayStack class
        // ...
    }
}
