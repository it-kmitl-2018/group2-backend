package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class SpecifiedTradeAllowanceChargeModelTest {

    private static final SpecifiedTradeAllowanceChargeModel
        specifiedTradeAllowanceCharge =
        new SpecifiedTradeAllowanceChargeModel(
            false,
            2500,
            "95",
            Option.some("ส่วนลดจากราคาปกติ")
        );

    private final String xml =
            tag(CHARGE_INDICATOR, "false")
            + tag(ACTUAL_AMOUNT, "2500.0")
            + tag(REASON_CODE, "95")
            + tag(REASON, "ส่วนลดจากราคาปกติ");

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(specifiedTradeAllowanceCharge).get(), xml);
    }

}
