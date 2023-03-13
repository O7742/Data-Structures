import java.util.Objects;

public class Q5 {
    Node concatenateLists(Node L, Node M) {
        if (L == null) {
            return M;
        }
        Node currentNode = L;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(M);
        return L;
    }
}
