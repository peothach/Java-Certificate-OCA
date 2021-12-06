package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList6 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");

        /**
         * remove (Object) will return True or False
         * remove (index) will return value object element when remove
         */
        if(fruits.remove("grape"))
            fruits.remove("papaya");

        System.out.println(fruits);
    }
}
