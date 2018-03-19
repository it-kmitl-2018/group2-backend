package th.ac.kmitl.soa.group2.models.supplychaintradetransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.EMAIL_URI_UNIVERSAL_COMMUNICATION;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.URI_ID;

@Value
@JacksonXmlRootElement(localName = EMAIL_URI_UNIVERSAL_COMMUNICATION)
public class EmailUriModel {

    @JacksonXmlProperty(localName = URI_ID)
    String uriId;

}
