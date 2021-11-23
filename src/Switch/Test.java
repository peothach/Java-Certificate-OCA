package Switch;

public class Test {
    public static void main(String[] args) {
        int score = 60;
        switch (score){
            default:
                System.out.println("Not a valid score");
                /**
                 * Switch-case only allowed data type
                 * depend on while pass in switch(param)
                 * it doesn't allow expression.
                 */
//            case score < 70:
//                System.out.println("Failed");
        }
    }
}
