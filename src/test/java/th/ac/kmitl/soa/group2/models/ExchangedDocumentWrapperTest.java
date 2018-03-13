package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group2.definitions.DocumentType;
import th.ac.kmitl.soa.group2.utils.binders.Xml;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExchangedDocumentWrapperTest {

    public static ExchangedDocumentWrapper model =
            new ExchangedDocumentWrapper(
                    "หมายเหตุ",
                    "เนื้อหา",
                    "RDTIV0575526000058001",
                    "ใบกำกับภาษี",
                    DocumentType.TAX_INVOICE.typeCode,
                    "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง",
                    "DCNS03",
                    "2.16.764.1.1.2.1.4.3.7",
                    new Timestamp(1520396612035L),
                    new Timestamp(1520396640256L)
            );

    public static final String xml =
            "<rsm:ExchangedDocument>" +
                    "<ram:ID>RDTIV0575526000058001</ram:ID>" +
                    "<ram:Name>ใบกำกับภาษี</ram:Name>" +
                    "<ram:TypeCode>388</ram:TypeCode>" +
                    "<ram:IssueDateTime>1520396612035</ram:IssueDateTime>" +
                    "<ram:Purpose>คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง</ram:Purpose>" +
                    "<ram:PurposeCode>DCNS03</ram:PurposeCode>" +
                    "<ram:GlobalID>2.16.764.1.1.2.1.4.3.7</ram:GlobalID>" +
                    "<ram:CreationDateTime>1520396640256</ram:CreationDateTime>" +
                    "<ram:IncludedNote>" +
                            "<ram:Subject>หมายเหตุ</ram:Subject>" +
                            "<ram:Content>เนื้อหา</ram:Content>" +
                    "</ram:IncludedNote>"+
            "</rsm:ExchangedDocument>";

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(Xml.serialize(model.getModel()).get(), xml);
    }
}
