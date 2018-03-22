package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group2.utils.binders.Xml;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class PostalTradeAddressModelTest {

    public static final PostalTradeAddressModel postalTradeAddressModel =
            new PostalTradeAddressModel(
                    Option.some("10510"),
                    Option.some("อาคาร"),
                    Option.some("44/22"),
                    Option.some("236/56"),
                    Option.some(""),
                    Option.some(""),
                    Option.some(""),
                    Option.some("มิมิ"),
                    Option.some("เมือง"),
                    Option.some("มวกเหล็ก"),
                    Option.some("525"),
                    Option.some("102"),
                    Option.some("44/22")
            );

    public static final String xml =
            tag(POSTCODE_CODE, "10510")+
            tag(BUILDING_NAME, "อาคาร")+
            tag(LINE_ONE, "44/22")+
            tag(LINE_TWO, "236/56")+
            tag(LINE_THREE, "")+
            tag(LINE_FOUR, "")+
            tag(LINE_FIVE, "")+
            tag(STREET_NAME, "มิมิ")+
            tag(CITY_NAME, "เมือง")+
            tag(CITY_SUB_DIVISION_NAME, "มวกเหล็ก")+
            tag(COUNTRY_ID, "525")+
            tag(COUNTRY_SUB_DIVISION_ID, "102")+
            tag(BUILDING_NUMBER, "44/22");

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(postalTradeAddressModel).get(), xml);
    }

}
