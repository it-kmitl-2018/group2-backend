package th.ac.kmitl.soa.group2.definitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentTypeTest {

    @Test
    public void shouldDecodeToCorrectType() {
        assertEquals(DocumentType.DEBIT_NOTE, DocumentType.decode("80"));
        assertEquals(DocumentType.CREDIT_NOTE, DocumentType.decode("81"));
        assertEquals(DocumentType.INVOICE, DocumentType.decode("380"));
        assertEquals(DocumentType.TAX_INVOICE, DocumentType.decode("388"));
        assertEquals(DocumentType.RECEIPT, DocumentType.decode("T01"));
        assertEquals(DocumentType.INVOICE_AND_TAX_INVOICE, DocumentType.decode("T02"));
        assertEquals(DocumentType.RECEIPT_AND_TAX_INVOICE, DocumentType.decode("T03"));
        assertEquals(DocumentType.DELIVERY_ORDER_AND_TAX_INVOICE, DocumentType.decode("T04"));
        assertEquals(DocumentType.ABBREVIATED_TAX_INVOICE, DocumentType.decode("T05"));
        assertEquals(DocumentType.RECEIPT_AND_ABBREVIATED_TAX_INVOICE, DocumentType.decode("T06"));
        assertEquals(DocumentType.CANCELLATION_NOTE, DocumentType.decode("T07"));
    }

}
