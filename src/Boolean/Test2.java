package Boolean;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        String msg = "Hello";
        /**
         * When we use new keyword when create an array
         * => all default element is false with boolean datatype
         * => all default element is 0 with int datatype
         */
        boolean [] flag = new boolean[2];
        if(flag[0]) {
            msg = "Welcome";
        }
        System.out.println(msg);
    }
}
