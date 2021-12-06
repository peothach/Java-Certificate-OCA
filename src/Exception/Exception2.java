package Exception;

public class Exception2 {

    private static void m1(){
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        /**
         * finally is always run in try block
         * so A will print in console and program is terminate abruptly.
         */
        try{
            m1();
        }finally {
            System.out.println("A");
        }
    }
}
