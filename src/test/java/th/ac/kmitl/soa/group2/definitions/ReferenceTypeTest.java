package th.ac.kmitl.soa.group2.definitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReferenceTypeTest {

    @Test
    public void shouldDecodeToCorrectType() {
        assertEquals(ReferenceType.INVOICE_NUMBER, ReferenceType.decode("IV"));
        assertEquals(ReferenceType.DOCUMENT_REFERENCE_NUMBER, ReferenceType.decode("LC"));
        assertEquals(ReferenceType.SERIAL_NUMBER, ReferenceType.decode("LS"));
        assertEquals(ReferenceType.ORDER_DOCUMENT_IDENTIFIER, ReferenceType.decode("ON"));
        assertEquals(ReferenceType.ITEM_NUMBER, ReferenceType.decode("SE"));
        assertEquals(ReferenceType.PREVIOUS_TAX_CONTROL_NUMBER, ReferenceType.decode("ALT"));
        assertEquals(ReferenceType.DEBIT_NOTE_NUMBER, ReferenceType.decode("DL"));
        assertEquals(ReferenceType.CREDIT_NOTE_NUMBER, ReferenceType.decode("CD"));
        assertEquals(ReferenceType.MUTUALLY_DEFINED_REFERENCE_NUMBER, ReferenceType.decode("ZZZ"));
    }

}
