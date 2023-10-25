package home;

public class Pair<T,E> {
    T first;
    E second;

    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }
}
