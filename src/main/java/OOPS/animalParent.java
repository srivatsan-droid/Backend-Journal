package OOPS;
class AnimalsParent {
    void sound() {
        System.out.println("Animal Sound");
    }
}
class DogS extends AnimalsParent {
    void sound() {
        super.sound();
        System.out.println("Dog Sound");
    }
}
class Vehicle1 {
    Vehicle1(int Speed) {
        System.out.println("Speed is " + Speed);
    }
}
class Bike extends Vehicle1 {
    Bike() {
        super(100);
    }
}
public class animalParent {
    public static void main(String[] args) {
        DogS obj = new DogS();
        obj.sound();
        Bike obj1 = new Bike();
        System.out.println(obj1);
    }
}
