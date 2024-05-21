import examples.Transaction;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class TransactionProcessor {

    public static List<Transaction> getTransactionForTheDay(String date){
        LocalDate dateParsed = LocalDate.parse(date);
        String path = "C:\\Users\\DELL\\IdeaProjects\\streamsAndLambdas\\src\\examples\\transaction";
        Path toPath = Path.of(path);
        List<Transaction> transactions;
        return null;
    }
}
