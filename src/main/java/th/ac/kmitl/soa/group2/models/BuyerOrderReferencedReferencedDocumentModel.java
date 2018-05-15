package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.vavr.control.Option;
import lombok.Value;

import java.sql.Timestamp;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;

@Value
public class BuyerOrderReferencedReferencedDocumentModel {

        @JacksonXmlProperty(localName = ISSUE_ASSIGNED_ID)
        String issueAssignedId;

        @JacksonXmlProperty(localName = ISSUE_DATE_TIME)
        Timestamp issuedAt;

        @JacksonXmlProperty(localName = REFERENCE_TYPE_CODE)
        String referenceTypeCode;

}
