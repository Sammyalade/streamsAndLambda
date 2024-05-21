import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import examples.Transaction;

import java.io.IOException;

public class JsonToObject {

    public static String serialize(Transaction transaction) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(transaction);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public static Transaction deserialize(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Transaction.class);
    }

}
