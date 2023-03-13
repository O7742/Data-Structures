public class Q7 {
    @SuppressWarnings("unchecked")
    @Override
    public DoublyLinkedList<E> clone() throws CloneNotSupportedException {
        DoublyLinkedList<E> clone = (DoublyLinkedList<E>) super.clone();

        if (!isEmpty()) {
            Node<E> current = header.getNext();
            Node<E> cloneCurrent = new Node<>(current.getElement(), null, null);
            clone.header.setNext(cloneCurrent);

            while (current.getNext() != null) {
                current = current.getNext();
                Node<E> cloneNext = new Node<>(current.getElement(), cloneCurrent, null);
                cloneCurrent.setNext(cloneNext);
                cloneCurrent = cloneNext;
            }

            clone.tail = cloneCurrent;
        }

        return clone;
    }
}

