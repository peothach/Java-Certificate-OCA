package Contructor;

abstract class Animal {
    private String name;


//    Contructor.Animal(){
//
//    }

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;

    /**
     * It will be error if you don't call constructor of parent class.
     * But if you have constructor without param it will be ok because by default it always call constructor without param you don't need to add super()
     * And in this case parent class have constructor with param and constructor without param will not automotive declare in class
     * @param breed
     */
    Dog(String breed) {
        //add super() to avoid complication error
        super(null);
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly", "Poodle");
        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
                dog2.getName() + ":" + dog2.getBreed());
    }
}