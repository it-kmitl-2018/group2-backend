package th.ac.kmitl.soa.group2.models;

public class IncludedNoteModel {

    public String subject;
    public String content;

    public IncludedNoteModel(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }
}
