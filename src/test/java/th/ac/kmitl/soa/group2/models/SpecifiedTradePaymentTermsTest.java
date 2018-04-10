package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class SpecifiedTradePaymentTermsTest {

    private static final SpecifiedTradePaymentTermsModel
            SpecifiedTradePaymentTerms =
            new SpecifiedTradePaymentTermsModel(
                    "1101",
                    Option.of("very good"),
                    "10-10-2016"
            );

    private final String xml =
            tag(TYPE_CODE, "1101")
                    + tag(DESCRIPTION, "very good")
                    + tag(DUE_DATE_TIME, "10-10-2016");

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(SpecifiedTradePaymentTerms).get(), xml);
    }
    
}
