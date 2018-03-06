package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ram:SpecifiedTradeAllowanceCharge")
public class SpecifiedTradeAllowanceChargeModel {

    @JacksonXmlProperty(localName = "ram:ChargeIndicator")
    public boolean chargeIndicatior;

    @JacksonXmlProperty(localName = "ram:ActualAmount")
    public float actualAmount;

    @JacksonXmlProperty(localName = "ram:ReasonCode")
    public String reasonCode;

    @JacksonXmlProperty(localName = "ram:Reason")
    public String Reason;

}