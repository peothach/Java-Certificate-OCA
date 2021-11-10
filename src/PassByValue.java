class Message {
    String msg = "Happy New Year!";

    public void print(){
        System.out.println(msg);
    }
}

public class PassByValue {
    public static void change(Message m) { //Line n5
        m = new Message(); //Line n6
        m.msg = "Happy Holidays!"; //Line n7
    }

    public static void main(String[] args) {
        /**
         * Java is Pas By Value
         * It meaning if you pass an Object into a method it will create a new
         * variable in stack memory and reference to Object in memory head
         * That reason why when you're using new variable and initial an Object it
         * will be not change in root Object in Head memory
         */
        Message obj = new Message(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
    }
}
