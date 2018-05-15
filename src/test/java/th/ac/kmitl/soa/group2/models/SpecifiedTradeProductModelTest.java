package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class SpecifiedTradeProductModelTest {
    public static SpecifiedTradeProductModel model =
            new SpecifiedTradeProductModel(
                    "0025",
                    Option.some("102"),
                    "มาม่า",
                    Option.some("บะหมี่สําเร็จรูป")
            );

    public static String xml =
            tag(ID, "0025")
            + tag(GLOBAL_ID, "102")
            + tag(NAME, "มาม่า")
            + tag(DESCRIPTION, "บะหมี่สําเร็จรูป");

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(model).get(), xml);
    }
}
