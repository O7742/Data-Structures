public class Q2 {
    public int size() {
        int count = 0;
        if (tail == null) {
            return count;
        } else {
            count++;
            Node<E> current = tail.getnext;
            while (current != tail) {
                count++;
                current = current.getnext;
            }
        }
        return count;
    }

}
