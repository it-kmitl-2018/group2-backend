package th.ac.kmitl.soa.group2.models;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncludedNoteModelTest {
    String subject = "E-Tax Invoice Backend";
    String content = "Web Application for generate E-Tax";

    @Test
    public void shouldBeGetSubjectAndContentByGetter(){
        IncludedNoteModel includedNoteModel = new IncludedNoteModel(subject, content);
        assertEquals(subject, includedNoteModel.getSubject());
        assertEquals(content, includedNoteModel.getContent());
    }
}
