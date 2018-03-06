package th.ac.kmitl.soa.group2.models.supplychaintradetransaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberModelTest {

    private final String phoneNumber = "0812345678";

    @Test
    public void shoudBeCorrectPhoneNumber() {
        PhoneNumberModel phoneNumberModel = new PhoneNumberModel(phoneNumber);
        assertEquals(phoneNumberModel.getPhoneNumber(), phoneNumber);
    }
}
