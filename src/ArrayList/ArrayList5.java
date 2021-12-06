package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList5 {
    public static void main(String[] args) {
        List<String> trafficLight = new ArrayList<>();
        /**
         * There is no element at index 0 so call to add element at index 1,
         * "trafficLight.add(1, "RED");" throws an instance of java.lang.IndexOutOfBoundsException.
         */
        trafficLight.add(1, "RED");
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");

        /**
         * trafficLight.remove(new Integer(2)); matches with trafficLight.remove(Object) and hence no compilation error.
         */
        trafficLight.remove(new Integer(2));

        System.out.println(trafficLight);
    }
}
