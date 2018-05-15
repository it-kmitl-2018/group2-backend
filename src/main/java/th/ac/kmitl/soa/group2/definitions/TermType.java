package th.ac.kmitl.soa.group2.definitions;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.vavr.collection.Map;
import lombok.RequiredArgsConstructor;

import static java.lang.String.format;
import static th.ac.kmitl.soa.group2.utils.EnumMapper.getMapper;

@RequiredArgsConstructor
public enum TermType {
    EX_WORKS("EXW", "ตามชื่อสถานที่จัดส่ง", "EX WORKS on named place of delivery"),
    DELIVER_AT_TERMINAL("DAT", "ตามสถานที่ปลายทาง", "Delivered at terminal on named terminal at port or place of destination"),
    FREE_CARRIER("FCA", "ตามชื่อสถานที่จัดส่งโดยผู้ให้บริการอิสระ", "Free carrier on named place of delivery"),
    DELIVER_AT_PLACE("DAP", "ตามสถานที่จุดหมาย", "named place of destination"),
    CARRIAGE_PAID_TO("CPT", "ตามจุดหมายที่ได้รับชำระเงิน", "Carriage paid on named place of destination"),
    DELIVERED_DUTY_PAID("DDP", "ตามจุดหมายที่ได้จ่ายภาษีแล้ว", "Delivered duty paid on named place of destination"),
    CARRIAGE_AND_INSURANCE_PAID_TO("CIP", "ตามจุดหมายที่ได้รับชำระเงินและมีประกันภัย", "Carriage and insurance paid to named place of destination"),
    FREE_ALONGSIDE_SHIP("FAS", "ตามชื่อท่าเรือขนส่ง", "Free alongside ship on named port of shipment"),
    COST_AND_FREIGHT("CFR", "ตามชื่อท่าเรือขนส่งที่ได้รับค่าระวาง", "Cost and frieght on named port of destination"),
    FREE_ON_BOARD("FOB", "ตามชื่อท่าเรือส่งสินค้าอิสระ", "Free on board on named port of destination"),
    COST_INSURANCE_AND_FREIGHT("CIF", "ตามชื่อท่าเรือขนส่งที่ได้รับค่าระวางและมีประกันภัย", "Cost, Insurance and freight on named port of destination");

    public final String typeCode;
    public final String thaiName;
    public final String englishName;

    public String getName() {
        return format("%s (%s)", thaiName, englishName);
    }

    public static final Map<String, TermType> mapper =
            getMapper(TermType.class, $ -> $.typeCode);

    @JsonCreator
    public static TermType decode(String typeCode) {
        return mapper.get(typeCode).get();
    }
}
