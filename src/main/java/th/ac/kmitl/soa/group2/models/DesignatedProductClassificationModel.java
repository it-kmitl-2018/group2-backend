package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vavr.control.Option;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;

@Value
public class DesignatedProductClassificationModel {

        @JacksonXmlProperty(localName = CLASS_CODE)
        String classCode;

        @JacksonXmlProperty(localName = CLASS_NAME)
        Option<String> className;

}
