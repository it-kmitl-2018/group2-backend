package th.ac.kmitl.soa.group2.models.supplychaintradetransaction;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group2.utils.binders.Xml;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailUriModelTest {

    private static final String email = "abc@xyz.com";
    private static final EmailUriModel model = new EmailUriModel(email);

    private final String xml =
        "<EmailUriModel>"+
            "<ram:URIID>"+ email + "</ram:URIID>" +
        "</EmailUriModel>";

    @Test
    public void shouldCreateCorrectXml(){
        assertEquals(Xml.serialize(model).get(), xml);
    }
}
