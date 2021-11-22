package Exception;

public class Throws {

    public static void main(String[] args) throws java.lang.Exception {
        /**
         * if you call a method 'throws' an exception you should follow handle or declare
         * Add signature method or
         * surrounded try catch block
         * Exception is a checked exception
         * RuntimeException is a unchecked exception
         */
        m1();
    }

    static void m1() throws java.lang.Exception {
        System.out.println("NOT THROWING ANY EXCEPTION");
    }
}
