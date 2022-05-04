package chapter5;
import java.util.Stack;

public class MyQueue{
    private Stack<Integer> stack;
    public MyQueue(){
        stack = new Stack<>();
    }

    public int pop(){
        return stack.pop();
    }

    public int peek(){
        return stack.peek();
    }

    public void push(int e){
        Stack<Integer> stack2 = new Stack<>();
        while(!stack.isEmpty()){
            stack2.push(stack.pop());
        }

        stack2.push(e);

        while(!stack2.isEmpty()) {
            stack.push(stack2.pop());
        }
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}