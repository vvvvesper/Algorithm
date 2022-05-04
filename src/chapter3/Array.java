package chapter3;

import java.util.Arrays;

public class Array<E> {
    private E[] data;
    private int size;

    public Array(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public Array(E[] arr){
        data = (E[])new Object[arr.length];
        for(int i=0;i<arr.length;i++){
            data[i] = arr[i];
        }
        size = arr.length;
    }

    public int getSize(){
        return this.size;
    }

    public int getCapacity(){
        return this.data.length;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }
    //在数组的末尾插入元素
    public void addLast(E e){
        add(size,e);
    }
    //在数组的开头插入元素
    public void addFirst(E e){
        add(0,e);
    }

    //在数组的指定位置插入元素
    public void add(int index,E e){
        if(index<0 || index>size)
            throw new IllegalArgumentException("add failed.Required index>=0 and index<=size!");

        if(size == data.length){
            resize(2 * data.length);
        }
        for(int i=size-1;i>=index;i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    //获取index位置元素
    public E get(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("Required index>=0 and index<=size!");
        }
        return data[index];
    }

    public E getLast(){
        return get(size -1);
    }

    public E getFirst(){
        return get(0);
    }

    //修改index位置元素
    public void set(int index,E e){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("Required index>=0 and index<=size!");
        }
        data[index] = e;
    }

    //判断元素是否存在
    public Boolean contains(E e){
        for(int i=0;i<size;i++){
            if(data[i].equals(e))
                return true;
        }
        return false;
    }

    //获取元素的索引,不存在返回-1
    public int find(E e){
        for(int i=0;i<size;i++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    public int[] findAll(E e){
        int[] arr = new int[data.length];
        int index = 0;
        for(int i=0;i<size;i++){
            if(data[i].equals(e)){
                arr[index] = i;
                index++;
            }
        }
        int[] arr2 = Arrays.copyOf(arr,index);
        return arr2;
    }

    //删除指定位置元素,返回删除的元素
    public E remove(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("Required index>=0 and index<=size!");
        }
//        E ret = data[index];
        for(int i=index;i<size-1;i++){
            data[i] = data[i+1];
        }
//        data[size] = null;
        size--;
        if(size == data.length/4 && data.length/2 !=0 ){
            resize(data.length / 2);
        }
//        return ret;
        return data[index];
    }

    //删除末尾元素
    public E removeLast(){
        return remove(size-1);
    }

    //删除首个元素
    public E removeFirst(){
        return remove(0);
    }

    //删除元素
    public void removeElement(E e){
        int index = find(e);
        if(index != -1){
            remove(index);
        }
    }

    public void removeAllElement(E e){
        for(int i=0;i<data.length;i++){
            if(data[i].equals(e)){
                remove(i);
            }
        }
    }

    public void swap(int i,int j){
        if(i<0 || i>=size || j<0 || j>=size){
            throw new IllegalArgumentException("Index is illegal");
        }
        E t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size=%d,capacity=%d\n",this.size,this.data.length));
        res.append("[");
        for(int i=0;i<size;i++){
            res.append(data[i]);
            if(i != size-1){
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }

    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for(int i=0;i<size;i++){
            newData[i] = data[i];
        }
        data = newData;
    }
}
