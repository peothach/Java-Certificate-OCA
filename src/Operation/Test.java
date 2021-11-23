package Operation;

public class Test {
    public static void main(String[] args) {
        int a = 2;
        /**
         * a++ will return a' value from value of a. Then increment value of a to 1
         * --a will immediately increment value of a to 1 and return it.
         * so, output = 2 + 2 = 4
         */
        System.out.println(a++ + --a);

        /**
         * && has higher precedence over ||
         * so, it will write like that
         * ((a++) == 2) || ((--a) == 2 && (--a) == 2)
         * Please noted || is a short-circuit operator, hence no need to evaluate expression on the right.
         * It means just expression a++ == 2 is executed.
         * => a++ will create a' value from a and return it, then will increment value a to 1.
         * => output = 3.
         */
        System.out.println(a++ == 2 || --a == 2 && --a == 2);
        System.out.println(a);
    }
}
