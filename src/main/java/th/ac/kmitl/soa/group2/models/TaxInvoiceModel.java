package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.RequiredArgsConstructor;

import static th.ac.kmitl.soa.group2.definitions.XmlTags.CROSS_INDUSTRY_INVOICE;
import static th.ac.kmitl.soa.group2.definitions.XmlTags.EXCHANGED_DOCUMENT;

@RequiredArgsConstructor
@JacksonXmlRootElement(localName = CROSS_INDUSTRY_INVOICE)
public class TaxInvoiceModel {

    @JacksonXmlProperty(localName = EXCHANGED_DOCUMENT)
    public final HeaderModel header;

}
