package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add(null);
        list.add(null);
        list.add(null);
        /**
         * remove(Object) returns true if deletion was successful otherwise false
         * In this case list.remove(null) remove first null from the list and return
         * true and list is left with just one element: [null]
         *
         * remove(int) will return element is removed
         */
        System.out.println(list.remove(0) + ":" + list.remove(null));

    }
}
