import examples.Transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteTransactionIntoFile {

    public static void writeIntoFile(String path, Transaction transaction){
        Path paths = Paths.get(path);
        try {
            String jsonString = JsonToObject.serialize(transaction) +  System.lineSeparator();
            Files.write(paths, jsonString.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
