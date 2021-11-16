package Period;

public class Period {
    public static void main(String[] args) {
        //method toString of Period.Period will be following PnYnMnD
        java.time.Period period = java.time.Period.of(0,0, 0);
        System.out.println(period);
        /**
         *    "P2Y"             -- Period.Period.ofYears(2)
         *    "P3M"             -- Period.Period.ofMonths(3)
         *    "P4W"             -- Period.Period.ofWeeks(4)
         *    "P5D"             -- Period.Period.ofDays(5)
         *    "P1Y2M3D"         -- Period.Period.of(1, 2, 3)
         *    "P1Y2M3W4D"       -- Period.Period.of(1, 2, 25)
         *    "P-1Y2M"          -- Period.Period.of(-1, 2, 0)
         *    "-P1Y2M"          -- Period.Period.of(-1, -2, 0)
         */
    }
}
