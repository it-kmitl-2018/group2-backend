package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vavr.control.Option;
import lombok.Value;
import java.sql.Timestamp;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;

@Value
public class AppliedTradeAllowanceChargeModel {

    @JacksonXmlProperty(localName = CHARGE_INDICATOR)
    Option<String> chargeIndicator;

    @JacksonXmlProperty(localName = ACTUAL_AMOUNT)
    Option<String> actualAmount;

    @JacksonXmlProperty(localName = REASON_CODE)
    String reasonCode;

    @JacksonXmlProperty(localName = REASON)
    Option<String> reason;

}