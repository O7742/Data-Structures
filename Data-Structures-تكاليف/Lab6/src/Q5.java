public class Q5 {
    public class DoublyLinkedList<E> {
        private Node<E> sentinel;

        public DoublyLinkedList() {
            sentinel = new Node<>(null, null, null);
            sentinel.setPrev(sentinel);
            sentinel.setNext(sentinel);
        }

        public boolean isEmpty() {
            return sentinel.getNext() == sentinel;public class DoublyLinkedList<E> {
                private Node<E> sentinel;

                public DoublyLinkedList() {
                    sentinel = new Node<>(null, null, null);
                    sentinel.setPrev(sentinel);
                    sentinel.setNext(sentinel);
                }

                public boolean isEmpty() {
                    return sentinel.getNext() == sentinel;
                }

                public void addFirst(E element) {
                    addBetween(element, sentinel, sentinel.getNext());
                }

                public void addLast(E element) {
                    addBetween(element, sentinel.getPrev(), sentinel);
                }

                public E removeFirst() {
                    if (isEmpty()) {
                        return null;
                    }

                    return remove(sentinel.getNext());
                }

                public E removeLast() {
                    if (isEmpty()) {
                        return null
        }

        public void addFirst(E element) {
            addBetween(element, sentinel, sentinel.getNext());
        }

        public void addLast(E element) {
            addBetween(element, sentinel.getPrev(), sentinel);
        }

        public E removeFirst() {
            if (isEmpty()) {
                return null;
            }

            return remove(sentinel.getNext());
        }

        public E removeLast() {
            if (isEmpty()) {
                return null
}
