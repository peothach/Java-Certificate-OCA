package Boolean;

public class Test {
    public static void main(String[] args) {
        Boolean b1 = new Boolean("tRuE");
        Boolean b2 = new Boolean("tRuE");
        Boolean b3 = new Boolean("tRuE");
        Boolean b4 = null;
        Boolean b5 = new Boolean("ture");

        /**
         * Boolean class code uses equalsIgnoreCase method to validation
         * the passed String, so if passed String is "true" ('t', 'r', 'u' and 'e'
         * can be any case), then boolean valued stored in Boolean object is true
         * otherwise false.
         *
         * b1 stores true, b2 store false, b3 stores false and as b4 is of reference
         * type, hence it can store null as well.
         *
         * *b5 In this case passes String is "ture" and not "true" and that is why false is printed
         * on to the console
         */
        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4 + ":" + b5);
    }
}
