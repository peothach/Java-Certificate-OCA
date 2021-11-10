public class StringBuilder3 {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Java");
        /**
         * In StringBuilder when you call method toString it meaning you will create new a String Object,
         * That reason why s1 == s2 will return false.
         */
        String s1 = sb.toString();
        String s2 = sb.toString();
        System.out.println(s1 == s2);
    }
}
