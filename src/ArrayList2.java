import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(new Integer(0));

        /**
         * method indexOf will return index number of value you pass into method
         */
        list.remove(list.indexOf(0));

        System.out.println(list);
    }
}
