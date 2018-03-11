package th.ac.kmitl.soa.group2.utils.binders;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vavr.control.Option;
import io.vavr.jackson.datatype.VavrModule;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.IOException;

import static io.vavr.CheckedFunction1.lift;

public class Json {

    public static ObjectMapper jsonMapper =
        Jackson2ObjectMapperBuilder.json()
            .build()
            .registerModule(new VavrModule());

    public static Option<String> serialize(Object model) {
        return lift(jsonMapper::writeValueAsString).apply(model);
    }

    public static <T> Option<T> deserialize(String json, Class<T> targetClass) {
        try {
            return Option.some(jsonMapper.readValue(json, targetClass));
        } catch (IOException exception) {
            return Option.none();
        }
    }

}
