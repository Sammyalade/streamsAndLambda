import java.util.function.DoubleConsumer;

public class DoubleConsumerImpl {

    public static void main(String[] args) {

        DoubleConsumer printConsumer = (value) -> System.out.println("Value: " + value);
        printConsumer.accept(5.5);
    }
}
