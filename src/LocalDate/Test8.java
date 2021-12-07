package LocalDate;

import java.time.LocalDate;

public class Test8 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2068, 4, 15);

        /**
         * localDate.getMonth() return month of the field year, using enum, all the enum constant name are is upper case
         */
        System.out.println(localDate.getMonth() + ":" + localDate.getMonthValue());
    }
}
