package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class AppliedTradeAllowanceChargeTest {

    public static AppliedTradeAllowanceChargeModel model =
            new AppliedTradeAllowanceChargeModel(
                    Option.some("Charge"),
                    Option.some("0.333"),
                    "256",
                    Option.some("not have")
            );

    public static final String xml = tag(CHARGE_INDICATOR, "Charge")
            + tag(ACTUAL_AMOUNT, "0.333")
            + tag(REASON_CODE, "256")
            + tag(REASON, "not have");

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(model).get(), xml);
    }

}
