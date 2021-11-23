package Loot;

public class Test {
    public static void main(String[] args) {
        int x = 5;
        /**
         * While loop doesn't have curly basket over here, so only
         * System.out.println(x) belongs to while loop
         * => infinite loop
         */
        while (x < 10)
            System.out.println(x);
        x++;
    }
}
