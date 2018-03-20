package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;

@Value
@JacksonXmlRootElement(localName = INCLUDED_NOTE)
public class HeaderNoteModel {

    @JacksonXmlProperty(localName = SUBJECT)
    public String subject;

    @JacksonXmlProperty(localName = CONTENT)
    public String content;

}
