package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor()
@JacksonXmlRootElement(localName = "ram:DefinedTradeContact")
class DefinedTradeContactModel {

    @JacksonXmlProperty(localName = "ram:PersonName")
    public final String personName;

    @JacksonXmlProperty(localName = "ram:DepartmentName")
    public final String departmentName;

}