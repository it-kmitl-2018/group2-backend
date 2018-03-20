package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.DEPARTMENT_NAME;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.PERSON_NAME;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class DefinedTradeContactModelTest {

    private static final DefinedTradeContactModel definedTradeContact =
        new DefinedTradeContactModel(
            Option.some("ธารา ยืนขำ"),
            Option.some("marketing")
        );

    private final String xml =
        tag(PERSON_NAME, "ธารา ยืนขำ")
        + tag(DEPARTMENT_NAME, "marketing");

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(definedTradeContact).get(), xml);
    }

}
