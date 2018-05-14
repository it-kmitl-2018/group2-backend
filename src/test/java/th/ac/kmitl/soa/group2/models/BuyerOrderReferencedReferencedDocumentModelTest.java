package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group2.definitions.DocumentType;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class BuyerOrderReferencedReferencedDocumentModelTest {

    public static BuyerOrderReferencedReferencedDocumentModel model =
        new BuyerOrderReferencedReferencedDocumentModel(
            "ABCDEFGHIJKLMNOPQRST123456789012345",
            new Timestamp(1520396640256L)
        );

    public static String xml =
        tag(ISSUE_ASSIGNED_ID, "ABCDEFGHIJKLMNOPQRST123456789012345")
        + tag(ISSUE_DATE_TIME, "1520396640256");

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(model).get(), xml);
    }

}
