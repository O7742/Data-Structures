public class Q3 {
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        DoublyLinkedList other = (DoublyLinkedList) obj;

        if (size() != other.size()) {
            return false;
        }

        Node<E> current = header.getNext();
        Node<E> otherCurrent = other.header.getNext();

        while (current != null && current.getNext() != null) {
            if (!current.getElement().equals(otherCurrent.getElement())) {
                return false;
            }

            current = current.getNext();
            otherCurrent = otherCurrent.getNext();
        }

        return true;
    }
}
