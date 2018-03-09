package th.ac.kmitl.soa.group2.forms;

import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Builder
@EqualsAndHashCode
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
