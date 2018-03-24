package th.ac.kmitl.soa.group2.definitions;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.vavr.collection.Map;
import lombok.RequiredArgsConstructor;

import static java.lang.String.format;
import static th.ac.kmitl.soa.group2.utils.EnumMapper.getMapper;

@RequiredArgsConstructor
public enum ReferenceType {

    INVOICE_NUMBER("IV", "เลขใบแจ้งหนี้", "Reference number to identify an invoice"),
    DOCUMENT_REFERENCE_NUMBER("LC", "เลขอ้างอิงระบุเอกสาร", "Reference number identifying the letter of credit document"),
    SERIAL_NUMBER("LS", "เลขบาร์โค้ด", "Bar coded label serial number"),
    ORDER_DOCUMENT_IDENTIFIER("ON", "เลขที่สั่งซื้อออกโดยผู้ซื้อ", "Order document identifier, buyer assigned"),
    ITEM_NUMBER("SE", "เลขระบุสินค้า",
            "Identification number of an item which distinguishes this specific item out of an number of identical items"),
    PREVIOUS_TAX_CONTROL_NUMBER("ALT", "เลขใบกากับภาษีใบเดิม", "Previous tax control number"),
    DEBIT_NOTE_NUMBER("DL", "หมายเลขใบเพิ่มหนี้", "Debit Note Number"),
    CREDIT_NOTE_NUMBER("CD", "หมายเลขใบลดหนี้", "Credit Note Number"),
    MUTUALLY_DEFINED_REFERENCE_NUMBER("ZZZ", "เอกสารอื่น ๆ", "Mutually defined reference number");

    public final String refCode;
    public final String thaiName;
    public final String englishName;

    public String getName() {
        return format("%s (%s)", thaiName, englishName);
    }

    public static final Map<String, ReferenceType> mapper =
            getMapper(ReferenceType.class, $ -> $.refCode);

    @JsonCreator
    public static ReferenceType decode(String refCode) {
        return mapper.get(refCode).get();
    }

}
