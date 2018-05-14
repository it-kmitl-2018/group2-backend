package th.ac.kmitl.soa.group2.definitions;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.vavr.collection.Map;
import lombok.RequiredArgsConstructor;

import static java.lang.String.format;
import static th.ac.kmitl.soa.group2.utils.EnumMapper.getMapper;

@RequiredArgsConstructor
public enum PaymentType {

    UNCONFIRMED_BYTIME_UNSPECIFIED("CREDOC", "ยังไม่ได้รับการยืนยันระยะเวลาการชำระเงินที่ยังไม่ถูกระบุ", "Unconfirmed, period of time for payment unspecified"),
    UNCONFIRMED_BYTIME_STATED("CREDOC/nM", "ยังไม่ได้รับการยืนยันระยะเวลาการชำระเงินที่ระบุไว้", "Unconfirmed, period of time for payment stated"),
    CONFIRMED_BYTIME_UNSPECIFIED("CONCREDOC", "ได้รับการยืนยันระยะเวลาการชำระเงินที่ยังไม่ถูกระบุ", "Confirmed, period of time for payment unspecified"),
    CONFIRMED_BYTIME_STATED("CONCREDOC/nM", "ได้รับการยืนยันระยะเวลาการชำระเงินที่ระบุไว้", "Confirmed, period of time for payment stated"),
    BYTIME_UNSPECIFIED("RECREDOC", "ระยะเวลาการชำระเงินยังไม่ถูกระบุ", "Period of time for payment unspecified"),
    BYTIME_STATED("RECREDOC/nM", "ระยะเวลาการชำระเงินถูกระบุ", "Period of time for payment stated"),
    CLEAN_COLLECTION("COLLECT", "ลูกหนี้จ่ายเงินกับเอกสารทางการเงิน", "Pay against financial documents ,Clean collection"),
    COLLECTION_BYTIME_UNSPECIFIED("DOCOLLECT", "ลูกหนี้จ่ายเงินกับเอกสารทางการเงินที่ระยะเวลาการชำระเงินยังไม่ถูกระบุ", "Pay against financial documents, Period of time for payment unspecified"),
    COLLECTION_BYTIME_STATED("DOCOLLECT/nM", "ลูกหนี้จ่ายเงินกับเอกสารทางการเงินที่ระยะเวลาการชำระเงินถูกระบุไว้", "Pay against financial documents, Period of time for payment stated"),
    WITH_IMMIDIATE_PAYMENT("INNO", "ชำระเงินทันทีก่อนการอนุมัติ", "With immediate payment and later acceptance"),
    WITH_PRIOR_ACCEPTANCE("INPA", "ด้วยการอนุมัติครั้งก่อน", "With prior acceptance"),
    PAY_BY_INSTALMENT("PARTS", "ผ่อนชำระ", "Payment by instalments"),
    PAY_BY_FIXED_DATE("AAAA/MM/JJ", "ชำระในวันที่กำหนด", "Payment on fixed date"),
    PAY_BY_ADVANCE("ANTICIP", "ชำระเงินล่วงหน้า", "Payment in advance"),
    PAY_BY_DELIVERY("CASH", "ชำระเงินเมื่อส่งมอบ", "Payment on delivery"),
    PAY_TO_CARRIER("REMBURS", "ชำระเงินกับผู้ให้บริการเมื่อส่งมอบ", "Payment to the carrier on delivery"),
    PAY_BY_ENDOFMONTH("ULTIMO", "ชำระเงินปลายเดือนของการส่งมอบ", "Payment by end of month of delivery"),
    PAY_BY_ENDTIME_OF_ENDOFMONTH("ULTIMO/nM", "ชำระเงินเมื่อสิ้นสุดระยเวลาจ่ายของปลายเดือนการส่งมอบ", "Payment at the end of a period following the end of the month of delivery"),
    PAY_BY_ENDTIME_OF_DELIVERY("DEL/nM", "ชำรเะเงินเมื่อสิ้นสุดระยะการส่งมอบ", "Payment at the end of a period following delivery"),
    PAY_ON_RECEIPT("CASHINV", "ชำระเงินเมื่อได้รับใบแจ้งหนี้","Payment on receipt of the invoice"),
    PAY_ON_RECEIPT_ENDOFMONTH("INVULTIMO", "ชำระเงินวันสุดท้ายของเดือนของใบแจ้งหนี้", "Payment on the last day of the month of receipt of the invoice"),
    PAY_ON_RECEIPT_ENDTIME_OF_ENDOFMONTH("INVULTIMO/nM", "ชำระเงินเมื่อสิ้นสุดระยะเวลาจ่ายของปลายเดือนของใบแจ้งหนี้", "Payment at the end of a period following the last day of the month of reciept of the invoice"),
    PAY_ON_ENDTIME_OF_RECEIPT("INV/nM", "ชำระเงินเมื่อสิ้นสุดระยะใบแข้งหนี้", "Payment at the end of a period following receipt of the invoice"),
    DISCOUNT("DIS n% nM", "ลดการชำระเงินตามอัตราร้อยละ", "Discounts"),
    INTEREST_FOR_DELAYED("INT nM n%", "ดอกเบี้ยสำหรับการชำระล่าช้า", "Interest for delayed payment"),
    COMPENSATORY("COMPENS", "การจ่ายเงินชดเชย", "Compensatory payment"),
    PAY_ON_CONSIGNMENT("CONSIGN", "ชำระเงินเมื่อสินค้าฝากขาย", "Payment on consignment"),
    PAY_ON_AGREEMENT("AGREE", "ชำระเงินตามสัญญาตกลง", "Payment by agreement"),
    PAY_ON_CUSTOM_TERM("HABIT", "ชำระเงินตามข้อตกลง", "Payment on customary terms"),
    NOPAY("NOPAY", "ไม่ต้องชำระเงิน", "Without Payment");

    public final String chargeCode;
    public final String thaiName;
    public final String englishName;

    public String getname() {
        return format("%s (%s)", thaiName, englishName);
    }

    public static final Map<String, PaymentType> mapper =
            getMapper(PaymentType.class, $ -> $.chargeCode);

    @JsonCreator
    public static PaymentType decode(String chargeCode) {
        return mapper.get(chargeCode).get();
    }
}
