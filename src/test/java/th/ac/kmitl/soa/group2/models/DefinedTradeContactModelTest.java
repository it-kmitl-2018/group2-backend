package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.utils.XmlFormatter.serialize;

public class DefinedTradeContactModelTest {

    private static final DefinedTradeContactModel definedTradeContact =
        new DefinedTradeContactModel(
            "ธารา ยืนขำ",
            "marketing"
        );

    private final String xml =
        "<ram:DefinedTradeContact>" +
            "<ram:PersonName>ธารา ยืนขำ</ram:PersonName>" +
            "<ram:DepartmentName>marketing</ram:DepartmentName>" +
        "</ram:DefinedTradeContact>";

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serialize(definedTradeContact).get(), xml);
    }

}
