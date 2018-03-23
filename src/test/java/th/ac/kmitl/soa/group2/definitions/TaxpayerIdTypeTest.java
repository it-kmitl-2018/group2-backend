package th.ac.kmitl.soa.group2.definitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxpayerIdTypeTest {

    @Test
    public void shouldDecodeToCorrectType() {
        assertEquals(TaxpayerIdType.TAX_ID, TaxpayerIdType.decode("TXID"));
        assertEquals(TaxpayerIdType.ID_CARD_NUMBER, TaxpayerIdType.decode("NIDN"));
        assertEquals(TaxpayerIdType.PASSPORT_NUMBER, TaxpayerIdType.decode("CCPT"));
        assertEquals(TaxpayerIdType.OTHER_ID_SCHEMA, TaxpayerIdType.decode("OTHR"));
    }

}
