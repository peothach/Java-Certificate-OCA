package LocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
        Period period = Period.parse("p-30000y");

        /**
         * Period.parse(CharSequence) method accepts the String parameter in "PnYnMnD" format,
         * over here P,Y,M and D can be in any case. "p-30000y" means Period of -30000 years.
         */
        System.out.println(date.plus(period));
    }
}
