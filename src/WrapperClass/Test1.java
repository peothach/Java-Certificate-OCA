package WrapperClass;

public class Test1 {
    public static void main(String[] args) {

        int number = '7';

        /**
         * case '7' can easily be compared with int value but not with Integer type.
         */
        //Integer number = '7';

        switch(number) {
            case '7':
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
