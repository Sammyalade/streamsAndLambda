import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {

    public static void main(String[] args) {

        UnaryOperator<Integer> incrementByOne = x -> x + 1;
        int result = incrementByOne.apply(5);
        System.out.println(result);
    }
}
