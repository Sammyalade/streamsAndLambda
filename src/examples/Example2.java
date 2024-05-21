package examples;

import java.util.List;

public class Example2 {

    public static void main(String[] args) {
        List<String> names = List.of("QWERTY", "ASDFG", "ZXCVBN", "ABC");

        names.stream()
                .map(String::length)
                .forEach(System.out::println);


    }
}
