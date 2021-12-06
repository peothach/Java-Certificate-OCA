package Operation;

public class Test1 {
    public static void main(String[] args) {
        int i = 5;
        if(i++ < 6) {
            /**
             * Inline i will be 6 because i++ will return i(copy) = i and increment i to 1. => i = 6.
             * But in line System.out.println(i++); i++ will return i(copy)= i = 6 and increment i to 1 => i = 7
             */
            System.out.println(i++);

        }
    }
}
