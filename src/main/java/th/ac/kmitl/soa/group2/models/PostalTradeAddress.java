package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.sql.Timestamp;

@JacksonXmlRootElement(localName = "rsm:PostalTradeAddress")
public class PostalTradeAddress {

    @JacksonXmlProperty(localName = "ram:PostcodeCode")
    public String postcodeCode;

    @JacksonXmlProperty(localName = "ram:LineThree")
    public String lineThree;

    @JacksonXmlProperty(localName = "ram:StreetName")
    public String streetName;

    @JacksonXmlProperty(localName = "ram:CityName")
    public String cityName;

    @JacksonXmlProperty(localName = "ram:CitySubDivisionName")
    public String citySubDivisionName;

    @JacksonXmlProperty(localName = "ram:CountryID")
    public String countryID;

    @JacksonXmlProperty(localName = "ram:CountrySubDivisionID")
    public String countrySubDivisionID;

    @JacksonXmlProperty(localName = "ram:BuildingNumber")
    public String buildingNumber;

}
