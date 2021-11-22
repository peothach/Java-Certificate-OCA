package DataType;

public class DataType {
    public static void main(String[] args) {
        double price = 90000;
        String model;
        if(price > 100000){
            model = "Tesla Model X";
        }else if(price <= 100000){
            model = "Tesla Model S";
        }

        /**
         * We are using if-else if block instead of if-else block
         * so if two expression above not valid => model without initialization
         * but use if-else model always initialization.
         */
        //System.out.println(model);
    }
}
