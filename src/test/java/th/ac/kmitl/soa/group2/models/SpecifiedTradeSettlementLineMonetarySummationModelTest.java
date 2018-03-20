package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serialize;

public class SpecifiedTradeSettlementLineMonetarySummationModelTest {

    private static final SpecifiedTradeSettlementLineMonetarySummationModel model =
        new SpecifiedTradeSettlementLineMonetarySummationModel(
            749,
            10700,
            11449
        );

    private final String xml =
        "<SpecifiedTradeSettlementLineMonetarySummationModel>" +
            "<ram:TaxTotalAmount>749.0</ram:TaxTotalAmount>" +
            "<ram:NetLineTotalAmount>10700.0</ram:NetLineTotalAmount>" +
            "<ram:NetIncludingTaxesLineTotalAmount>11449.0</ram:NetIncludingTaxesLineTotalAmount>" +
        "</SpecifiedTradeSettlementLineMonetarySummationModel>";

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serialize(model).get(), xml);
    }

}
