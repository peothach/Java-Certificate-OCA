package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Integer i = 10;

        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(new Integer(10));
        list.add(i);

        /**
         * It will compiler error because i already use in scope
         */
        //list.removeIf(i -> i == 10);
    }
}
