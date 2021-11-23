package Immutable;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>();
        original.add(new Integer(10));

        ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
        Integer i1 = cloned.get(0);
        ++i1;

        /**
         * Integer is a immutable Object. So, value of element in array will not be change
         * => when ++i it meaning we create another Integer Object.
         */
        System.out.println(cloned);
    }
}
