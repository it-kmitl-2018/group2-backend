package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group2.definitions.DocumentType;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;

public class HeaderNoteModelTest {

    public static HeaderNoteModel model =
        new HeaderNoteModel(
            "หมายเหตุ",
            "เนื้อหา"
        );

    public static String xml =
        tag(SUBJECT, "หมายเหตุ")
        + tag(CONTENT, "เนื้อหา");

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(model).get(), xml);
    }

}
