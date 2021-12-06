package StringBuilder;

public class Str5ingBuilder {
    public static void main(String[] args) {
        /**
         * Method toString of StringBuilder will return a new String Object.
         * So, when toString().toUpperCase it will refer to a new locate in head memory
         * => value of sb will not be change
         * => output is "Space Station".
         */
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpaceStation");
        sb.delete(5, 6).insert(5," S").toString().toUpperCase();
        System.out.println(sb);
    }
}
