package Assignments1.Question8;

public class ClassNotFoundExample {
    public static void main(String[] args) {
        try {
            // Attempting to load a non-existent class dynamically
            Class<?> clazz = Class.forName("NonExistentClass");
            System.out.println(clazz.getName() + " class loaded.");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e);
        }
    }
}

