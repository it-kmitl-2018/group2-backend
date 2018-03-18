package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vavr.control.Option;
import lombok.Value;

import java.sql.Timestamp;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;

@Value
public class HeaderModel {

    @JacksonXmlProperty(localName = ID)
    String id;

    @JacksonXmlProperty(localName = NAME)
    String name;

    @JacksonXmlProperty(localName = TYPE_CODE)
    String typeCode;

    @JacksonXmlProperty(localName = ISSUE_DATE_TIME)
    Timestamp issuedAt;

    @JacksonXmlProperty(localName = PURPOSE)
    Option<String> purpose;

    @JacksonXmlProperty(localName = PURPOSE_CODE)
    Option<String> purposeCode;

    @JacksonXmlProperty(localName = GLOBAL_ID)
    Option<String> globalId;

    @JacksonXmlProperty(localName = CREATION_DATE_TIME)
    Timestamp createdAt;

    @JacksonXmlProperty(localName = INCLUDED_NOTE)
    HeaderNoteModel headerNoteModel;

}
