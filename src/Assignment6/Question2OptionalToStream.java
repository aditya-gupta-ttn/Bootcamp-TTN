package Assignment6;

import java.util.Optional;

public class Question2OptionalToStream {
    public static void main(String[] args) {
        Optional<String> op = Optional.ofNullable("aditya kumar gupta");
        op.stream().forEach(System.out::println);
    }
}
