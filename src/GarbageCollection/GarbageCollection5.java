package GarbageCollection;

public class GarbageCollection5 {
    public static void main(String[] args) {

        /**
         * Both Runtime.getRuntime().gc() and System.gc()
         * do same thing, these make a request to JVM to run
         * Garbage Collector.
         *
         * JVM makes the best effort to run Garbage Collection
         * but nothing is guaranteed.
         *
         * Setting the reference variable to null will make the
         * object eligible for Garbage Collection, if there are other
         * references to this object. But this doesn't force JVM to run the
         * Garbage Collector. Garbage Collection cannot be force
         */
        Runtime.getRuntime().gc();
        System.gc();
    }
}
