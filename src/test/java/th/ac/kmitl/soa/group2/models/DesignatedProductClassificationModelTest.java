package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class DesignatedProductClassificationModelTest {
    public static DesignatedProductClassificationModel model =
            new DesignatedProductClassificationModel(
                    "14111507",
                    Option.some("กระดาษถ่ายเอกสารหรือพิมพ์งานทั่วไป")
            );

    public static String xml =
            tag(CLASS_CODE, "14111507")
            + tag(CLASS_NAME, "กระดาษถ่ายเอกสารหรือพิมพ์งานทั่วไป");

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(model).get(), xml);
    }
}
