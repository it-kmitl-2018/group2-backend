package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;

@RequiredArgsConstructor()
@JacksonXmlRootElement(localName = "rsm:ExchangedDocument")
class DocumentHeader {

    @JacksonXmlProperty(localName = "ram:ID")
    public final String id;

    @JacksonXmlProperty(localName = "ram:Name")
    public final String name;

    @JacksonXmlProperty(localName = "ram:TypeCode")
    public final String typeCode;

    @JacksonXmlProperty(localName = "ram:IssueDateTime")
    public final Timestamp issuedAt;

    @JacksonXmlProperty(localName = "ram:Purpose")
    public final String purpose;

    @JacksonXmlProperty(localName = "ram:PurposeCode")
    public final String purposeCode;

    @JacksonXmlProperty(localName = "ram:GlobalID")
    public final String globalId;

    @JacksonXmlProperty(localName = "ram:CreationDateTime")
    public final Timestamp createdAt;

    // TODO: Add IncludedNote field

}
