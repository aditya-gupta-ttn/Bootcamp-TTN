package Assignments1.Question8;// File name: NoClassDefExample.java

class NoClassDefExample {
    public static void main(String[] args) {
        try {
            // This will throw NoClassDefFoundError if ClassB.class is not found during runtime
            ClassB b = new ClassB(); // We are referencing ClassB, which we might remove later
            b.display();
        } catch (NoClassDefFoundError e) {
            // Catching NoClassDefFoundError
            System.out.println("Caught NoClassDefFoundError: " + e);
        }
    }
}

class ClassB {
    public void display() {
        System.out.println("ClassB is found!");
    }
}

