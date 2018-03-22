package th.ac.kmitl.soa.group2.models.supplychaintradetransaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.URI_ID;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class EmailUriModelTest {

    private static final String email = "abc@xyz.com";

    private static final EmailUriModel model = new EmailUriModel(email);

    private final String xml = tag(URI_ID, email);

    @Test
    public void shouldCreateCorrectXml(){
        assertEquals(serializeWithoutRoot(model).get(), xml);
    }
}
