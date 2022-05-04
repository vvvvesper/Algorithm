package chapter2;

import chapter1.ArrayGenerator;

public class Test2 {
    public static void main(String[] args) {
        int[] dataSize = {10000,100000};
        for(int n:dataSize){
            Integer[] arr = ArrayGenerator.generatorRandomArray(n, n);
            SortingHelper.sortTest("SelectionSort",arr);
        }
    }
}
