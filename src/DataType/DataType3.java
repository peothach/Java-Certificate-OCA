package DataType;

public class DataType3 {
    public static void main(String[] args) {
        /**
         * int can be converted to double but Integer type can't be converted
         * to Double type as Integer and Double are sibling (both extends from Number class)
         * so can't be cast to each other.
         *
         * add(10.0, new Integer(10)) => 1st parameter is tagged to double primitive type and
         * 2nd parameter is converted to int, is tagged to double primitive type as well. So,
         * add(double, double) method is invoked.
         */
        add(10.0, new Integer(10));
    }

    private static void add(double d1, double d2){
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2){
        System.out.println("Double version: " + (d1 + d2));

    }
}
