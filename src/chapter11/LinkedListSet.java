package chapter11;

import chapter6.LinkedList;

public class LinkedListSet<E extends Comparable<E>> implements Set<E> {

    LinkedList<E> linkedList;

    public LinkedListSet(){
        linkedList = new LinkedList<>();
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
    public boolean contains(E e) {
        return linkedList.contains(e);
    }

    @Override
    public void add(E e) {
        if(!linkedList.contains(e)){
            linkedList.addFirst(e);
        }
    }

    @Override
    public void remove(E e) {
        linkedList.removeElement(e);
    }
}
