package th.ac.kmitl.soa.group2.models.supplychaintradetransaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneUniversalModelTest {

    private final String phoneNumber = "0812345678";

    @Test
    public void shoudBeCorrectPhoneNumber() {
        PhoneUniversalModel phoneUniversalModel = new PhoneUniversalModel(phoneNumber);
        assertEquals(phoneUniversalModel.getPhoneNumber(), phoneNumber);
    }
}
