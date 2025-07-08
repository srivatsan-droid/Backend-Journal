package Collections;

import java.util.LinkedList;

public class linkedListSample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Volvo");
        System.out.println(cars);
        cars.addFirst("Honda");
        cars.addLast("Ford");
        System.out.println(cars);
        System.out.println(cars.getFirst());
    }
}
