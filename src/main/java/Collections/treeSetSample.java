package Collections;

import java.util.TreeSet;

public class treeSetSample {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.first());
        System.out.println(cars.last());
        System.out.println(cars.contains("Volvo"));
        System.out.println(cars.remove("Volvo"));
        System.out.println(cars.size());
        for(String i : cars) {
            System.out.println(i);
        }
    }
}
