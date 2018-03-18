package th.ac.kmitl.soa.group2.utils.binders;

import lombok.Value;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.removeXmlRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class XmlTest {

    @Value
    private class root {
        String child;
    }

    private String xml =
        "<root>" +
            "<child>data</child>" +
        "</root>";

    private String xmlWithoutRoot =
        "<child>data</child>";

    private String xmlFromTag =
        tag("root",
            tag("child", "data")
        );

    @Test
    public void shouldRemoveRootElement() {
        assertEquals(xmlWithoutRoot, removeXmlRoot(xml).get());
    }

    @Test
    public void shouldCreateXmlWithoutRoot() {
        assertEquals(xmlWithoutRoot, serializeWithoutRoot(new root("data")).get());
    }

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(xml, xmlFromTag);
    }

}
