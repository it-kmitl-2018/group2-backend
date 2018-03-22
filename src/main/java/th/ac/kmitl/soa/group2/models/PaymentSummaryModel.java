package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;

@Value
public class PaymentSummaryModel {

    @JacksonXmlProperty(localName = ORIGINAL_INFORMATION_AMOUNT)
    Double originalInfoAmount;

    @JacksonXmlProperty(localName = LINE_TOTAL_AMOUNT)
    Double lineTotalAmount;

    @JacksonXmlProperty(localName = DIFFERENCE_INFORMATION_AMOUNT)
    Double differenceInfoAmount;

    @JacksonXmlProperty(localName = ALLOWANCE_TOTAL_AMOUNT)
    Double allowanceTotalAmount;

    @JacksonXmlProperty(localName = CHARGE_TOTAL_AMOUNT)
    Double chargeTotalAmount;

    @JacksonXmlProperty(localName = TAX_BASIS_TOTAL_AMOUNT)
    Double taxBasisTotalAmount;

    @JacksonXmlProperty(localName = TAX_TOTAL_AMOUNT)
    Double taxTotalAmount;

    @JacksonXmlProperty(localName = GRAND_TOTAL_AMOUNT)
    Double grandTotalAmount;

}
