package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ram:DefinedTradeContact")
public class DefinedTradeContactModel {

    @JacksonXmlProperty(localName = "ram:PersonName")
    public String personName;

    @JacksonXmlProperty(localName = "ram:DepartmentName")
    public String departmentName;

}