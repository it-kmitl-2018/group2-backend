package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group2.definitions.DocumentType;
import th.ac.kmitl.soa.group2.utils.binders.Xml;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;

public class ExchangedDocumentWrapperTest {

    public static ExchangedDocumentWrapper model =
        new ExchangedDocumentWrapper(
            "หมายเหตุ",
            "เนื้อหา",
            "RDTIV0575526000058001",
            "ใบกำกับภาษี",
            DocumentType.TAX_INVOICE.typeCode,
            "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง",
            "DCNS03",
            "2.16.764.1.1.2.1.4.3.7",
            new Timestamp(1520396640256L),
            new Timestamp(1520396612035L)
        );

    public static final String xml = HeaderModelTest.xml;

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(model.getModel()).get(), xml);
    }
}
