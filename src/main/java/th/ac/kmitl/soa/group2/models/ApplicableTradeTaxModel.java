package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;

@Value
class ApplicableTradeTaxModel {

    @JacksonXmlProperty(localName = TYPE_CODE)
    String typeCode;

    @JacksonXmlProperty(localName = CALCULATED_RATE)
    int calculatedRate;

    @JacksonXmlProperty(localName = BASIS_AMOUNT)
    float basisAmount;

    @JacksonXmlProperty(localName = CALCULATE_AMOUNT)
    float calculatedAmount;

}
