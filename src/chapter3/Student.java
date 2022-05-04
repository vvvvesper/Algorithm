package chapter3;

public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student another) {
        return this.score - another.score;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Student student = (Student)obj;
        return this.name == student.name;
    }

    @Override
    public String toString(){
        return String.format("Student(name: %s,score: %d)",name,score);
    }

    public static void main(String[] args) {
        Array<Student> students = new Array<>(50);
        students.addLast(new Student("zhangsan",18));
        students.addLast(new Student("lisi",16));
        students.addLast(new Student("wangwu",20));
        System.out.println(students);
    }
}
