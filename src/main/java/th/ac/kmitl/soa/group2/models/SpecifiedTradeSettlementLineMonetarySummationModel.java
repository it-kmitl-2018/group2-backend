package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@JacksonXmlRootElement
class SpecifiedTradeSettlementLineMonetarySummationModel {

    @JacksonXmlProperty(localName = "ram:TaxTotalAmount")
    public final float taxTotalAmount;

    @JacksonXmlProperty(localName = "ram:NetLineTotalAmount")
    public final float netLineTotalAmount;

    @JacksonXmlProperty(localName = "ram:NetIncludingTaxesLineTotalAmount")
    public final float netIncludingTaxesLineTotalAmount;

}
