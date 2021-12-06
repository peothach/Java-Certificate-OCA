package Predicate;

import java.util.function.Predicate;

public class Predicate3 {
    public static void main(String[] args) {
        /**
         * In the lambda expression's body, if used, all 3 [return, {}, ;] must be used together.
         */
        Predicate predicate = s -> {return true;};
    }
}
