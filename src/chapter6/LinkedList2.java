package chapter6;

import sun.awt.image.ImageWatched;

public class LinkedList2<E> {
    private class Node{
        public E e;
        public Node next;

        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node head;
    private int size;

    public LinkedList2(){
        head = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //在链表头添加元素e
    public void addFirst(E e){
//        Node node = new Node(e);
//        node.next = head;
//        head = node;
        head = new Node(e,head);
    }

    //在index位置添加元素e
    public void add(int index,E e){
        if(index<0 || index>size){
            throw new IllegalArgumentException("Add failed.Illegal index.");
        }
        if(index == 0){
            addFirst(e);
        }else{
            Node pre = head;
            for(int i=0;i<index-1;i++){
                pre = pre.next;
            }
            pre.next = new Node(e,pre.next);
            size++;
        }
    }

    public void addLast(E e){
        add(size,e);
    }


}
