package chapter7;

import chapter1.ArrayGenerator;
import chapter2.SortingHelper;

import java.util.Arrays;

public class MergeSort<E> {
    private MergeSort(){};

    public static <E extends Comparable<E>> void sort(E[] arr){
        sort(arr,0,arr.length-1);
    }

    public static <E extends Comparable<E>> void sort(E[] arr,int l,int r){
        if(l>=r) return;
        //int mid = l + (r-l)/2; 解决数组越界问题
        int mid = (l + r) / 2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    public static <E extends Comparable<E>> void merge(E[] arr,int l,int mid,int r){
        E[] temp = Arrays.copyOfRange(arr,l,r+1);
        int i=l,j=mid+1;
        for(int k = l;k<=r;k++){
            if(i>mid){
                arr[k] = temp[j-l];j++;
            }else if(j>r){
                arr[k] = temp[i-l];i++;
            }else if(temp[i-l].compareTo(temp[j-l])<=0){
                arr[k] = temp[i-l];i++;
            }else{
                arr[k] = temp[j-l];j++;
            }
        }
    }

    public static void main(String[] args) {
        int n = 100000;
        Integer[] arr = ArrayGenerator.generatorRandomArray(n,n);
        Integer[] temp1 = Arrays.copyOfRange(arr,0,arr.length);
        Integer[] temp2 = Arrays.copyOfRange(arr,0,arr.length);
        SortingHelper.sortTest("MergeSort",arr);
        SortingHelper.sortTest("SelectionSort",temp1);
        SortingHelper.sortTest("InsertionSort",temp2);
    }
}
