//package examples;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class Example1 {
//
//    public static void main(String[] args) {
//        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
//
//        numbers.stream()
//                .filter(number -> number % 2 != 0)
//                .forEach(System.out::println);
//
//
//        List<Transaction> transactions =
//                List.of(new Transaction("$2000", "12345"),
//                        new Transaction("$1000", "56789"),
//                        new Transaction("$200", "56789"));
//
//        transactions.stream()
//                .filter((transaction) -> new BigDecimal(transaction.getAmount()
//                        .substring(1))
//                        .compareTo(new BigDecimal((100)) <= 0)
//                        .forEach(System.out::println);
//    }
//}
