package chapter10;

public class BST2<E extends Comparable<E>> {
    private class Node{
        private E e;
        private Node left,right;
        public Node(E e){
            this.e = e;
            left =null;
            right=null;
        }
    }

    private Node root;
    private int size;

    public BST2(){
        this.root = null;
        this.size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(E e){
        if(root == null){
            root = new Node(e);
            size++;
        }
        else{
            add(root,e);
        }
    }
    // 向以node为根的二分搜索树中插入元素e，递归算法
    // 返回插入新节点后二分搜索树的根
    public void add(Node node,E e){
        if(e.equals(node.e)){
            return;
        }
        else if(e.compareTo(node.e)<0 && (node.left==null)){
            node.left = new Node(e);
            size++;
            return;
        }
        else if(e.compareTo(node.e)>0 && (node.right==null)){
            node.right = new Node(e);
            size++;
            return;
        }
        if(e.compareTo(node.e)<0){
            add(node.left,e);
        }
        else{
            add(node.right,e);
        }
    }
}
