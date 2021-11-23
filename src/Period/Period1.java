package Period;

import java.time.Period;

public class Period1 {
    public static void main(String[] args) {
        /**
         * of and ofXXX methods are static method and not instance methods.
         * Period.of(2, 1, 0) returns a instance of Period type.
         * static methods can be invoked using class_name or using
         * reference variable. In this case ofYear(2) is invoked on period
         * instance but compiler uses Period's instance to resolve the type,
         * which is period. A new Period instance {P10Y} is created, after that
         * another Period instance {P5M} is created and finally Period instance
         * {P2D} is created
         * => output is P2D.
         */
        Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
        System.out.println(period);
    }
}
