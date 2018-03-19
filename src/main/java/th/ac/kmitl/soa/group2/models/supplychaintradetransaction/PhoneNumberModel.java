package th.ac.kmitl.soa.group2.models.supplychaintradetransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.COMPLETE_NUMBER;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.TELEPHONE_UNIVERSAL_COMMUNICATION;

@Value
@JacksonXmlRootElement(localName = TELEPHONE_UNIVERSAL_COMMUNICATION)
public class PhoneNumberModel {

    @JacksonXmlProperty(localName = COMPLETE_NUMBER)
    String completeNumber;

}
