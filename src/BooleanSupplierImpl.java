import java.util.function.BooleanSupplier;

public class BooleanSupplierImpl {

    public static void main(String[] args) {

        int a = 19;
        int b = 10;

        BooleanSupplier bool = () -> a % b == 9;
        System.out.println(bool);
    }
}
