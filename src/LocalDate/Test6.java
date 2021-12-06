package LocalDate;

import java.time.LocalDate;

public class Test6 {
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.parse("2006-03-16");

        /**
         * joiningDate --> {2006-03-16}.
         *
         * joiningDate.withDayOfYear(29) returns a new LocalDate object with the day of the Year altered.
         *
         * A year has 365 days, so 29 means 29th day of the year, which is 29th Jan 2006.
         *
         * NOTE: There are other with methods, you should know for the exam. withDayOfMonth(int), withMonth(int) and withYear(int).
         */
        System.out.println(joiningDate.withDayOfYear(29));
    }
}
