package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;

import static th.ac.kmitl.soa.group2.definitions.XmlTags.*;

@RequiredArgsConstructor()
@JacksonXmlRootElement(localName = "rsm:ExchangedDocument")
class DocumentHeaderModel {

    @JacksonXmlProperty(localName = ID)
    public final String id;

    @JacksonXmlProperty(localName = NAME)
    public final String name;

    @JacksonXmlProperty(localName = TYPE_CODE)
    public final String typeCode;

    @JacksonXmlProperty(localName = ISSUE_DATE_TIME)
    public final Timestamp issuedAt;

    @JacksonXmlProperty(localName = PURPOSE)
    public final String purpose;

    @JacksonXmlProperty(localName = PURPOSE_CODE)
    public final String purposeCode;

    @JacksonXmlProperty(localName = GLOBAL_ID)
    public final String globalId;

    @JacksonXmlProperty(localName = CREATION_DATE_TIME)
    public final Timestamp createdAt;

    @JacksonXmlProperty(localName = INCLUDED_NOTE)
    public final ExchangedDocumentWrapper.Note Note;

}
