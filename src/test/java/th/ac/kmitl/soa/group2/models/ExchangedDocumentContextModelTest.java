package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class ExchangedDocumentContextModelTest {

    public static final ExchangedDocumentContextModel model =
        ExchangedDocumentContextModel.withDefault();

    public static final String xml =
        tag(GUIDELINE_SPECIFIED_DOCUMENT_CONTEXT_PARAMETER,
            "<ram:ID schemeAgencyID=\"ETDA\" schemeVersionID=\"v2.0\">ER3-2560</ram:ID>"
        );

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(model).get(), xml);
    }

}
