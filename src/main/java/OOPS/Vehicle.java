package OOPS;
class V {
    int speed;
    void move() {
        System.out.println("Vehicle is Moving");
    }
}
class Car1 extends V {
    void honk() {
        System.out.println("Car is Honking");
    }
}
public class Vehicle {
    public static void main(String[] args) {
        V obj = new V();
        obj.move();
        Car1 obj1 = new Car1();
        obj1.move();
        obj1.honk();
    }
}
