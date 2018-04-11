package th.ac.kmitl.soa.group2.definitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PurposeTypeTest {

    @Test
    public void shouldDecodeToCorrectType() {
        assertEquals(PurposeType.INCREASE_PRODUCT_PRICE, PurposeType.decode("DBNG01"));
        assertEquals(PurposeType.UNDER_CALCULATE_PRODUCT_PRICE, PurposeType.decode("DBNG02"));
        assertEquals(PurposeType.OTHER_PRODUCT_REASON_DEBIT_NOTE, PurposeType.decode("DBNG99"));
        assertEquals(PurposeType.INCREASE_SERVICE_PRICE, PurposeType.decode("DBNS01"));
        assertEquals(PurposeType.UNDER_CALCULATE_SERVICE_PRICE, PurposeType.decode("DBNS02"));
        assertEquals(PurposeType.OTHER_SERVICE_REASON_DEBIT_NOTE, PurposeType.decode("DBNS99"));
        assertEquals(PurposeType.DISCOUNT_PRODUCT_PRICE, PurposeType.decode("DCNG01"));
        assertEquals(PurposeType.PRODUCT_DAMAGED, PurposeType.decode("DCNG02"));
        assertEquals(PurposeType.MISSING_PRODUCT_ITEMS, PurposeType.decode("DCNG03"));
        assertEquals(PurposeType.OVER_CALCULATE_PRODUCT_PRICE, PurposeType.decode("DCNG04"));
        assertEquals(PurposeType.RETURN_PRODUCT, PurposeType.decode("DCNG05"));
        assertEquals(PurposeType.OTHER_PRODUCT_REASON_CREDIT_NOTE, PurposeType.decode("DCNG99"));
        assertEquals(PurposeType.DISCOUNT_SERVICE_CHARGE, PurposeType.decode("DCNS01"));
        assertEquals(PurposeType.INCOMPLETE_SERVICE_CHARGE, PurposeType.decode("DCNS02"));
        assertEquals(PurposeType.OVER_CALCULATE_SERVICE_CHARGE, PurposeType.decode("DCNS03"));
        assertEquals(PurposeType.CONTRACT_CANCELLATION, PurposeType.decode("DCNS04"));
        assertEquals(PurposeType.OTHER_SERVICE_REASON_CREDIT_NOTE, PurposeType.decode("DCNS99"));
        assertEquals(PurposeType.WRONG_NAME_AT_TAX_INVOICE, PurposeType.decode("TIVC01"));
        assertEquals(PurposeType.WRONG_ADDRESS_AT_TAX_INVOICE, PurposeType.decode("TIVC02"));
        assertEquals(PurposeType.OTHER_REASON_AT_TAX_INVOICE, PurposeType.decode("TIVC99"));
        assertEquals(PurposeType.WRONG_NAME_AT_RECEIPT, PurposeType.decode("RCTC01"));
        assertEquals(PurposeType.WRONG_ADDRESS_AT_RECEIPT, PurposeType.decode("RCTC02"));
        assertEquals(PurposeType.RETURN_PRODUCT_OR_SERVICE_CANCELLATION_ALL, PurposeType.decode("RCTC03"));
        assertEquals(PurposeType.RETURN_PRODUCT_OR_SERVICE_CANCELLATION_SOME, PurposeType.decode("RCTC04"));
        assertEquals(PurposeType.OTHER_REASON_AT_RECEIPT, PurposeType.decode("RCTC99"));
    }
    
}
