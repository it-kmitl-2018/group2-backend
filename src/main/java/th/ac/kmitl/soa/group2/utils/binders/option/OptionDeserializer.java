package th.ac.kmitl.soa.group2.utils.binders.option;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.datatype.jdk8.OptionalIntDeserializer;
import io.vavr.control.Option;

import java.io.IOException;

public class OptionDeserializer extends StdDeserializer<Option> {

    protected OptionDeserializer() {
        super(Option.class);
    }

    @Override
    public Option deserialize(JsonParser parser,
                              DeserializationContext context) throws IOException {
        return Option.some("");
    }

    @Override
    public Option getNullValue(DeserializationContext ctxt) {
        return Option.none();
    }

}
