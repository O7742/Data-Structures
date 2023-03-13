public class Q2 {
    public int size() {
        int count = 0;
        Node<T> current = header.getNext();
        while (current != trailer) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}

