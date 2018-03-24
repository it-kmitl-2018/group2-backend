package th.ac.kmitl.soa.group2.definitions;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.vavr.collection.Map;
import lombok.RequiredArgsConstructor;

import static java.lang.String.format;
import static th.ac.kmitl.soa.group2.utils.EnumMapper.getMapper;

@RequiredArgsConstructor
public enum TaxpayerIdType {

    TAX_ID("TXID", "เลขประจำตัวผู้เสียภาษีอากรสำหรับนิติบัคคล 13 หลัก รวมเลขสาขาอีก 5 หลัก", "Tax ID"),
    ID_CARD_NUMBER("NIDN", "เลขประจำตัวประชาชน 13 หลัก (สำหรับบุคคลธรรมดา)", "National Registration Identification Number"),
    PASSPORT_NUMBER("CCPT", "เลขหนังสือเดินทาง (Passport)", "Number assigned by an authority to identify the passport number of a person"),
    OTHER_ID_SCHEMA("OTHR", "ตัวระบุอื่นๆใช้ในการระบุเอกลักษณ์ผู้ซื้อนอกเหนือจาก Scheme TXID NIDN CCPT", "Other Identification scheme");

    public final String taxpayerIdCode;
    public final String thaiName;
    public final String englishName;

    public String getName() {
        return format("%s (%s)", thaiName, englishName);
    }

    public static final Map<String, TaxpayerIdType> mapper =
            getMapper(TaxpayerIdType.class, $ -> $.taxpayerIdCode);

    @JsonCreator
    public static TaxpayerIdType decode(String taxpayerIdCode) {
        return mapper.get(taxpayerIdCode).get();
    }
    
}
