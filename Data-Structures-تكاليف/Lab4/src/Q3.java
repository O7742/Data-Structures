import java.util.Objects;

public class Q3 {
    public int size() {
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getNext();
        }
        return count;
    }


    }
}
