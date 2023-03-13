package java.util.Queue;
public class Q2 {
    public ArrayQueue<E> clone() {
        ArrayQueue<E> copy = new ArrayQueue<>(data.length);
        copy.f = this.f;
        copy.sz = this.sz;
        copy.data = Arrays.copyOf(this.data, this.data.length);
        return copy;
    }
}
