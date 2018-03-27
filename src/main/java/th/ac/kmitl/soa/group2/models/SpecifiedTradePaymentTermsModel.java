package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vavr.control.Option;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.DESCRIPTION;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.DUE_DATE_TIME;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.TYPE_CODE;

@Value
public class SpecifiedTradePaymentTermsModel {

        @JacksonXmlProperty(localName = TYPE_CODE)
        String typeCode;

        @JacksonXmlProperty(localName = DESCRIPTION)
        Option<String> description;

        @JacksonXmlProperty(localName = DUE_DATE_TIME)
        String deuDateTime;
        
}
