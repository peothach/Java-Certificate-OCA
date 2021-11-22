package Inheritance;

public class Test {
    public static void main(String[] args) {
        A obj1 = new A();


        /**
         * It will throw ClassCastException because superClass can convert to subClass
         */
        //B obj2 = (B) obj1;
        //obj2.print();

        /**
         * But we can cast SubClass to superClass.
         */
        A obj3 = new B();
        ((A)obj3).print();
    }
}

class A{
    public void print(){
        System.out.println("A");
    }
}

class B extends A{
    public void print(){
        System.out.println("B");
    }

    public void anotherMethod(){
        System.out.println("Another method from Subclass B");
    }
}
