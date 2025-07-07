package OOPS;
class VehcileClass {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}
class Cars extends VehcileClass {
    public void move() {
        System.out.println("Car is moving");
    }
}
class Bikes extends VehcileClass {
    public void move() {
        System.out.println("Bike is moving");
    }
}

public class VehicleClass {
    public static void main(String[] args) {
        Cars obj = new Cars();
        obj.move();
        Bikes obj1 = new Bikes();
        obj1.move();
    }
}
