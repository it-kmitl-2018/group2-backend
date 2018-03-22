package th.ac.kmitl.soa.group2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.vavr.control.Option;
import lombok.Value;

import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;

@Value
public class PostalTradeAddressModel {

    @JacksonXmlProperty(localName = POSTCODE_CODE)
    Option<String> postcodeCode;

    @JacksonXmlProperty(localName = BUILDING_NAME)
    Option<String> buildingName;

    @JacksonXmlProperty(localName = LINE_ONE)
    Option<String> lineOne;

    @JacksonXmlProperty(localName = LINE_TWO)
    Option<String> lineTwo;

    @JacksonXmlProperty(localName = LINE_THREE)
    Option<String> lineThree;

    @JacksonXmlProperty(localName = LINE_FOUR)
    Option<String> lineFour;

    @JacksonXmlProperty(localName = LINE_FIVE)
    Option<String> lineFive;

    @JacksonXmlProperty(localName = STREET_NAME)
    Option<String> streetName;

    @JacksonXmlProperty(localName = CITY_NAME)
    Option<String> cityName;

    @JacksonXmlProperty(localName = CITY_SUB_DIVISION_NAME)
    Option<String> citySubDivisionName;

    @JacksonXmlProperty(localName = COUNTRY_ID)
    Option<String> countryID;

    @JacksonXmlProperty(localName = COUNTRY_SUB_DIVISION_ID)
    Option<String> countrySubDivisionID;

    @JacksonXmlProperty(localName = BUILDING_NUMBER)
    Option<String>  buildingNumber;

}
