package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class PaymentSummaryModelTest {

    private static double originalInformationAmount = 1234.50;
    private static double lineTotalAmount = 63050;
    private static double differenceSalesInformationAmount = 12345.75;
    private static double allowanceTotalAmount = 2500;
    private static double chargeTotalAmount = 69.50;
    private static double taxBasisTotalAmount = 60550;
    private static double taxTotalAmount = 4238.50;
    private static double grandTotalAmount = 64788.50;

    private static final PaymentSummaryModel
        model = new PaymentSummaryModel(
            originalInformationAmount,
            lineTotalAmount,
            differenceSalesInformationAmount,
            allowanceTotalAmount,
            chargeTotalAmount,
            taxBasisTotalAmount,
            taxTotalAmount,
            grandTotalAmount);

    private static String xml =
        tag(ORIGINAL_INFORMATION_AMOUNT, originalInformationAmount) +
        tag(LINE_TOTAL_AMOUNT, lineTotalAmount) +
        tag(DIFFERENCE_INFORMATION_AMOUNT, differenceSalesInformationAmount) +
        tag(ALLOWANCE_TOTAL_AMOUNT, allowanceTotalAmount) +
        tag(CHARGE_TOTAL_AMOUNT, chargeTotalAmount) +
        tag(TAX_BASIS_TOTAL_AMOUNT, taxBasisTotalAmount) +
        tag(TAX_TOTAL_AMOUNT, taxTotalAmount) +
        tag(GRAND_TOTAL_AMOUNT, grandTotalAmount);

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(model).get(), xml);
    }
}
