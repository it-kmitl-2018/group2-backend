package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.utils.XmlFormatter.serialize;

public class TaxInvoiceModelTest {

    public static final TaxInvoiceModel model =
        new TaxInvoiceModel(DocumentHeaderModelTest.model);

    public static final String xml =
        "<rsm:CrossIndustryInvoice>" +
            DocumentHeaderModelTest.xml +
        "</rsm:CrossIndustryInvoice>";

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serialize(model).get(), xml);
    }

}
