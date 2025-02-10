package Assignment4;

@FunctionalInterface
interface CompareNumbers {
    boolean isGreater(int a, int b);
}

@FunctionalInterface
interface IncrementNumber {
    int increment(int a);
}


@FunctionalInterface
interface ConcatenateStrings {
    String concatenate(String s1, String s2);
}

@FunctionalInterface
interface ConvertToUpperCase {
    String convert(String s);
}

public class Question1FunctionalInterfaceExample {
    public static void main(String[] args) {
        CompareNumbers compare = (a, b) -> a > b;
        System.out.println("Is 10 greater than 5? " + compare.isGreater(10, 5));

        IncrementNumber increment = a -> a + 1;
        System.out.println("Incremented value of 5: " + increment.increment(5));

        ConcatenateStrings concatenate = (s1, s2) -> s1 + s2;
        System.out.println("Concatenation of 'Aditya' and 'Gupta': " + concatenate.concatenate("Aditya", "Gupta"));

        ConvertToUpperCase toUpperCase = s -> s.toUpperCase();
        System.out.println("Uppercase of 'hi aadi': " + toUpperCase.convert("hi aadi"));
    }

}
