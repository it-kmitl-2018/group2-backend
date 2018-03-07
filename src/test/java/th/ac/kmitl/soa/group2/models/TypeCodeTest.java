package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypeCodeTest {

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
        assertEquals(TypeCode.DEBIT_NOTE.getTypeCode(), DEBIT_NOTE_CODE);
        assertEquals(TypeCode.CREDIT_NOTE.getTypeCode(), CREDIT_NOTE_CODE);
        assertEquals(TypeCode.INVOICE.getTypeCode(), INVOICE_CODE);
        assertEquals(TypeCode.TAX_INVOICE.getTypeCode(), TAX_INVOICE_CODE);
        assertEquals(TypeCode.RECEIPT.getTypeCode(), RECEIPT_CODE);
        assertEquals(TypeCode.INVOICE_AND_TAX_INVOICE.getTypeCode(), INVOICE_AND_TAX_INVOICE_CODE);
        assertEquals(TypeCode.RECEIPT_TAX_INVOICE.getTypeCode(), RECEIPT_TAX_INVOICE_CODE);
        assertEquals(TypeCode.DELIVERY_AND_TAX_INVOICE.getTypeCode(), DELIVERY_AND_TAX_INVOICE_CODE);
        assertEquals(TypeCode.ABBREVIATED_TAX_INVOICE.getTypeCode(), ABBREVIATED_TAX_INVOICE_CODE);
        assertEquals(TypeCode.RECEIPT_AND_ABBREVIATED_TAX_INVOICE.getTypeCode(), RECEIPT_AND_ABBREVIATED_TAX_INVOICE_CODE);
        assertEquals(TypeCode.CANCELLATION_NOTE.getTypeCode(), CANCELLATION_NOTE_CODE);
    }

}
