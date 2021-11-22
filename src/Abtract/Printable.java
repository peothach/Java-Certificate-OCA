package Abtract;

interface Printable{
    public void setMargin();
    public void setOrientation();
}

/**
 * With abstract class implement interface, we don't need to override all method of interface
 */
abstract class Paper implements Printable{
    public void setMargin(){}

}

abstract class NewsPaper extends Paper { //Line 12
    public void setMargin() {}

    /**
     * if not using abstract class we must override setOrientation method of interface Printable
     */
    //public void setOrientation(){}
}
