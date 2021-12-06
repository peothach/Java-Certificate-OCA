package Switch;

public class Test1 {
    public static void main(String[] args) {
        /**
         * In switch-case
         * If match a case and if you don't break it will run all another case for the end or meet a break
         */
        String fruit = new String(new char[] {'M', 'a', 'n', 'g', 'o'});
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }
    }
}
