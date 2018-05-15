package th.ac.kmitl.soa.group2.definitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TermTypeTest {
    @Test
    public void shouldDecodeToCorrectType() {
        assertEquals(TermType.EX_WORKS, TermType.decode("EXW"));
        assertEquals(TermType.DELIVER_AT_TERMINAL, TermType.decode("DAT"));
        assertEquals(TermType.FREE_CARRIER, TermType.decode("FCA"));
        assertEquals(TermType.DELIVER_AT_PLACE, TermType.decode("DAP"));
        assertEquals(TermType.CARRIAGE_PAID_TO, TermType.decode("CPT"));
        assertEquals(TermType.DELIVERED_DUTY_PAID, TermType.decode("DDP"));
        assertEquals(TermType.CARRIAGE_AND_INSURANCE_PAID_TO, TermType.decode("CIP"));
        assertEquals(TermType.FREE_ALONGSIDE_SHIP, TermType.decode("FAS"));
        assertEquals(TermType.COST_AND_FREIGHT, TermType.decode("CFR"));
        assertEquals(TermType.FREE_ON_BOARD, TermType.decode("FOB"));
        assertEquals(TermType.COST_INSURANCE_AND_FREIGHT, TermType.decode("CIF"));
    }
}
