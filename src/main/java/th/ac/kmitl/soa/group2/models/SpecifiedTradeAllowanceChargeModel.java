package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor()
public class SpecifiedTradeAllowanceChargeModel {

    @JacksonXmlProperty(localName = "ram:ChargeIndicator")
    public final boolean chargeIndicatior;

    @JacksonXmlProperty(localName = "ram:ActualAmount")
    public final float actualAmount;

    @JacksonXmlProperty(localName = "ram:ReasonCode")
    public final String reasonCode;

    @JacksonXmlProperty(localName = "ram:Reason")
    public final String reason;

}
