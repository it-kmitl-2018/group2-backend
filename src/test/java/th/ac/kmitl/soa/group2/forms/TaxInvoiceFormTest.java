package th.ac.kmitl.soa.group2.forms;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.utils.binders.JsonFormatter.deserialize;

public class TaxInvoiceFormTest {

    public static final TaxInvoiceForm form =
        new TaxInvoiceForm(HeaderFormTest.form);

    public static final JSONObject json =
        new JSONObject()
            .put("header", HeaderFormTest.json);

    @Test
    public void shouldParseJsonCorrectly() {
        assertEquals(form, deserialize(json.toString(), TaxInvoiceForm.class).get());
    }

}
