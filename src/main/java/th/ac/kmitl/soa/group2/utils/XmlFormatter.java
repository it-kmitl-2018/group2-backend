package th.ac.kmitl.soa.group2.utils;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vavr.CheckedFunction1;
import io.vavr.Function1;
import io.vavr.control.Option;

public class XmlFormatter {

    private static Module xmlModule =
        new SimpleModule().addSerializer(new OptionSerializer());

    private static ObjectMapper xmlMapper =
        new XmlMapper().registerModule(xmlModule);

    private static Function1<Object, Option<String>> serialize =
        CheckedFunction1.lift(xmlMapper::writeValueAsString);

    public static Option<String> serialize(Object model) {
        return serialize.apply(model);
    }

}
