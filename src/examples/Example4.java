package examples;

import java.util.List;

public class Example4 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .map((number) -> String.format("number = %d", number))
                .forEach(System.out::println);
    }
}
