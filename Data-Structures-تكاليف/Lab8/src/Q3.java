public class Q3 {
    public void concatenate(LinkedQueue<E> Q2) {
        if (Q2.isEmpty()) return;
        if (isEmpty()) {
            this.front = Q2.front;
            this.rear = Q2.rear;
        } else {
            this.rear.next = Q2.front;
            this.rear = Q2.rear;
        }
        this.size += Q2.size;
        Q2.front = Q2.rear = null;
        Q2.size = 0;
    }
}
