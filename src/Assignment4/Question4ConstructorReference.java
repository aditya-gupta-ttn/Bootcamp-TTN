package Assignment4;


@FunctionalInterface
interface MyInterface {
    Sample create(String message);
}

class Sample {
    private String message;

    public Sample(String message) {
        this.message = message;
        System.out.println("Sample Constructor called: " + message);
    }
}

public class Question4ConstructorReference{
    public static void main(String[] args) {
        MyInterface ref = Sample::new;
        Sample obj = ref.create("Hello, Constructor Reference!");
    }
}

