package chapter1;

import chapter1.ArrayGenerator;
import chapter1.LinearSearch;

public class Test2 {
    public static void main(String[] args) {
        int[] dataSize = {1000000,10000000};
        for(int n:dataSize){
            Integer[] arr = ArrayGenerator.generateOrderdArray(n);
            Long startTime = System.nanoTime();
            for(int i =0;i<100;i++){
                LinearSearch.search(arr,n);
            }
            Long endTime = System.nanoTime();
            double time = (endTime-startTime) / 1000000000.0;
            System.out.println("n="+n+",100 runs "+time+"s");
        }
    }
}
