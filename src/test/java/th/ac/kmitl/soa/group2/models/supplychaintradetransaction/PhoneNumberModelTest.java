package th.ac.kmitl.soa.group2.models.supplychaintradetransaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.COMPLETE_NUMBER;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class PhoneNumberModelTest {

    private final String phoneNumber = "0812345678";

    private final PhoneNumberModel model = new PhoneNumberModel(phoneNumber);

    private final String xml = tag(COMPLETE_NUMBER, phoneNumber);

    @Test
    public void shoudBeCorrectPhoneNumber() {
        assertEquals(serializeWithoutRoot(model).get(), xml);
    }
}
