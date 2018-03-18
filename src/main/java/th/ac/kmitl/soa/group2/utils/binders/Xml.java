package th.ac.kmitl.soa.group2.utils.binders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.vavr.control.Option;
import io.vavr.jackson.datatype.VavrModule;
import lombok.val;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.IOException;
import java.util.regex.Pattern;

import static io.vavr.API.println;
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

    public static Option<String> serializeWithoutRoot(Object model) {
        return Xml.serialize(model).flatMap(Xml::removeXmlRoot);
    }

    public static Option<String> removeXmlRoot(String xml) {
        val pattern = Pattern.compile("^<.+?>(.*)</.+?>$").matcher(xml);
        if (pattern.find()) {
            return Option.some(pattern.group(1));
        } else {
            return Option.none();
        }
    }

    public static String tag(String name, String body) {
        return String.format("<%s>%s</%s>", name, body, name);
    }

}
