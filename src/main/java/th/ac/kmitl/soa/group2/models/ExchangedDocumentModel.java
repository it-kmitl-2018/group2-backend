package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.sql.Timestamp;

@JacksonXmlRootElement(localName = "rsm:ExchangedDocument")
public class ExchangedDocumentModel {

    @JacksonXmlProperty(localName = "ram:ID")
    public String id;

    @JacksonXmlProperty(localName = "ram:Name")
    public String name;

    @JacksonXmlProperty(localName = "ram:TypeCode")
    public String typeCode;

    @JacksonXmlProperty(localName = "ram:IssueDateTime")
    public Timestamp issueDateTime;

    @JacksonXmlProperty(localName = "ram:Purpose")
    public String purpose;

    @JacksonXmlProperty(localName = "ram:PurposeCode")
    public String purposeCode;

    @JacksonXmlProperty(localName = "ram:GlobalID")
    public String globalId;

    @JacksonXmlProperty(localName = "ram:CreationDateTime")
    public Timestamp creationDateTime;

}
