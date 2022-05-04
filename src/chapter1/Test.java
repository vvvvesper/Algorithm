package chapter1;

import chapter1.LinearSearch;
import chapter1.Student;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Integer[] data = new Integer[]{24, 18, 12, 9, 16, 66, 32, 4};
        int index = LinearSearch.search(data,16);
        System.out.println(index);

        String[] data2 = {"q","w","e","r"};
        int index2 = LinearSearch.search(data2,"e");
        System.out.println(index2);

        Student[] students = {new Student("zhangsan"),
                              new Student("lisi"),
                              new Student("wangwu")};
        Student visitor = new Student("lisi");
        int index3 = LinearSearch.search(students,visitor);
        System.out.println(index3);
    }
}
