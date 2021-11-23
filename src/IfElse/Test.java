package IfElse;

public class Test {
    public static void main(String[] args) {
        int grade = 75;
        if(grade > 60)
            System.out.println("Congratulation");
            /**
             * As there is no brackets after if, hence only one statement is part of
             * if block and other is outside
             * if(grade > 60) {
             *     System.out.println("Congratulations");
             * }
             * System.out.println("You passed");
             * else
             *     System.out.println("You failed");
             * => compiler error
             */
            System.out.println("You passed");

//        else{
//            System.out.println("You failed");
//        }
    }
}
