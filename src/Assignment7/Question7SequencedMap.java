package Assignment7;

//7
//Demonstrate the use of firstEntry(), lastEntry(),
// pollFirstEntry(), pollLastEntry(), putFirst(), putLast(), reversed() with SequencedMap.

import java.util.*;

public class Question7SequencedMap {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>();


        map.putFirst(1, "Apple");
        map.putLast(2, "Banana");
        map.putFirst(0, "Mango");
        map.putLast(3, "Cherry");

        System.out.println("Original Map: " + map);
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());


        System.out.println("Polled First Entry: " + map.pollFirstEntry());
        System.out.println("Polled Last Entry: " + map.pollLastEntry());

        System.out.println("After Polling First and Last: " + map);
        System.out.println("Reversed Map: " + map.reversed());
    }
}
