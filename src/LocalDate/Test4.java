package LocalDate;

import java.time.LocalDate;
import java.time.Period;

public class Test4 {
    public static void main(String[] args) {
        /**
         * Constructor of LocalDate is declared private so cannot be called from outside, hence new LocalDate(2020, 2, 14); causes compilation failure.
         *
         * Overloaded static methods "of" and "parse" are provided to create the instance of LocalDate.
         *
         * LocalTime, LocalDateTime, Period also specify private constructors and provide "of" and "parse" methods to create respective instances.
         */
//        LocalDate obj = new LocalDate(2020, 2, 14);
//        System.out.println(obj.minus(Period.ofDays(10)));
    }
}
