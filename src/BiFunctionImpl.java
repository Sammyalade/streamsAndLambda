import java.util.function.BiFunction;

public class BiFunctionImpl {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (num1, num2) -> num1 * num2;

        System.out.println(multiply.apply(2, 3));
    }
}
