package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception1 {
    public static void main(String[] args) {
        Super1 s = new Sub1();
        try{
            s.m1();
        }catch (IOException e){
            System.out.println("A");
        }
        /**
         * FileNotFound extends IOException and hence
         * catch block of FileNotFoundException should
         * appear before the catch block of IOException
         *
         * Therefore, class Test causes compilation error
         */
//        catch (FileNotFoundException e){
//            System.out.println("B");
//        }
        finally {
            System.out.println("C");
        }
    }
}

abstract class Super1 {
    public abstract void m1() throws IOException;
}

class Sub1 extends Super1{
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}


