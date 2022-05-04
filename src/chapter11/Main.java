package chapter11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("pride-and-prejudice:");
        ArrayList<String> words1 = new ArrayList<>();
        FileOperation.readFile("G:\\javastudy\\idea\\workspace\\code\\Algorithm\\src\\pride-and-prejudice.txt",words1);
        System.out.println("Total Words: "+ words1.size());

        Set<String> set1 = new BSTSet<>();
        for(String word:words1){
            set1.add(word);
        }
        System.out.println("Total different words1: " + set1.getSize());

        Set<String> set2 = new LinkedListSet<>();
        for(String word:words1){
            set2.add(word);
        }
        System.out.println("Total different words2: " + set2.getSize());
    }
}
