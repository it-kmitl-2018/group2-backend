package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.utils.XmlFormatter.serialize;

public class ApplicableTradeTaxModelTest {

    private static final ApplicableTradeTaxModel applicableTradeTax =
        new ApplicableTradeTaxModel(
            "VAT",
            7,
            63050,
            4413.50
        );

    private final String xml =
        "<ram:ApplicableTradeTax>" +
            "<ram:TypeCode>VAT</ram:TypeCode>" +
            "<ram:CalculatedRate>7</ram:CalculatedRate>" +
            "<ram:BasisAmount>63050</ram:BasisAmount>" +
            "<ram:CalculatedAmount>4413.50</ram:CalculatedAmount>" +
        "</ram:ApplicableTradeTax>";

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serialize(applicableTradeTax).get(), xml);
    }

}
