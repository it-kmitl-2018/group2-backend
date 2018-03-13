package th.ac.kmitl.soa.group2.forms;

import io.vavr.control.Option;
import lombok.NoArgsConstructor;
import th.ac.kmitl.soa.group2.definitions.DocumentType;
import th.ac.kmitl.soa.group2.models.HeaderModel;
import th.ac.kmitl.soa.group2.models.HeaderNoteModel;
import th.ac.kmitl.soa.group2.utils.Time;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@NoArgsConstructor
public class HeaderForm implements BaseForm<HeaderModel> {

    @NotNull
    public String id;

    @NotNull
    public DocumentType documentType;

    @NotNull
    public Timestamp issuedAt;

    @NotNull
    public Option<String> globalId;

    @NotNull
    public Option<String> purposeCode;

    @Override
    public HeaderModel toModel() {
        return new HeaderModel(
            id,
            documentType.getName(),
            documentType.typeCode,
            issuedAt,
            Option.some("dummy purpose"),
            purposeCode,
            globalId,
            Time.now(),
            new HeaderNoteModel("TODO: Subject", "TODO: Content")
        );
    }

}
