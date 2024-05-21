package examples;

import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.IntStream;

public class Example3 {

    public static void main(String[] args) {
        String word = "Hello";

//        IntStream intStream = word.chars();
//        intStream.forEach(System.out::println);

        word.chars()
                .filter((num) -> num > 100)
                .mapToObj((num) -> num * num)
                .forEach(System.out::println);
    }
}
