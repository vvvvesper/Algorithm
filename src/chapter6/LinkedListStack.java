package chapter6;

public class LinkedListStack<E> implements Stack<E> {
    private LinkedList linkedList = new LinkedList();

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E peek() {
        return (E)linkedList.getFirst();
    }

    @Override
    public E pop() {
        return (E)linkedList.removeFirst();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack:top  ");
        res.append(linkedList);
        return res.toString();
    }
}
