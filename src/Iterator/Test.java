package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        Iterator<String> iterator = dryFruits.iterator();
        while (iterator.hasNext()){
            String dryFruit = iterator.next();
            if(dryFruit.startsWith("A")){
                /**
                 * will be thrown a ConcurrentModificationException when using List.remove()
                 * in Iterator
                 */
                //dryFruits.remove(dryFruit);
                iterator.remove();
            }
        }

        /**
         * It will be thrown a ConcurrentModificationException because
         * you delete when you are using loot
         */
//        for(String dryFruit:dryFruits){
//            dryFruits.remove(dryFruit);
//        }
        //dryFruits.forEach(e -> dryFruits.remove(e));

        System.out.println(dryFruits);
    }
}
