import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Character> list = new java.util.ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1,'E');
        list.add(3, 'O');

        if(list.contains('O')){
            // 'O' will be converted to int
            // int is default of all value except String
            list.remove('0');
        }

        list.forEach(i -> System.out.println(i));
    }
}
