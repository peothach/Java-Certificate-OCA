package Comparison;

public class Comparison {

    public static void main(String[] args) {
        /**
         * 1. use == to compare primitive e.g. boolean, int, char etc.,
         * while use equals() to compare objects in Java
         * 2. == return true if two reference are of the same object. The result
         * of the equals() method depends on override implementation.
         * 3. For comparing String use equals() instead of == equally operation
         */
        int a = 5;
        int b = 5;
        String s1 = "str";
        String s2 = "str";
        System.out.println(a == b);
        System.out.println(s1.equals(s2));
    }
}
