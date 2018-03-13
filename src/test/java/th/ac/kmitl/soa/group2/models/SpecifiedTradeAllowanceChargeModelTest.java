package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serialize;

public class SpecifiedTradeAllowanceChargeModelTest {

    private static final SpecifiedTradeAllowanceChargeModel
            specifiedTradeAllowanceCharge =
            new SpecifiedTradeAllowanceChargeModel(
                    false,
                    2500,
                    "95",
                    "ส่วนลดจากราคาปกติ"
            );

    private final String xml =
            "<ram:SpecifiedTradeAllowanceCharge>" +
                    "<ram:ChargeIndicator>false</ram:ChargeIndicator>" +
                    "<ram:ActualAmount>2500</ram:ActualAmount>" +
                    "<ram:ReasonCode>95</ram:ReasonCode>" +
                    "<ram:Reason>ส่วนลดจากราคาปกติ</ram:Reason>" +
                    "</ram:SpecifiedTradeAllowanceCharge>";

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serialize(specifiedTradeAllowanceCharge).get(), xml);
    }

}
