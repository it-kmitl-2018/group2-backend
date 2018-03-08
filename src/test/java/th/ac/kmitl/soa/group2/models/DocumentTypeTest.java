package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group2.definitions.DocumentType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentTypeTest {

    private final String DEBIT_NOTE_CODE = "80";
    private final String CREDIT_NOTE_CODE = "81";
    private final String INVOICE_CODE = "380";
    private final String TAX_INVOICE_CODE = "388";
    private final String RECEIPT_CODE = "T01";
    private final String INVOICE_AND_TAX_INVOICE_CODE = "T02";
    private final String RECEIPT_TAX_INVOICE_CODE = "T03";
    private final String DELIVERY_AND_TAX_INVOICE_CODE = "T04";
    private final String ABBREVIATED_TAX_INVOICE_CODE = "T05";
    private final String RECEIPT_AND_ABBREVIATED_TAX_INVOICE_CODE = "T06";
    private final String CANCELLATION_NOTE_CODE = "T07";

    @Test
    public void shouldHaveTheCorrectCode() {
        assertEquals(DocumentType.DEBIT_NOTE.typeCode, DEBIT_NOTE_CODE);
        assertEquals(DocumentType.CREDIT_NOTE.typeCode, CREDIT_NOTE_CODE);
        assertEquals(DocumentType.INVOICE.typeCode, INVOICE_CODE);
        assertEquals(DocumentType.TAX_INVOICE.typeCode, TAX_INVOICE_CODE);
        assertEquals(DocumentType.RECEIPT.typeCode, RECEIPT_CODE);
        assertEquals(DocumentType.INVOICE_AND_TAX_INVOICE.typeCode, INVOICE_AND_TAX_INVOICE_CODE);
        assertEquals(DocumentType.RECEIPT_TAX_INVOICE.typeCode, RECEIPT_TAX_INVOICE_CODE);
        assertEquals(DocumentType.DELIVERY_AND_TAX_INVOICE.typeCode, DELIVERY_AND_TAX_INVOICE_CODE);
        assertEquals(DocumentType.ABBREVIATED_TAX_INVOICE.typeCode, ABBREVIATED_TAX_INVOICE_CODE);
        assertEquals(DocumentType.RECEIPT_AND_ABBREVIATED_TAX_INVOICE.typeCode, RECEIPT_AND_ABBREVIATED_TAX_INVOICE_CODE);
        assertEquals(DocumentType.CANCELLATION_NOTE.typeCode, CANCELLATION_NOTE_CODE);
    }

}
