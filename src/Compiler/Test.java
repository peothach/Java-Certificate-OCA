package Compiler;

public class Test {
    public static void main(String[] args) {
        final boolean flag;

        flag = false;

        /**
         * final boolean flag; flag = false doesn't make flag a compile time constant
         * Compiler doesn't know flag's value at compile-time and hence it allows this syntax.
         *
         * At runtime, as boolean expression of while loop is false, loop doesn't execute even once and hence no output
         */
        while (flag){
            System.out.println("Good morning!");
        }
    }
}
