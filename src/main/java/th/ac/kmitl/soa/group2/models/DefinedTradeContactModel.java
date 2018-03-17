package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.DEPARTMENT_NAME;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.PERSON_NAME;

@Value
class DefinedTradeContactModel {

    @JacksonXmlProperty(localName = PERSON_NAME)
    String personName;

    @JacksonXmlProperty(localName = DEPARTMENT_NAME)
    String departmentName;

}
