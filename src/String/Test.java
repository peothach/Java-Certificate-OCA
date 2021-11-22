package String;

public class Test {
    public static void main(String[] args) {
        String str = "ICICINBBRT4";

        /**
         * substring begin with index is 0
         * subLend = endIndex - beginIndex
         */
        System.out.println(str.substring(0, 4));
        System.out.println(str.substring(4, 6));
    }
}
