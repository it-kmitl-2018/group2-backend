package th.ac.kmitl.soa.group2.forms;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
public class HeaderForm {

    @NotNull
    public String id;

    @NotNull
    public String globalId;

    @NotNull
    public String typeCode;

    public String purposeCode;

    @NotNull
    public Timestamp issuedAt;

}
