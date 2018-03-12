package th.ac.kmitl.soa.group2.models;

import io.vavr.control.Option;
import th.ac.kmitl.soa.group2.definitions.DocumentType;

import java.sql.Timestamp;

public class ExchangedDocumentWrapper {

    // TODO : Replace subject and content by TaxInvoiceForm model.
    private String subject, content, id, name, typeCode, purpose, purposeCode, globalid;
    private Timestamp createAt, issueAt;

    public ExchangedDocumentWrapper(String subject,
                                    String content,
                                    String id,
                                    String name,
                                    String typeCode,
                                    String purpose,
                                    String purposeCode,
                                    String globalid,
                                    Timestamp issueAt,
                                    Timestamp createAt) {
        // TODO : need to replace all args by TaxInvoiceForm.
        this.subject = subject;
        this.content = content;
        this.id = id;
        this.name = name;
        this.typeCode = typeCode;
        this.purpose = purpose;
        this.purposeCode = purposeCode;
        this.globalid = globalid;
        this.createAt = createAt;
        this.issueAt = issueAt;
    }

    public HeaderModel getModel(){
        HeaderNoteModel headerNoteModel = new HeaderNoteModel(subject, content);

        // TODO : All fields will replace by TaxInvoiceForm fields.
        HeaderModel headerModel = new HeaderModel(
                id,
                name,
                typeCode,
                issueAt,
                Option.some(purpose),
                Option.some(purposeCode),
                Option.some(globalid),
                createAt,
                headerNoteModel
        );

        return headerModel;
    }
}
