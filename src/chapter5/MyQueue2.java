package chapter5;
import java.util.Stack;

public class MyQueue2 {
    private Stack<Integer> stack;
    private int front;

    public MyQueue2(){
        stack = new Stack<>();
    }

    public void push(int e){
        if(stack.isEmpty()){
            front = e;
        }
        stack.push(e);
    }

    public int pop(){
        Stack<Integer> stack2 = new Stack<>();
        while(stack.size()>1){
            front = stack.peek();
            stack2.push(stack.pop());
        }

        int ret = stack.pop();

        while(!stack2.isEmpty()){
            stack.push(stack2.pop());
        }
        return ret;
    }

    public int peek(){
        return front;
    }
}
