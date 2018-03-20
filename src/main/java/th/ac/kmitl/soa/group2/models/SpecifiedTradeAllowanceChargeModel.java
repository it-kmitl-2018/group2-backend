package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vavr.control.Option;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;

@Value
public class SpecifiedTradeAllowanceChargeModel {

    @JacksonXmlProperty(localName = CHARGE_INDICATOR)
    boolean chargeIndicatior;

    @JacksonXmlProperty(localName = ACTUAL_AMOUNT)
    float actualAmount;

    @JacksonXmlProperty(localName = REASON_CODE)
    String reasonCode;

    @JacksonXmlProperty(localName = REASON)
    Option<String> reason;

}
