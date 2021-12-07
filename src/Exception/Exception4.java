package Exception;

public class Exception4 {
    private static int [] arr;

    public static void main(String [] args) {
        /**
         * Variable arr is a class variable of int [] type, so by default it is initialized to null.
         *
         * In if block, arr.length > 0 is checked first. Accessing length property on null reference throws NullPointerException.
         *
         * Correct logical if block declaration should be:
         *
         * if(arr != null && arr.length > 0)
         */
        if(arr.length > 0 && arr != null) {
            System.out.println(arr[0]);
        }
    }
}
