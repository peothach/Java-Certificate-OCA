package StringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hurrad! I Passed...");
        sb.delete(0, 100);
        /**
         * delete method accepts 2 parameters delete(int start, int end),
         * where start is inclusive and end is exclusive.
         *
         * this method throws StringIndexOutOfBoundException for following
         * scenarios:
         * A. start is negative
         * B. start is greater than sb.length()
         * C. start is greater than end
         *
         * if end is greater than the length of StringBuilder object, then
         * StringIndexOutOfBoundException is not thrown and end is set to
         * sb.length().
         *
         * So, in this case, sb.delete(0, 100) is equivalent to sb.delete(0, sb.length())
         * and this delete all the character from the StringBuilder object
         *
         * Hence, System.out.println(sb.length()) print 0 on the console.
         */
        System.out.println(sb.length());
    }
}
