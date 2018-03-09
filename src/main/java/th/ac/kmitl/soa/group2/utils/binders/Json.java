package th.ac.kmitl.soa.group2.utils.binders;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vavr.CheckedFunction1;
import io.vavr.Function1;
import io.vavr.control.Option;
import th.ac.kmitl.soa.group2.utils.WebConfiguration;

import java.io.IOException;

import static th.ac.kmitl.soa.group2.utils.WebConfiguration.jsonMapper;
import static th.ac.kmitl.soa.group2.utils.WebConfiguration.xmlMapper;

public class Json {

    private static Function1<Object, Option<String>> serialize =
        CheckedFunction1.lift(jsonMapper::writeValueAsString);

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

}
