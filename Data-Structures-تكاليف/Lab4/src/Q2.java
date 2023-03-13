import java.util.NoSuchElementException;

public class SinglyLinkedList<T> {

    private Node<T> head;

    // Other methods...

    public Node<T> findSecondToLast() {
        if (head == null || head.next == null) {
            throw new NoSuchElementException("List has fewer than two nodes");
        }

        Node<T> current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        return current;
    }

    // Other methods...

}