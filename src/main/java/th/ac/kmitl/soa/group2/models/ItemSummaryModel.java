package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vavr.control.Option;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;

@Value
class ItemSummaryModel {

    @JacksonXmlProperty(localName = TAX_TOTAL_AMOUNT)
    Option<Float> taxTotalAmount;

    @JacksonXmlProperty(localName = NET_LINE_TOTAL_AMOUNT)
    Float netLineTotalAmount;

    @JacksonXmlProperty(localName = NET_INCLUDING_TAXES_LINE_TOTAL_AMOUNT)
    Float netIncludingTaxesLineTotalAmount;

}
