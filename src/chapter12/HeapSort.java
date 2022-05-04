package chapter12;

import chapter1.ArrayGenerator;
import chapter2.SortingHelper;

import java.util.Arrays;

public class HeapSort {
    private HeapSort(){};

    public  static <E extends Comparable<E>> void sort(E[] data){
        MaxHeap<E> maxHeap = new MaxHeap<>();
        for(E e:data){
            maxHeap.add(e);
        }
        for(int i=data.length-1;i>=0;i--){
            data[i] = maxHeap.extractMax();
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] data){
        if(data.length<=1){
            return;
        }
        for(int i=(data.length-2)/2;i>=0;i--){
            siftDown(data,i,data.length);
        }

        for(int i=(data.length-1);i>=0;i--){
            swap(data,i,0);
            siftDown(data,0,i);
        }
    }

    private static <E extends Comparable<E>> void siftDown(E[] data,int k,int n){
        while((2*k+1) < n){
            int j = 2*k+1;
            if(j+1 <n && data[j].compareTo(data[j+1])<0){
                j = 2*k+2;
            }
            if(data[k].compareTo(data[j])>=0){
                break;
            }
            swap(data,k,j);
            k = j;
        }
    }

    public static <E extends Comparable<E>> void swap(E[] data,int i,int j){
        E t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    public static void main(String[] args) {
        int n = 1000000;
        Integer[] arr = ArrayGenerator.generatorRandomArray(n,n);
        Integer[] arr2 = Arrays.copyOf(arr,arr.length);
        Integer[] arr3 = Arrays.copyOf(arr,arr.length);
        Integer[] arr4 = Arrays.copyOf(arr,arr.length);
        Integer[] arr5 = Arrays.copyOf(arr,arr.length);
        Integer[] arr6 = Arrays.copyOf(arr,arr.length);

        SortingHelper.sortTest("MergeSort",arr);
        SortingHelper.sortTest("QuickSort",arr2);
//        SortingHelper.sortTest("QuickSort2",arr3);
//        SortingHelper.sortTest("QuickSort3",arr4);
        SortingHelper.sortTest("HeapSort",arr5);
        SortingHelper.sortTest("HeapSort2",arr6);
    }
}
