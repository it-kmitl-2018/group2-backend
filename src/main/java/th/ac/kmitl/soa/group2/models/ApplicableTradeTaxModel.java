package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor()
@JacksonXmlRootElement(localName = "ram:ApplicableTradeTax")

class ApplicableTradeTaxModel {

    @JacksonXmlProperty(localName = "ram:TypeCode")
    public final String typeCode;

    @JacksonXmlProperty(localName = "ram:CalculatedRate")
    public final int calculatedRate;

    @JacksonXmlProperty(localName = "ram:BasisAmount")
    public final float basisAmount;

    @JacksonXmlProperty(localName = "ram:CalculatedAmount")
    public final float calculatedAmount;

}
