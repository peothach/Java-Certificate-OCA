package StringPool;

public class StringPool1 {
    public static void main(String[] args) {
        /**
         * Please note that Strings computed by concatenation at compile time,
         * will be referred by String Pool during execution.
         * Concatenation just allow final of primitive or String Object not allow another Object
         * Compile time String concatenation happens when both of the operands are
         * compiled time constants, such as literal, final variable etc.
         * String str1 = i1 + s1
         * to String str1 = "1:ONE";
         */
        final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":ONE";

        String str1 = i1 + s1;
        String str2 = i2 + s1;

        System.out.println(str1 == "1:ONE");
        System.out.println(str2 == "1:ONE");
    }
}
