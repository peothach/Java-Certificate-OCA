package Exception;

import java.util.ArrayList;
import java.util.List;

public class Exception3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.get(0); // => It will throw IndexOutOfBoundsException

        byte [] arr = new byte[0];
        System.out.println(arr[0]); // => It will throw ArrayIndexOutOfBoundsException

        /**
         * arr refers to an array object of size 0. That means arr stores some memory address.
         *
         * So we will not get NullPointerException in this case.
         * But index 0 is not available for an array object of size 0 and thus ArrayIndexOutOfBoundsException is thrown at runtime.
         */
    }
}
