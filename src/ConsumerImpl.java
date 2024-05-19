import java.util.function.Consumer;

public class ConsumerImpl {
    public static void main(String[] args) {

        Consumer<String> printUpperCaseConsumer = (str) -> System.out.println(str.toUpperCase());
        printUpperCaseConsumer.accept("Hello, World!");
    }
}
