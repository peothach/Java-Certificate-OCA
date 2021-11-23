package Contructor;

public class Constructor1 {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        System.out.println(st1.name + ":" + st1.age);
    }
}


class Student1{
    String name;
    int age;

    Student1(){
        /**
         * A constructor can can call another constructor by using this(...)
         * and not the constructor name
         *
         * Hence, Student("James", 25) cause compilation error
         */
        this("James", 25);
        //Student1("James", 25);
    }

    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }
}
