package th.ac.kmitl.soa.group2.utils.binders.option;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import io.vavr.control.Option;

public class OptionDeserializer extends StdDeserializer<Option> {

    protected OptionDeserializer() {
        super(Option.class);
    }

    @Override
    public Option deserialize(JsonParser parser,
                              DeserializationContext context) {
        // NOT WORKING: cannot call default deserializer
        throw new UnsupportedOperationException();
    }

    @Override
    public Option getNullValue(DeserializationContext context) {
        return Option.none();
    }

}
