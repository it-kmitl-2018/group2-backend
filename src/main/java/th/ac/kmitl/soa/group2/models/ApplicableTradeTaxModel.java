package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "rsm:ApplicableTradeTax")

public class ApplicableTradeTaxModel {

    @JacksonXmlProperty(localName = "ram:TypeCode")
    public String typeCode;

    @JacksonXmlProperty(localName = "ram:CalculatedRate")
    public int calculatedRate;

    @JacksonXmlProperty(localName = "ram:BasisAmount")
    public float basisAmount;

    @JacksonXmlProperty(localName = "ram:CalculatedAmount")
    public float calculatedAmount;

}
