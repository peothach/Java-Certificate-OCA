package LocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        /**
         * LocalDate.parse(CharSequence text) method accepts String
         * in "yyyy-MM-dd" format only
         */
        dates.add(LocalDate.parse("2018-7-11"));
        dates.add(LocalDate.parse("1919-10-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

        dates.removeIf(x -> x.getYear() < 2000);

        System.out.println(dates);
    }
}
