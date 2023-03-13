import org.w3c.dom.Node;

public class Q6 {
    public void reverseList() {
        Node currentNode = head;
        Node previousNode = null;

        while (currentNode != null) {
            Node nextNode = currentNode.getNext();
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }

        head = previousNode;
    }

}
