package LocalDate;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        /**
         * LocalDate.parse(CharSequence) method accepts String
         * in "yyyy-MM-dd" format only
         *
         * TO represent 9th June 2018; format String must be "2018-06-09"
         */
        LocalDate date = LocalDate.parse("2018-01-01");
        System.out.println(date);
    }
}
