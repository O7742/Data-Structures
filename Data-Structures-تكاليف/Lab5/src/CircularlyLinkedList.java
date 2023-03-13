public class CircularlyLinkedList {//Q6
    public CircularlyLinkedList<E> clone() {
        CircularlyLinkedList<E> newList = new CircularlyLinkedList<>();

        if (head == null) {
            return newList;
        }

        Node current = head;
        do {
            newList.addLast(current.element);
            current = current.next;
        } while (current != head);

        return newList;
    }

}
