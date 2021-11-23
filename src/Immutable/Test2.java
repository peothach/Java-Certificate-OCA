package Immutable;

public class Test2 {
    public static void main(String[] args) {
        String str1 = " ";
        boolean b1 = str1.isEmpty();
        System.out.println(b1);

        str1.trim();
        b1 = str1.isEmpty();
        System.out.println(b1);

        /**
         * str1 refers single space character and is Empty() method of
         * String returns true if no characters are there in the String. As
         * str1 contains single space, hence b1 is false
         *
         *
         * str1.trim() => creates an empty string "" but str1 still refers to
         * single space string " ".
         *
         *
         */
    }
}
