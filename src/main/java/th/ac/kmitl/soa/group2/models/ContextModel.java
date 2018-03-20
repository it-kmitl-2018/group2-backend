package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlParameters.*;

@Value
public class ContextModel {

    @Value
    private class Scheme {

        @JacksonXmlText
        String id;

        @JacksonXmlProperty(localName = SCHEME_AGENCY_ID, isAttribute = true)
        String agencyId;

        @JacksonXmlProperty(localName = SCHEME_VERSION_ID, isAttribute = true)
        String versionId;

    }

    @JacksonXmlElementWrapper(localName = GUIDELINE_SPECIFIED_DOCUMENT_CONTEXT_PARAMETER)
    @JacksonXmlProperty(localName = ID)
    Wrapper<Scheme> scheme;

    public ContextModel(String id, String agencyId, String versionId) {
        this.scheme = Wrapper.of(new Scheme(id, agencyId, versionId));
    }

    public static ContextModel withDefault() {
        return new ContextModel(
            DEFAULT_SCHEME_ID,
            DEFAULT_SCHEME_AGENCY_ID,
            DEFAULT_SCHEME_VERSION_ID
        );
    }

}
