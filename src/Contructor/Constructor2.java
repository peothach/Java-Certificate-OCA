package Contructor;

public class Constructor2 {
    public static void main(String[] args) {
        /**
         * Method can have same named with class
         * void Student() and Student(String name, age) is a method not a constructor
         */
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}

class Student {

    String name;
    int age;

    void Student() {
        Student("Jame", 25);
    }

    void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
