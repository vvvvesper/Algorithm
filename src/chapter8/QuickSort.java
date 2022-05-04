package chapter8;

import chapter1.ArrayGenerator;
import chapter2.SortingHelper;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    private QuickSort(){};

    public static <E extends Comparable<E>> void sort(E[] arr){
        Random rnd = new Random();
        sort(arr,0,arr.length-1,rnd);
    }

    public static <E extends Comparable<E>> void sort(E[] arr,int l,int r,Random rnd){
        if(l>=r) return;
        int p = partition(arr,l,r,rnd);
        sort(arr,l,p-1,rnd);
        sort(arr,p+1,r,rnd);
    }

    public static <E extends Comparable<E>> int partition(E[] arr,int l,int r,Random rnd){
        int p = l + rnd.nextInt(r-l+1);
        swap(arr,l,p);

        // arr[l+1...j] < v ; arr[j+1.....i-1] >= v;
        int j=l;
        for(int i=l+1;i<=r;i++){
            if(arr[i].compareTo(arr[l])<0){
                j++;
                swap(arr,i,j);
            }
        }
        swap(arr,l,j);
        return j;
    }

    public static <E extends Comparable<E>> void sort2ways(E[] arr){
        Random rnd = new Random();
        sort2ways(arr,0,arr.length-1,rnd);
    }

    public static <E extends Comparable<E>> void sort2ways(E[] arr,int l,int r,Random rnd){
        if(l>=r) return;
        int p = partition2(arr,l,r,rnd);
        sort2ways(arr,l,p-1,rnd);
        sort2ways(arr,p+1,r,rnd);
    }

    public static <E extends Comparable<E>> int partition2(E[] arr,int l,int r,Random rnd){
        int p = l + rnd.nextInt(r-l+1);
        swap(arr,l,p);

        //arr[l...i-1] <= v;  arr[j+1...r] >= v;
        int i=l+1 , j=r;
        while(true){
            while(i<=j && arr[i].compareTo(arr[l]) < 0){
                i++;
            }
            while(j>= i && arr[j].compareTo(arr[l]) > 0){
                j--;
            }
            if(i>=j) break;
            swap(arr,i,j);
            i++;
            j--;
        }
        swap(arr,j,l);
        return j;
    }

    public static <E extends Comparable<E>> void sort3ways(E[] arr){
        Random rnd = new Random();
        sort3ways(arr,0,arr.length-1,rnd);
    }

    public static <E extends Comparable<E>> void sort3ways(E[] arr,int l,int r,Random rnd){
        if(l>=r) return;

        int p = l + rnd.nextInt(r-l+1);
        swap(arr,l,p);

//        arr[l+1...lt] < v , arr[lt+1,gt-1] == v , arr[gt,r] > v
        int lt=l,gt=r+1,i=l+1;
        while(i<gt){
            if(arr[i].compareTo(arr[l]) < 0){
                lt++;
                swap(arr,lt,i);
                i++;
            }else if(arr[i].compareTo(arr[l]) == 0){
                i++;
            }else{
                gt--;
                swap(arr,i,gt);
            }
        }
        swap(arr,l,lt);

//        arr[l...lt-1] < v , arr[lt,gt-1] == v , arr[gt,r] > v
        sort3ways(arr,l,lt-1,rnd);
        sort3ways(arr,gt,r,rnd);
    }

    public static <E> void swap(E[] arr,int i,int j){
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }


    public static void main(String[] args) {
        int n = 10000;
//        Integer[] arr = ArrayGenerator.generatorRandomArray(n,n);
//        Integer[] arr = ArrayGenerator.generateOrderdArray(n);
        Integer[] arr = ArrayGenerator.generatorRandomArray(n,1);
        Integer[] arr2 = Arrays.copyOf(arr,arr.length);
        Integer[] arr3 = Arrays.copyOf(arr,arr.length);
        SortingHelper.sortTest("QuickSort",arr);
        SortingHelper.sortTest("QuickSort2Ways",arr2);
        SortingHelper.sortTest("QuickSort3Ways",arr3);
    }
}
