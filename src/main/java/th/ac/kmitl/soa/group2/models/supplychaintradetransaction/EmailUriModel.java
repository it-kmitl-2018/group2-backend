package th.ac.kmitl.soa.group2.models.supplychaintradetransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.URI_ID;

@Value
public class EmailUriModel {

    @JacksonXmlProperty(localName = URI_ID)
    String uriId;

}
