package chapter12;

import java.util.Random;

public class Main {
    private static double test(Integer[] testData,boolean isHeapify){
        MaxHeap<Integer> maxHeap;
        long startTime = System.nanoTime();
        if(isHeapify){
            maxHeap = new MaxHeap<>(testData);
        }else{
            maxHeap = new MaxHeap<>();
            for(Integer data:testData){
                maxHeap.add(data);
            }
        }
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;

        int[] arr = new int[testData.length];
        for(int i=0;i<testData.length;i++){
            arr[i] = maxHeap.extractMax();
        }
        for(int i=1;i<testData.length;i++){
            if(arr[i-1]<arr[i]){
                throw new IllegalArgumentException("Error");
            }
        }
        System.out.println("Success");
        return time;
    }

    public static void main(String[] args) {
        int n = 1000000;
        Integer[] testData = new Integer[n];
        Random r = new Random();
        for(int i=0;i<n;i++){
            testData[i] = r.nextInt(Integer.MAX_VALUE);
        }
        double time1 = test(testData,false);
        System.out.println("Without Heapify: "+ time1 + " s");
        double time2 = test(testData,true);
        System.out.println("Heapify: "+ time2 + " s");
    }
}
