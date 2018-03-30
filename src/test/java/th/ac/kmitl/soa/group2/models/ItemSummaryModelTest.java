package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.definitions.EtdaXmlTags.*;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.serializeWithoutRoot;
import static th.ac.kmitl.soa.group2.utils.binders.Xml.tag;

public class ItemSummaryModelTest {

    private static final ItemSummaryModel itemSummaryModel =
        new ItemSummaryModel(
            Option.some(749F),
            10700F,
            11449F
        );

    private final String xml =
            tag(TAX_TOTAL_AMOUNT, "749.0")
                    + tag(NET_LINE_TOTAL_AMOUNT, "10700.0")
                    + tag(NET_INCLUDING_TAXES_LINE_TOTAL_AMOUNT, "11449.0");

    @Test
    public void shouldCreateCorrectXml() {
        assertEquals(serializeWithoutRoot(itemSummaryModel).get(), xml);
    }

}
