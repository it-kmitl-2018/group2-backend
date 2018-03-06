package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ram:SpecifiedTradeSettlementLineMonetarySummation")
public class SpecifiedTradeSettlementLineMonetarySummationModel {

    @JacksonXmlProperty(localName = "ram:TaxTotalAmount")
    public float taxTotalAmount;

    @JacksonXmlProperty(localName = "ram:NetLineTotalAmount")
    public float netLineTotalAmount;

    @JacksonXmlProperty(localName = "ram:NetIncludingTaxesLineTotalAmount")
    public float netIncludingTaxesLineTotalAmount;

}