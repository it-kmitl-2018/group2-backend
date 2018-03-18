package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.CROSS_INDUSTRY_INVOICE;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.EXCHANGED_DOCUMENT;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serialize;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class TaxInvoiceModelTest {

    public static final TaxInvoiceModel model =
        new TaxInvoiceModel(
            HeaderModelTest.model
        );

    public static final String xml =
        tag(CROSS_INDUSTRY_INVOICE,
            tag(EXCHANGED_DOCUMENT, HeaderModelTest.xml)
        );

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serialize(model).get(), xml);
    }

}
