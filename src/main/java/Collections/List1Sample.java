package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class List1Sample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.add(1, "Honda");
        System.out.println(cars);
        System.out.println(cars.get(0));
        //Set method is used to give value to a particular index
        cars.set(0, "Toyota");
        System.out.println(cars);
        //Remocve an Element
        cars.remove(1);
        System.out.println(cars);
        //Size of the ArrayList
        System.out.println(cars.size());
        for(int i = 0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        //For Each Loop
        for(String s : cars) {
            System.out.println(s);
        }
        //Sorting the list
        Collections.sort(cars);
        System.out.println(cars);
    }
}
