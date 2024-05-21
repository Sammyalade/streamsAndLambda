import examples.Transaction;
import examples.TypeOfTransaction;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JsonToObjectTest {


//    @org.junit.Test
    @Test
    public void testWriteToFile(){
        Transaction transaction = new Transaction("35", "bob", new BigDecimal(1500), LocalDate.parse("2024-06-16"), TypeOfTransaction.DEBIT);
        String path = "C:\\Users\\DELL\\IdeaProjects\\streamsAndLambdas\\src\\examples\\transaction";
        WriteTransactionIntoFile.writeIntoFile(path, transaction);
        Path filePath = Paths.get(path);
        assertTrue(Files.exists(filePath));
    }
}
