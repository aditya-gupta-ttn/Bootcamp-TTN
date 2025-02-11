//Implement following functional interfaces from java.util.function using lambdas:
//
//1. Consumer
//2. Supplier
//3. Predicate
//4. Function

package Assignment5;

import java.util.Random;
import java.util.function.*;


public class Question1FunctionalInterface {

    public static void main(String[] args) {
        Consumer<String> printConsumer = message -> System.out.println("Consumed: " + message);
        printConsumer.accept("Hello, Aditya!");

        Supplier<Integer> randomSupplier=()->new Random().nextInt(100);
        System.out.println("Generated num is: "+randomSupplier.get());

        Predicate<Integer> isEven=num->num%2==0;
        System.out.println("10 is Even: "+isEven.test(10));
        System.out.println("7 is Even: "+isEven.test(7));

        Function<String, String> toUpperCase=str->str.toUpperCase();
        System.out.println("The upper case of Aadi is: "+toUpperCase.apply("Aadi"));
    }
}
