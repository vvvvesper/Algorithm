package chapter11;

public interface Set<E extends Comparable<E>> {
    int getSize();
    boolean isEmpty();
    boolean contains(E e);
    void add(E e);
    void remove(E e);
}
