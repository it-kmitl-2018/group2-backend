package th.ac.kmitl.soa.group2.utils.binders;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vavr.CheckedFunction1;
import io.vavr.Function1;
import io.vavr.control.Option;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import th.ac.kmitl.soa.group2.utils.binders.option.OptionModule;

public class Xml {

    public static ObjectMapper xmlMapper =
        Jackson2ObjectMapperBuilder.xml()
            .build()
            .registerModule(OptionModule.get);

    public static Option<String> serialize(Object model) {
        return serialize.apply(model);
    }

    private static Function1<Object, Option<String>> serialize =
        CheckedFunction1.lift(xmlMapper::writeValueAsString);

}
