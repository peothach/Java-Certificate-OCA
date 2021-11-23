package Predicate;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        String[] arr = {"*", "**", "***", "****", "*****"};
        /**
         * Predicate is a Functional Interface and generic must contain Data Type in <>
         */
        Predicate<String> predicate = s -> s.length() < 4;
        print(arr, predicate);

    }

    public static void print(String[] arr, Predicate<String> predicate) {
        for (String str :arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
