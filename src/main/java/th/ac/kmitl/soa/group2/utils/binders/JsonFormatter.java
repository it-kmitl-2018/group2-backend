package th.ac.kmitl.soa.group2.utils.binders;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vavr.control.Option;

import java.io.IOException;

public class JsonFormatter {

    private static ObjectMapper jsonMapper =
        new ObjectMapper();

    public static <T> Option<T> deserialize(String json, Class<T> targetClass) {
        try {
            return Option.some(jsonMapper.readValue(json, targetClass));
        } catch (IOException exception) {
            return Option.none();
        }
    }

}
