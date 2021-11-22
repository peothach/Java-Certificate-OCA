package StringPool;

public class StringPool2 {

    public static void main(String[] args) {
        String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        String s3 = s1 + "";

        /**
         * When you use String concat ("A" + "B") compiler will concatenation to ("AB") at compile time
         * so in this case "OCAJP" + "" compiler will concatenation to "OCAJP" and then it will
         * compare Object in String Pool.
         * ==> return true
         */
        System.out.println(s1 == s2);

        /**
         * When you use Object + "ABC" compiler will not concatenation at compile time
         * it newly created and therefore distinct.
         * ==> return false
         */
        System.out.println(s1 == s3);
    }
}
