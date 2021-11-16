package GarbageCollection;

/**
 * Case 2:Reassignment
 * When you reassign a value (another object) to an existing reference variable,
 * the original object ends up being unreachable
 */
public class GarbageCollection2 {
    String name;
    GarbageCollection2(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + " successfully garbage collected");
    }

    public static void main(String[] args) {
        GarbageCollection2 obj = new GarbageCollection2("myObject1");
        obj = new GarbageCollection2("myObject2");
        System.gc();
    }
}
