/**
 * Case 3:Assigning null
 * When you assign a null value to a reference of an object it is no longer reachable
 */
public class GarbageCollection3 {
    String name;

    GarbageCollection3(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + " successfully garbage collected");
    }

    public static void main(String[] args) {
        GarbageCollection3 obj = new GarbageCollection3("myObject1");
        obj = null;
        System.gc();
    }
}
