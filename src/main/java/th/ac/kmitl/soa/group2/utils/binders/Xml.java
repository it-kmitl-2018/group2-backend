package th.ac.kmitl.soa.group2.utils.binders;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vavr.control.Option;
import io.vavr.jackson.datatype.VavrModule;
import org.springframework.core.serializer.Deserializer;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.IOException;

import static io.vavr.CheckedFunction1.lift;

public class Xml {

    public static ObjectMapper xmlMapper =
        Jackson2ObjectMapperBuilder.xml()
            .build()
            .registerModule(new VavrModule());

    public static Option<String> serialize(Object model) {
        return lift(xmlMapper::writeValueAsString).apply(model);
    }

    public static <T> Option<T> deserialize(String json, Class<T> targetClass) {
        try {
            return Option.some(xmlMapper.readValue(json, targetClass));
        } catch (IOException exception) {
            return Option.none();
        }
    }

}
