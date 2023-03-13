
public class Q4 {
    public static <E> E josephus(ArrayQueue<E> queue, int k) {
        if (queue.isEmpty()) return null;
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.rotate();
            }
            E e = queue.dequeue();
            System.out.println("Removing " + e.toString() + " from the circle");
        }
        return queue.dequeue();
    }
}
