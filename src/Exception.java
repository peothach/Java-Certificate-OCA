import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    /**
     * Let's talk about throws and throw in exception
     * m1 method using keyword 'throws' 1 exception, and we have 2 case.
     * Case 1: If you 'throws' a checked exception (IOException),
     * all method call m1() method will be caught IOException or 'throws' IOException in head method
     * Case 2: If you 'throws' an unchecked exception (RuntimeException) you will not 'throws' whatever. It up to you
     * @throws IOException
     */
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}

public class Exception {
    public static void main(String[] args) throws IOException {
        Super s = new Sub();
        try {
            /**
             * It is case 1 you will do either to avoid complication error:
             * 1. Catch IOException.
             * 2. Throws IOException in head method.
             */
            s.m1();
        } catch (FileNotFoundException e) {
            System.out.print("M");
        } finally {
            System.out.print("N");
        }
    }
}