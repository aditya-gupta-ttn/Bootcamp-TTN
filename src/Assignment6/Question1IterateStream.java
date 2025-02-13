package Assignment6;

import java.util.stream.Stream;

public class Question1IterateStream {
    public static void main(String[] args) {
        Stream.iterate(2, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

    }
}

