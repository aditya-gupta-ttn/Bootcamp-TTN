package Assignment7;

import java.util.*;

//Demonstrate the use of  addFirst(), addLast, removeFirst(),
// removeLast, getFirst(), getLast(), reversed() in Set and List Sequenced collections

public class Question6 {
    public static void main(String[] args) {

        SequencedCollection<String> list = new ArrayList<>();
        list.addFirst("Apple");
        list.addLast("Banana");
        list.addFirst("Mango");
        list.addLast("Cherry");

        System.out.println("List: " + list);
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println("After Removing First and Last: " + list);
        System.out.println("Reversed List: " + list.reversed());

        System.out.println("\n========================\n");

        SequencedSet<Integer> set = new LinkedHashSet<>();
        set.addFirst(10);
        set.addLast(20);
        set.addFirst(5);
        set.addLast(25);

        System.out.println("Set: " + set);
        System.out.println("First Element: " + set.getFirst());
        System.out.println("Last Element: " + set.getLast());

        set.removeFirst();
        set.removeLast();
        System.out.println("After Removing First and Last: " + set);
        System.out.println("Reversed Set: " + set.reversed());
    }
}

