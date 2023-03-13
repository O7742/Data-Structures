public class Q4 {
    public boolean sameElements(CircularlyLinkedList<E> other) {
        if (size != other.size) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        Node<E> walkA = tail;
        Node<E> walkB = other.tail;
        int count = 0;
        while (count < size && walkA.getElement().equals(walkB.getElement())) {
            walkA = walkA.getNext();
            walkB = walkB.getNext();
            count++;
        }
        return count == size;
    }
    //هذه الداله لتحقق
    boolean same = L.sameElements(M);

}

