package th.ac.kmitl.soa.group2.models;

import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.utils.XmlFormatter.serialize;

public class HeaderModelTest {

     public static final HeaderModel model =
        new HeaderModel(
            "RDTIV0575526000058001",
            "ใบกำกับภาษี",
            TypeCode.TAX_INVOICE.getTypeCode(),
            new Timestamp(1520396640256L),
            "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง",
            "DCNS03",
            "2.16.764.1.1.2.1.4.3.7",
            new Timestamp(1520396612035L)
        );

     public static final String xml =
        "<rsm:ExchangedDocument>" +
            "<ram:ID>RDTIV0575526000058001</ram:ID>" +
            "<ram:Name>ใบกำกับภาษี</ram:Name>" +
            "<ram:TypeCode>388</ram:TypeCode>" +
            "<ram:IssueDateTime>1520396640256</ram:IssueDateTime>" +
            "<ram:Purpose>คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง</ram:Purpose>" +
            "<ram:PurposeCode>DCNS03</ram:PurposeCode>" +
            "<ram:GlobalID>2.16.764.1.1.2.1.4.3.7</ram:GlobalID>" +
            "<ram:CreationDateTime>1520396612035</ram:CreationDateTime>" +
        "</rsm:ExchangedDocument>";

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serialize(model).get(), xml);
    }

}
