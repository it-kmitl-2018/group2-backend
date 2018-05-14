package th.ac.kmitl.soa.group2.definitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTypeTest {

    @Test
    public void shouldDecodeToCorrectType() {
        assertEquals(PaymentType.UNCONFIRMED_BYTIME_UNSPECIFIED, PaymentType.decode("CREDOC"));
        assertEquals(PaymentType.UNCONFIRMED_BYTIME_STATED, PaymentType.decode("CREDOC/nM"));
        assertEquals(PaymentType.CONFIRMED_BYTIME_UNSPECIFIED, PaymentType.decode("CONCREDOC"));
        assertEquals(PaymentType.CONFIRMED_BYTIME_STATED, PaymentType.decode("CONCREDOC/nM"));
        assertEquals(PaymentType.BYTIME_UNSPECIFIED, PaymentType.decode("RECREDOC"));
        assertEquals(PaymentType.BYTIME_STATED, PaymentType.decode("RECREDOC/nM"));
        assertEquals(PaymentType.CLEAN_COLLECTION, PaymentType.decode("COLLECT"));
        assertEquals(PaymentType.COLLECTION_BYTIME_UNSPECIFIED, PaymentType.decode("DOCOLLECT"));
        assertEquals(PaymentType.COLLECTION_BYTIME_STATED, PaymentType.decode("DOCOLLECT/nM"));
        assertEquals(PaymentType.WITH_IMMIDIATE_PAYMENT, PaymentType.decode("INNO"));
        assertEquals(PaymentType.WITH_PRIOR_ACCEPTANCE, PaymentType.decode("INPA"));
        assertEquals(PaymentType.PAY_BY_INSTALMENT, PaymentType.decode("PARTS"));
        assertEquals(PaymentType.PAY_BY_FIXED_DATE, PaymentType.decode("AAAA/MM/JJ"));
        assertEquals(PaymentType.PAY_BY_ADVANCE, PaymentType.decode("ANTICIP"));
        assertEquals(PaymentType.PAY_BY_DELIVERY, PaymentType.decode("CASH"));
        assertEquals(PaymentType.PAY_TO_CARRIER, PaymentType.decode("REMBURS"));
        assertEquals(PaymentType.PAY_BY_ENDOFMONTH, PaymentType.decode("ULTIMO"));
        assertEquals(PaymentType.PAY_BY_ENDTIME_OF_ENDOFMONTH, PaymentType.decode("ULTIMO/nM"));
        assertEquals(PaymentType.PAY_BY_ENDTIME_OF_DELIVERY, PaymentType.decode("DEL/nM"));
        assertEquals(PaymentType.PAY_ON_RECEIPT, PaymentType.decode("CASHINV"));
        assertEquals(PaymentType.PAY_ON_RECEIPT_ENDOFMONTH, PaymentType.decode("INVULTIMO"));
        assertEquals(PaymentType.PAY_ON_RECEIPT_ENDTIME_OF_ENDOFMONTH, PaymentType.decode("INVULTIMO/nM"));
        assertEquals(PaymentType.PAY_ON_ENDTIME_OF_RECEIPT, PaymentType.decode("INV/nM"));
        assertEquals(PaymentType.DISCOUNT, PaymentType.decode("DIS n% nM"));
        assertEquals(PaymentType.INTEREST_FOR_DELAYED, PaymentType.decode("INT nM n%"));
        assertEquals(PaymentType.COMPENSATORY, PaymentType.decode("COMPENS"));
        assertEquals(PaymentType.PAY_ON_CONSIGNMENT, PaymentType.decode("CONSIGN"));
        assertEquals(PaymentType.PAY_ON_AGREEMENT, PaymentType.decode("AGREE"));
        assertEquals(PaymentType.PAY_ON_CUSTOM_TERM, PaymentType.decode("HABIT"));
        assertEquals(PaymentType.NOPAY, PaymentType.decode("NOPAY"));
    }
}
