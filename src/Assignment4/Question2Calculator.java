package Assignment4;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

class Question2Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Question2Calculator calculator = new Question2Calculator();
        MathOperation addition = calculator::add;
        MathOperation subtraction = calculator::subtract;

        MathOperation multiplication = Question2Calculator::multiply;

        System.out.println("Addition: " + addition.operate(50, 5));
        System.out.println("Subtraction: " + subtraction.operate(134, 5));
        System.out.println("Multiplication: " + multiplication.operate(240, 5));
    }
}

