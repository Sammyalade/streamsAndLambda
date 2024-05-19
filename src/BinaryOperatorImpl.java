import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {

    public static void main(String[] args) {
        BinaryOperator<Integer> divide = (a, b) -> a / b;

        System.out.println(divide.apply(10, 2));
    }
}
