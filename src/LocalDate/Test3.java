package LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test3 {
    public static void main(String[] args) {
        /**
         * Because DateTimeFormatter.ISO_DATE_TIME is for LocalDateTime but not for LocalDate
         * => it is cause to Runtime Exception
         */
        LocalDate date = LocalDate.of(1987, 9, 1);
        String str = date.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date is: " + str);
    }
}
