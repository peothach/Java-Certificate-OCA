package Predicate;

import java.util.Locale;

public class Predicate {
    public static void main(String[] args) {
        //Predicate: thuộc tính
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        java.util.function.Predicate<String> p =
                s -> s.toUpperCase().substring(0,1).equals("A");

        processStringArray(arr, p);
    }

    public static void processStringArray(String[] arr,
                                     java.util.function.Predicate p){

        for(String str: arr){
            if(p.test(str)){
                System.out.println(str);
            }
        }
    }
}
