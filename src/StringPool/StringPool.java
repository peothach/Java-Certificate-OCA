package StringPool;

public class StringPool {
    public static void main(String[] args) {
        /**
         * What is a string pool?
         * Simply, a pool of strings stored in the Java Head Memory.
         * Why does Java use the string pool concept?
         * For memory optimization. So, if a copy of the string already exist, it will
         * not create to new String to hold the repeated value, but rather point
         * to the address that has same valued as the string you are planning
         * to assign.
         */
        String str1 = "newString";
        String str2 = "newString";

        System.out.println(str1 == str2);
    }
}
