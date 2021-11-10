/**
 * Case 1: Object inside a method
 * In Java a method is stored in the stack memory. When you call a method,
 * JVM fetches it into the stack and executes it. After the execution it is popped
 * out of the stack then, all its variables will be discarded
 */
public class GarbageCollection {
    String name;
    GarbageCollection(String name){
        this.name = name;
    }
    public static void sampleMethod(){
        GarbageCollection obj1 = new GarbageCollection("myObject2");
        GarbageCollection obj = new GarbageCollection("myObject1");
    }
    protected void finalize() throws Throwable {
        System.out.println(this.name + " successfully garbage collected");
    }
    public static void main(String args[]){
        sampleMethod();
        System.gc();
    }
}
