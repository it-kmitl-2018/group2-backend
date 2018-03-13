package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group2.utils.binders.Xml;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostalTradeAddressModelTest {

    public static final PostalTradeAddressModel postalTradeAddressModel =
            new PostalTradeAddressModel(
                    Option.some("10510"),
                    Option.some("อาคาร"),
                    Option.some("44/22"),
                    Option.some("236/56"),
                    Option.none(),
                    Option.none(),
                    Option.none(),
                    Option.some("มิมิ"),
                    Option.some("เมือง"),
                    Option.some("มวกเหล็ก"),
                    Option.some("525"),
                    Option.some("102"),
                    Option.some("44/22")
            );

    public static final String xml =
            "<ram:PostalTradeAddress>" +
                    "<ram:PostcodeCode>10510</ram:PostcodeCode>" +
                    "<ram:BuildingName>อาคาร</ram:BuildingName>" +
                    "<ram:LineOne>44/22</ram:LineOne>" +
                    "<ram:LineTwo>236/56</ram:LineTwo>" +
                    "<ram:LineThree/>" +
                    "<ram:LineFour/>" +
                    "<ram:LineFive/>" +
                    "<ram:StreetName>มิมิ</ram:StreetName>" +
                    "<ram:CityName>เมือง</ram:CityName>" +
                    "<ram:CitySubDivisionName>มวกเหล็ก</ram:CitySubDivisionName>" +
                    "<ram:CountryID>525</ram:CountryID>" +
                    "<ram:CountrySubDivisionID>102</ram:CountrySubDivisionID>" +
                    "<ram:BuildingNumber>44/22</ram:BuildingNumber>" +
            "</ram:PostalTradeAddress>";

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(Xml.serialize(postalTradeAddressModel).get(), xml);
    }

}
