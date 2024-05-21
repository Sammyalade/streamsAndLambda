import com.fasterxml.jackson.core.JsonProcessingException;
import examples.Transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionProcessor {

    public static List<Transaction> getTransactionForTheDay(String path, String date) {
        LocalDate dateParsed = LocalDate.parse(date);
        Path filePath = Paths.get(path);
        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines.stream()
                    .map(line -> {
                        try {
                            return JsonToObject.deserialize(line);
                        } catch (JsonProcessingException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .filter(transaction -> transaction.getDate().equals(dateParsed))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        throw new RuntimeException("Empty file");
    }

    public static List<Transaction> getTransactionsForDateRange(String path, String startDate, String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        Path filePath = Paths.get(path);
        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines.stream()
                    .map(line -> {
                        try {
                            return JsonToObject.deserialize(line);
                        } catch (JsonProcessingException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .filter(transaction -> !transaction.getDate().isBefore(start) && !transaction.getDate().isAfter(end))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        throw new RuntimeException("Empty file");
    }
}
