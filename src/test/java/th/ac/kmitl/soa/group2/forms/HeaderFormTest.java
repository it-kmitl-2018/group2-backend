package th.ac.kmitl.soa.group2.forms;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static th.ac.kmitl.soa.group2.utils.binders.JsonFormatter.deserialize;

public class HeaderFormTest {

    public static final HeaderForm form =
        new HeaderForm(
            "23424",
            "global id",
            "type code",
            "purpose code",
            new Timestamp(1520396612035L)
        );

    public static final JSONObject json =
        new JSONObject()
            .put("id", "23424")
            .put("globalId", "global id")
            .put("typeCode", "type code")
            .put("purposeCode", "purpose code")
            .put("issuedAt", "1520396612035");

    @Test
    public void shouldParseJsonCorrectly() {
        assertEquals(form, deserialize(json.toString(), HeaderForm.class).get());
    }

}
