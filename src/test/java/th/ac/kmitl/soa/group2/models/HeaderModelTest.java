package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group2.definitions.DocumentType;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;

public class HeaderModelTest {

    public static HeaderModel model =
        new HeaderModel(
            "RDTIV0575526000058001",
            "ใบกำกับภาษี",
            DocumentType.TAX_INVOICE.typeCode,
            new Timestamp(1520396640256L),
            Option.some("คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง"),
            Option.some("DCNS03"),
            Option.some("2.16.764.1.1.2.1.4.3.7"),
            new Timestamp(1520396612035L),
            new HeaderNoteModel("หมายเหตุ", "เนื้อหา")
        );

    public static final String xml =
        tag(ID, "RDTIV0575526000058001") +
        tag(NAME, "ใบกำกับภาษี") +
        tag(TYPE_CODE, "388") +
        tag(ISSUE_DATE_TIME, "1520396640256") +
        tag(PURPOSE, "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง") +
        tag(PURPOSE_CODE, "DCNS03") +
        tag(GLOBAL_ID, "2.16.764.1.1.2.1.4.3.7") +
        tag(CREATION_DATE_TIME, "1520396612035") +
        tag(INCLUDED_NOTE,
            tag(SUBJECT, "หมายเหตุ") +
            tag(CONTENT, "เนื้อหา")
        );

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(model).get(), xml);
    }

}
