package th.ac.kmitl.soa.group2.forms;

import io.vavr.control.Option;
import lombok.AllArgsConstructor;
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

    public Option<String> purposeCode;

    @NotNull
    public Timestamp issuedAt;

}
