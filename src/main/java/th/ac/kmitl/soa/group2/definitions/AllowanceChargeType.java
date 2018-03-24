package th.ac.kmitl.soa.group2.definitions;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.vavr.collection.Map;
import lombok.RequiredArgsConstructor;

import static java.lang.String.format;
import static th.ac.kmitl.soa.group2.utils.EnumMapper.getMapper;

@RequiredArgsConstructor
public enum AllowanceChargeType {

    STAMP_DUTY("28", "ค่าอากรแสตมป์", "Stamp duty"),
    BANK_CHARGES("30", "ค่าธรรมเนียมที่เกิดจากการทาธุรกรรมกับธนาคาร", "Bank charges"),
    MINIMUM_COMMISSION("52", "ค่าดาเนินการขั้นต่า", "Minimum commission"),
    TRANSFER_CHARGES("55", "ค่าธรรมเนียมจากการโอนเงิน", "Transfer charges"),
    MISCELLANEOUS_CHARGES("57", "ค่าเบ็ดเตล็ด", "Miscellaneous charges"),
    FOREIGN_EXCHANGE_CHARGES("58", "ค่าธรรมเนียมจากการเปลี่ยนสกุลเงิน", "Foreign exchange charges"),
    SPECIAL_AGREEMENT_CHARGE("65", "ส่วนลดหรือค่าธรรมเนียมที่เกิดจากข้อตกลงพิเศษทางการค้า",
            "An allowance or charge as specified in a special agreement"),
    SAMPLE_DISCOUNT("66", "ส่วนลดจากการขายสินค้าสาหรับทดลองตลาด", "Sample discount"),
    RUSH_DELIVERY_SURCHARGE("77", "ค่าธรรมเนียมจากการขนส่งสินค้าให้เร็วขึ้นกว่าปกติ", "Rush delivery surcharge"),
    LOADING_CHARGE("82", "ค่าธรรมเนียมจากการบรรทุกสินค้า", "Loading charge"),
    WAREHOUSING_CHARGE("85", "ค่าธรรมเนียมในการจัดเก็บสินค้า", "Warehousing charge"),
    REDUCTION_FROM_USUAL_PRICE("95", "ส่วนลดจากราคาปกติ", "A reduction from a usual or list price"),
    CHARGE_FOR_INSURANCE("96", "ค่าประกันสินค้าหรือบริการ", "Charge for insurance");

    public final String chargeCode;
    public final String thaiName;
    public final String englishName;

    public String getname() {
        return format("%s (%s)", thaiName, englishName);
    }

    public static final Map<String, AllowanceChargeType> mapper =
            getMapper(AllowanceChargeType.class, $ -> $.chargeCode);

    @JsonCreator
    public static AllowanceChargeType decode(String chargeCode) {
        return mapper.get(chargeCode).get();
    }

}
