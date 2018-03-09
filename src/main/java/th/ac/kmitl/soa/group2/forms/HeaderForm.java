package th.ac.kmitl.soa.group2.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class HeaderForm {

    @NotNull
    public String id;

    @NotNull
    public String globalId;

    @NotNull
    public String typeCode;

    @NotNull
    public String purposeCode;

    @NotNull
    public Timestamp issuedAt;

}
