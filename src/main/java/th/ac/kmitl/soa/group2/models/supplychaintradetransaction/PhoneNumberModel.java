package th.ac.kmitl.soa.group2.models.supplychaintradetransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.COMPLETE_NUMBER;

@Value
public class PhoneNumberModel {

    @JacksonXmlProperty(localName = COMPLETE_NUMBER)
    String completeNumber;
    
}
