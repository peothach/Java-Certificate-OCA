package Exception;

public class Errors {

    public static void main(String[] args) {
        /**
         * An infinitely recurring method can lead to a StackOverflowError
         */
        main(args);

        /**
         * Memory leak can lead to an OutOfMemoryError
         */
        int[] array = new int[1000*1000*1000];
    }
}
