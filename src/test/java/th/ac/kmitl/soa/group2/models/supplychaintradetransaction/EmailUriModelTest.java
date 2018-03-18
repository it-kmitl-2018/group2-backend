package th.ac.kmitl.soa.group2.models.supplychaintradetransaction;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group2.utils.binders.Xml;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailUriModelTest {

    private static final EmailUriModel
        emailUriUniversalCommunication = new EmailUriModel("2312ZXS13");

    private final String xml =
        "<EmailUriModel>"+
            "<ram:URIID>2312ZXS13</ram:URIID>" +
        "</EmailUriModel>";

    @Test
    public void shouldCreateCorrectXml(){
        assertEquals(Xml.serialize(emailUriUniversalCommunication).get(), xml);
    }
}
