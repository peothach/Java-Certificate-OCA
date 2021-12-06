package LocalDate;

import java.time.LocalDate;

public class Test5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2018-06-06");
        date.minusDays(10);

        /**
         * Because LocalDate is a Immutable Object
         * So date.minusDays() will create a new Object.
         * => date will not be changes
         */
        System.out.println(date);
    }

}
