package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sortReverseOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}

