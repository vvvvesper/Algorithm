package chapter2;

import chapter12.HeapSort;
import chapter7.MergeSort;
import chapter8.QuickSort;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;

public class SortingHelper {
    private SortingHelper(){};

    public static <E extends Comparable<E>> Boolean isSorted(E[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].compareTo(arr[i+1])>0){
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortName,E[] arr){
        Long startTime = System.nanoTime();
        if(sortName.equals("SelectionSort")){
            SelectionSort.sort(arr);
        }else if(sortName.equals("InsertionSort")){
            InsertionSort.sort(arr);
        }else if(sortName.equals("MergeSort")){
            MergeSort.sort(arr);
        }else if(sortName.equals("QuickSort")){
            QuickSort.sort(arr);
        }else if(sortName.equals("QuickSort2Ways")){
            QuickSort.sort2ways(arr);
        }else if(sortName.equals("QuickSort3Ways")){
            QuickSort.sort3ways(arr);
        }else if(sortName.equals("HeapSort")){
            HeapSort.sort(arr);
        }else if(sortName.equals("HeapSort2")){
            HeapSort.sort2(arr);
        }


        Long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        if(!SortingHelper.isSorted(arr)){
            throw new RuntimeException(sortName+" failed!");
        }
        System.out.println(String.format("%s,n=%d,%f s",sortName,arr.length,time));
    }
}
