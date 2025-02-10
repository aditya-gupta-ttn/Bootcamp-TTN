package Assignment2;

class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}

public class Question5SingletonPatternExample {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage("Hello from Singleton! - First Call");

        Singleton obj2 = Singleton.getInstance();
        obj2.showMessage("Hello from Singleton! - Second Call");

        if (obj1 == obj2) {
            System.out.println("Both obj1 and obj2 are the same instance.");
        } else {
            System.out.println("obj1 and obj2 are different instances.");
        }
    }
}
