package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.vavr.control.Option;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.GLOBAL_ID;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.ID;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.NAME;

@Value
public class BuyerTradePartyModel {

    @JacksonXmlProperty(localName = ID)
    String id;

    @JacksonXmlProperty(localName = GLOBAL_ID)
    Option<String> globalId;

    @JacksonXmlProperty(localName = NAME)
    String name;

}
