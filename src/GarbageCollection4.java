/**
 * Case 4: Anonymous Object
 * Actually, the reference of the anonymous object will not be stored anywhere
 * therefore, after thr first execution you cannot call it again hence,
 * it is unreachable.
 */
public class GarbageCollection4 {
    String name;
    GarbageCollection4(String name){
        this.name = name;
    }

    public void sampleMethod(){
        System.out.println("This is a sample method");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + " successfully garbage collected");
    }

    public static void main(String[] args) {
        new GarbageCollection4("myObject1").sampleMethod();
        System.gc();
    }
}
