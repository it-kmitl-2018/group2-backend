package th.ac.kmitl.soa.group2.definitions;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.vavr.collection.Map;
import lombok.RequiredArgsConstructor;

import static java.lang.String.format;
import static th.ac.kmitl.soa.group2.utils.EnumMapper.getMapper;

@RequiredArgsConstructor
public enum DocumentType {

    DEBIT_NOTE("80", "ใบเพิ่มหนี้", "Debit Note"),
    CREDIT_NOTE("81", "ใบลดหนี้", "Credit Note"),
    INVOICE("380", "ใบแจ้งหนี้", "Invoice"),
    TAX_INVOICE("388", "ใบกำกับภาษี", "Tax Invoice"),
    RECEIPT("T01", "ใบรับ", "Receipt"),
    INVOICE_AND_TAX_INVOICE("T02", "ใบแจ้งหนี้/ใบกำกับภาษี", "Invoice / Tax Invoice"),
    RECEIPT_AND_TAX_INVOICE("T03", "ใบเสร็จรับเงิน/ใบกํากับภาษี", "Receipt / Tax Invoice"),
    DELIVERY_ORDER_AND_TAX_INVOICE("T04", "ใบส่งของ/ใบกํากับภําษี", "Delivery order / Tax Invoice"),
    ABBREVIATED_TAX_INVOICE("T05", "ใบกํากับภาษีอย่างย่อ", "Abbreviated Tax Invoice"),
    RECEIPT_AND_ABBREVIATED_TAX_INVOICE("T06", "ใบเสร็จรับเงิน/ใบกํากับภาษีอย่างย่อ", "Receipt / Abbreviated Tax Invoice"),
    CANCELLATION_NOTE("T07", "ใบแจ้งยกเลิก", "Cancellation note");

    public final String typeCode;
    public final String thaiName;
    public final String englishName;

    public String getName() {
        return format("%s (%s)", thaiName, englishName);
    }

    public static final Map<String, DocumentType> mapper =
        getMapper(DocumentType.class, $ -> $.typeCode);

    @JsonCreator
    public static DocumentType decode(String typeCode) {
        return mapper.get(typeCode).get();
    }

}
