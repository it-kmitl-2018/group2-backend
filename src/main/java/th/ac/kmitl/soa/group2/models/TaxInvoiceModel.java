package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.CROSS_INDUSTRY_INVOICE;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.EXCHANGED_DOCUMENT;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.EXCHANGED_DOCUMENT_CONTEXT;

@Value
@JacksonXmlRootElement(localName = CROSS_INDUSTRY_INVOICE)
public class TaxInvoiceModel {

    @JacksonXmlProperty(localName = EXCHANGED_DOCUMENT_CONTEXT)
    ContextModel context;

    @JacksonXmlProperty(localName = EXCHANGED_DOCUMENT)
    HeaderModel header;

}
