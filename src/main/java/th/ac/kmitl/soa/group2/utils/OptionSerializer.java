package th.ac.kmitl.soa.group2.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.vavr.control.Option;

import java.io.IOException;

public class OptionSerializer extends StdSerializer<Option> {

    public OptionSerializer() {
        super(Option.class);
    }

    @Override
    public void serialize(Option value,
                          JsonGenerator json,
                          SerializerProvider provider) throws IOException {
        if (!value.isEmpty()) {
            json.writeObject(value.get());
        } else {
            json.writeNull();
        }
    }

    @Override
    public boolean isEmpty(SerializerProvider provider, Option value) {
        return value == null || value.isEmpty();
    }

}
