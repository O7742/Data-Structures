package java.util.Queue;
public class Q1 {
    public class ArrayQueue<E> implements Queue<E> {

        // instance variables
        private E[] data;
        private int f = 0;
        private int sz = 0;

        // constructors
        public ArrayQueue() {
            this(DEFAULT_CAPACITY);
        }

        public ArrayQueue(int capacity) {
            data = (E[]) new Object[capacity];
        }

        // methods
        public void rotate() {
            if (sz > 1) {
                E temp = dequeue();
                enqueue(temp);
            }
        }

        @Override
        public void enqueue(E e) throws IllegalStateException {
            if (sz == data.length) throw new IllegalStateException("Queue is full");
            int avail = (f + sz) % data.length;
            data[avail] = e;
            sz++;
        }

        @Override
        public E dequeue() {
            if (isEmpty()) return null;
            E answer = data[f];
            data[f] = null;
            f = (f + 1) % data.length;
            sz--;
            return answer;
        }

        @Override
        public E first() {
            if (isEmpty()) return null;
            return data[f];
        }

        @Override
        public int size() {
            return sz;
        }

        @Override
        public boolean isEmpty() {
            return (sz == 0);
        }
    }
}
