package th.ac.kmitl.soa.group2.forms;

import io.vavr.control.Option;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@NoArgsConstructor
public class HeaderForm {

    @NotNull
    public String id;

    @NotNull
    public String typeCode;

    @NotNull
    public Timestamp issuedAt;

    @NotNull
    public Option<String> globalId;

    @NotNull
    public Option<String> purposeCode;

}
