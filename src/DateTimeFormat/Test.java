package DateTimeFormat;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        /**
         * While working with dates, programmers get confused with M & m and D & d
         *
         * Easy way to remember is that Bigger (Upper case) letter represent
         * something bigger. M represent month & m represent minutes, D represents
         * day of the year & d represent day of the month.
         *
         * LocalDate's object doesn't have time component, mm represents minutes
         * and not months so at runtime format method throws exception.
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm-dd-yy");
        System.out.println(formatter.format(date.minus(period)));
    }
}
