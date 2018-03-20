package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class ApplicableTradeTaxModelTest {

    private static final ApplicableTradeTaxModel applicableTradeTax =
        new ApplicableTradeTaxModel(
            "VAT",
            7,
            Option.some(63050.00F),
            Option.some(4413.50F)
        );

    private static String xml =
            tag(TYPE_CODE, "VAT")
            +tag(CALCULATED_RATE, "7")
            +tag(BASIS_AMOUNT, "63050.0")
            +tag(CALCULATE_AMOUNT, "4413.5");

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(applicableTradeTax).get(), xml);
    }
}
