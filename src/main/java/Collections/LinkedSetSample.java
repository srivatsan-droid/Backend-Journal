package Collections;

import java.util.LinkedHashSet;

public class LinkedSetSample {
    public static void main(String[] args) {
        LinkedHashSet<String> cars = new LinkedHashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Volvo");
        System.out.println(cars);
        System.out.println(cars.contains("Volvo"));
        System.out.println(cars.remove("Volvo"));
        System.out.println(cars.size());
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
