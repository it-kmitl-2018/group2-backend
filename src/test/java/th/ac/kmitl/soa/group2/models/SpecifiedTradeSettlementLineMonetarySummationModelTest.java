package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serialize;

public class SpecifiedTradeSettlementLineMonetarySummationModelTest {

    private static final SpecifiedTradeSettlementLineMonetarySummationModel
            specifiedTradeSettlementLineMonetarySummation =
            new SpecifiedTradeSettlementLineMonetarySummationModel(
                    749,
                    10700,
                    11449
            );

    private final String xml =
            "<ram:SpecifiedTradeSettlementLineMonetarySummation>" +
                    "<ram:TaxTotalAmount>false</ram:TaxTotalAmount>" +
                    "<ram:NetLineTotalAmount>2500</ram:NetLineTotalAmount>" +
                    "<ram:NetIncludingTaxesLineTotalAmount>95" +
                    "</ram:NetIncludingTaxesLineTotalAmount>" +
                    "</ram:SpecifiedTradeSettlementLineMonetarySummation>";

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serialize(specifiedTradeSettlementLineMonetarySummation)
                        .get(), xml);
    }

}
