public class Q3 {
    public boolean equals(CircularlyLinkedList<E> other) {
        if (size() != other.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Node<E> current = tail.next;
        Node<E> otherCurrent = other.tail.next;
        while (current != tail) {
            if (!current.getElement().equals(otherCurrent.getElement())) {
                return false;
            }
            current = current.next;
            otherCurrent = otherCurrent.next;
        }
        return tail.getElement().equals(other.tail.getElement());
    }

}

