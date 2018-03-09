package th.ac.kmitl.soa.group2.utils.binders;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vavr.CheckedFunction1;
import io.vavr.Function1;
import io.vavr.control.Option;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import th.ac.kmitl.soa.group2.utils.binders.option.OptionModule;

import java.io.IOException;

public class Json {

    public static ObjectMapper jsonMapper =
        Jackson2ObjectMapperBuilder.json()
            .build()
            .registerModule(OptionModule.get);

    public static Option<String> serialize(Object model) {
        return serialize.apply(model);
    }

    public static <T> Option<T> deserialize(String json, Class<T> targetClass) {
        try {
            return Option.some(jsonMapper.readValue(json, targetClass));
        } catch (IOException exception) {
            return Option.none();
        }
    }

    private static Function1<Object, Option<String>> serialize =
        CheckedFunction1.lift(jsonMapper::writeValueAsString);

}
