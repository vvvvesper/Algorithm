package chapter3;

import chapter3.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.remove(9);
        System.out.println(arr);
        arr.remove(8);
        System.out.println(arr);
        arr.remove(7);
        System.out.println(arr);
        arr.remove(6);
        System.out.println(arr);
        arr.remove(5);
        System.out.println(arr);
        arr.remove(4);
        System.out.println(arr);



    }
}