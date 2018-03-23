package th.ac.kmitl.soa.group2.definitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllowanceChargeTypeTest {

    @Test
    public void shouldDecodeToCorrectType() {
        assertEquals(AllowanceChargeType.STAMP_DUTY, AllowanceChargeType.decode("28"));
        assertEquals(AllowanceChargeType.BANK_CHARGES, AllowanceChargeType.decode("30"));
        assertEquals(AllowanceChargeType.MINIMUM_COMMISSION, AllowanceChargeType.decode("52"));
        assertEquals(AllowanceChargeType.TRANSFER_CHARGES, AllowanceChargeType.decode("55"));
        assertEquals(AllowanceChargeType.MISCELLANEOUS_CHARGES, AllowanceChargeType.decode("57"));
        assertEquals(AllowanceChargeType.FOREIGN_EXCHANGE_CHARGES, AllowanceChargeType.decode("58"));
        assertEquals(AllowanceChargeType.SPECIAL_AGREEMENT_CHARGE, AllowanceChargeType.decode("65"));
        assertEquals(AllowanceChargeType.SAMPLE_DISCOUNT, AllowanceChargeType.decode("66"));
        assertEquals(AllowanceChargeType.RUSH_DELIVERY_SURCHARGE, AllowanceChargeType.decode("77"));
        assertEquals(AllowanceChargeType.LOADING_CHARGE, AllowanceChargeType.decode("82"));
        assertEquals(AllowanceChargeType.WAREHOUSING_CHARGE, AllowanceChargeType.decode("85"));
        assertEquals(AllowanceChargeType.REDUCTION_FROM_USUAL_PRICE, AllowanceChargeType.decode("95"));
        assertEquals(AllowanceChargeType.CHARGE_FOR_INSURANCE, AllowanceChargeType.decode("96"));
    }

}
