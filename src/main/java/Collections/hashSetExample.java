package Collections;

import java.util.HashSet;

public class hashSetExample {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Volvo");
        System.out.println(cars);
        //While we are adding Duplicates we can remove the list
        cars.contains("Volvo");
        System.out.println(cars.contains("Volvo"));
        System.out.println(cars.remove("Volvo"));
        System.out.println(cars.size());
        for(String i : cars) {
            System.out.println(i);
        }
        if(cars.contains("Volvo")) {
            System.out.println("Volvo is present");
        }
        else {
            System.out.println("Volvo is not present");
        }
    }
}
