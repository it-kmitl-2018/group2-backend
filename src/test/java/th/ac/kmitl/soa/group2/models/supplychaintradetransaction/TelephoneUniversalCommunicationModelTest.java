package th.ac.kmitl.soa.group2.models.supplychaintradetransaction;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group2.utils.binders.Xml;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelephoneUniversalCommunicationModelTest {

    private final String phoneNumber = "0812345678";
    private final String xml =
            "<TelephoneUniversalCommunicationModel><" +
                    "ram:CompleteNumber>" +
                        "0812345678" +
                    "</ram:CompleteNumber>" +
            "</TelephoneUniversalCommunicationModel>";

    @Test
    public void shoudBeCorrectPhoneNumber() {
        TelephoneUniversalCommunicationModel telephoneNumberModel = new TelephoneUniversalCommunicationModel(phoneNumber);
        assertEquals(Xml.serialize(telephoneNumberModel).get(), xml);
    }
}
