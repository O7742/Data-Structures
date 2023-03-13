import java.util.Objects;

public class Q4 {
    public void rotate() {
        if (head == null || head.getNext() == null) {
            return;
        }

        Node temp = head;
        head = head.getNext();
        temp.setNext(null);

        Node lastNode = head;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }

        lastNode.setNext(temp);
    }

}
}
