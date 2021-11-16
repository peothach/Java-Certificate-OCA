package ArrayList;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Character> list = new java.util.ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1,'E');
        list.add(3, 'O');

        if(list.contains('O')){
            /**
             * remove method just allow pass Object
             * If Character pass like an Object, it will be converted to Integer
             * 'O' => 79 (Integer)
             * It looks like arr['O'] == arr[79] => It will be thrown IndexOfBoundsException.
             */
            list.remove('O');
        }

        list.forEach(i -> System.out.println(i));
    }
}
