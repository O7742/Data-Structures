public class Q1 {
    public Node<E> findMiddleNode() {
        if (isEmpty()) {
            return null;
        }

        Node<E> slow = header.getNext();
        Node<E> fast = header.getNext();

        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow;
    }
}
