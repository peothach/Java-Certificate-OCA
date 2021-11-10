public class IntegerCaches {
    public static void main(String[] args) {
        /**
         * When you call Integer number = 127
         * it is called autoboxing, compiler covert this expression
         * into actual:
         * Integer number2 = Integer.valueOf(127)
         */
        Integer number1 = 127;
        Integer number2 = Integer.valueOf(127);
        // return true
        System.out.println(number1==number2);


        Integer number3 = 128;
        Integer number4 = Integer.valueOf(128);
        /**
         * For small numbers, by default -128 to 127, Integer.valueOf(int) does not
         * create a new instance of Integer but return a value from its cache.
         * And if the number larger range of cache (-128 to 127) Integer class will be
         * return a new Integer(). That reason why output is false
         * @return false
         */
        System.out.println(number3==number4);
    }
}
