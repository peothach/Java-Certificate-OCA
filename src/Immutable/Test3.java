package Immutable;

public class Test3 {
    public static void main(String[] args) {
        String str = "Good"; //Line 3
        change(str); //Line 4
        /**
         * => So str will always not change
         */
        System.out.println(str); //Line 5
    }

    private static void change(String s) {
        /**
         * String is a Immutable Class so when we s.concat()
         * it meaning creating a new String Object and assign it = Good_Morning
         */
        s.concat("_Morning"); //Line 9
    }
}
