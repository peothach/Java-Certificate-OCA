package JVM;

public class Test {

    static Double d1;

    int x = d1.intValue();

    public static void main(String[] args) {

        /**
         * To invoke the special main method, JVM loads the class in the memory. At that time, static field of Test Class
         * are initialized. d1 is of Double type so null is assigned to it.
         *
         * x is not static variable, so int x = d1.intValue(); is not executed. Class is loaded successfully in the memory
         * and "HELLO" is printed on the console.
         *
         * NOTE: new Test() will throw NullPointerException but not ExceptionInInitializedError.
         */
        System.out.println("HELLO");
        //new Test();
    }
}
