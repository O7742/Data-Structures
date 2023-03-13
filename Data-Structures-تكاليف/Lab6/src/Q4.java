public class Q4 {
    public void concatenate(DoublyLinkedList<E> other) {
        if (other.isEmpty()) {
            return;
        }

        Node<E> lastNode = tail.getPrev();

        lastNode.setNext(other.header.getNext());
        other.header.getNext().setPrev(lastNode);

        tail = other.tail;

        other.header.setNext(null);
        other.tail.setPrev(null);
    }
}
