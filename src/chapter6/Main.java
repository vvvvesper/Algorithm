package chapter6;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i=0;i<5;i++){
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }

        linkedList.add(2,666);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        System.out.println("=============================================");
        LinkedListStack linkedListStack = new LinkedListStack();
        for(int i=0;i<10;i++){
            linkedListStack.push(i);
        }
        System.out.println(linkedListStack);
        System.out.println(linkedListStack.peek());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack);
        System.out.println(linkedListStack.isEmpty());
        System.out.println(linkedListStack.getSize());

        System.out.println("=============================================");
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        for(int i=0;i<10;i++){
            linkedListQueue.enqueue(i);
        }
        System.out.println(linkedListQueue);
        System.out.println(linkedListQueue.getFront());
        System.out.println(linkedListQueue.dequeue());
        System.out.println(linkedListQueue);
        System.out.println(linkedListQueue.isEmpty());
        System.out.println(linkedListQueue.getSize());
    }
}
