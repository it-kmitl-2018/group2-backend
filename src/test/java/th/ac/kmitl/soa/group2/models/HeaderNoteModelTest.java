package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.CONTENT;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.SUBJECT;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

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
