import java.util.function.IntToDoubleFunction;

public class IntToDoubleImpl {

    public static void main(String[] args) {
        IntToDoubleFunction sqrt = (value) -> Math.sqrt(value);
        double result = sqrt.applyAsDouble(20);
        System.out.println(result);
    }
}
