package Polymorphism;

public class Test3 {
    public static void main(String[] args) {
        /**
         * Compiler either does implicit casting or Wrapping but not both.
         * 1 is int literal,
         * Java compiler can't implicit cast it to double and then box it to Double rather it boxes i to Integer
         * and as Number is the immediate super class of Integer so Number version refers to Integer object.
         */
        m(1);
    }

    private static void m(Object obj) {
        System.out.println("Object version");
    }

    private static void m(Number obj) {
        System.out.println("Number version");
    }

    private static void m(Double obj) {
        System.out.println("Double version");
    }
}
