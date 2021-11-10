public class DataType_Byte {
    public static void main(String[] args) {
        byte var = 100;
        switch (var) {
            case 100:
                System.out.println("var is 100");
                break;
            /**
             * Because range of byte is -128 to 127
             * and 200 is not range of byte.
             * That reason we get a complication error
             */
//            case 200:
//                System.out.println("var is 200");
//                break;
            default:
                System.out.println("In default");
        }
    }

}
