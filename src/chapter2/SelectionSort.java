package chapter2;

public class SelectionSort {
    private SelectionSort(){};
    public static <E extends Comparable<E>> void sort(E[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minIndex].compareTo(arr[j])>0){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                swap(arr,i,minIndex);
            }
        }
    }

    private static <E> void swap(E[] arr,int i,int j){
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
