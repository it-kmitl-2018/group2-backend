package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class InvoicerTradePartyTest {

    public static InvoicerTradePartyModel model =
            new InvoicerTradePartyModel(
                    "101",
                    Option.some("156"),
                    "man"
            );

    public static String xml =
            tag(ID, "101")
                    + tag(GLOBAL_ID, "156")
                    + tag(NAME, "man");

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(model).get(), xml);
    }
}
