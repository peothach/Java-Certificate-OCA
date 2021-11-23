package Main;

public class Test1 {
    public static void main(String[] args) {
        Message.main(new String[]{"Guest", "Jame", "Gosling"});
    }
}

class Message{
    public static void main(String[] args) {
        System.out.println("Welcome " + args[0] + "!");
    }
}
