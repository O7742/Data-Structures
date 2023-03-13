import java.util.Objects;

public class SinglyLinkedList<T> {
    // ...

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof SinglyLinkedList)) {
            return false;
        }

        SinglyLinkedList<T> otherList = (SinglyLinkedList<T>) o;

        if (size() != otherList.size()) {
            return false;
        }

        Node<T> currentNodeThis = head;
        Node<T> currentNodeOther = otherList.head;

        while (currentNodeThis != null) {
            if (!Objects.equals(currentNodeThis.data, currentNodeOther.data)) {
                return false;
            }

            currentNodeThis = currentNodeThis.next;
            currentNodeOther = currentNodeOther.next;
        }

        return true;
    }

    // ...
}