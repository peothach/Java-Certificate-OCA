package StringBuilder;

public class StringBuilder4 {

    public static void main(String[] args) {
        String str = "Java";
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));
    }

}
