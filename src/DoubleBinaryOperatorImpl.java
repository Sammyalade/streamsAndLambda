import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorImpl {

    public static void main(String[] args) {
        DoubleBinaryOperator add = (left, right) -> left + right;
        System.out.println("Sum: " + add.applyAsDouble(5.5, 4.5));
    }
}
