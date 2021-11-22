package Object;

public class Test {

    String str;
    char var1;
    double var2;
    float var3;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("> "+ test.str);
        //When you create a char variable, the value default is \u0000 (whitespace)
        System.out.println("> "+ test.var1);
        System.out.println("> "+ test.var2);
        System.out.println("> "+ test.var3);
    }
}
