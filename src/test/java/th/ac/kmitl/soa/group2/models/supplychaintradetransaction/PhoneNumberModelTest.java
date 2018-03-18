package th.ac.kmitl.soa.group2.models.supplychaintradetransaction;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group2.utils.binders.Xml;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberModelTest {

    private final String phoneNumber = "0812345678";
    private final String xml =
        "<PhoneNumberModel>" +
            "<ram:CompleteNumber>" + phoneNumber + "</ram:CompleteNumber>" +
        "</PhoneNumberModel>";

    @Test
    public void shoudBeCorrectPhoneNumber() {
        PhoneNumberModel phoneNumberModel = new PhoneNumberModel(phoneNumber);
        assertEquals(Xml.serialize(phoneNumberModel).get(), xml);
    }
}
