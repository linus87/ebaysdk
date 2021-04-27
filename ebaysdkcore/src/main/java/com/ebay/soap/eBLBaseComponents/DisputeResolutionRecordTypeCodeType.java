
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeResolutionRecordTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeResolutionRecordTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="StrikeBuyer"/>
 *     &lt;enumeration value="SuspendBuyer"/>
 *     &lt;enumeration value="RestrictBuyer"/>
 *     &lt;enumeration value="FVFCredit"/>
 *     &lt;enumeration value="InsertionFeeCredit"/>
 *     &lt;enumeration value="AppealBuyerStrike"/>
 *     &lt;enumeration value="UnsuspendBuyer"/>
 *     &lt;enumeration value="UnrestrictBuyer"/>
 *     &lt;enumeration value="ReverseFVFCredit"/>
 *     &lt;enumeration value="ReverseInsertionFeeCredit"/>
 *     &lt;enumeration value="GenerateCSTicketForSuspend"/>
 *     &lt;enumeration value="FVFCreditNotGranted"/>
 *     &lt;enumeration value="ItemNotReceivedClaimFiled"/>
 *     &lt;enumeration value="UnpaidItemRelisted"/>
 *     &lt;enumeration value="UnpaidItemRevised"/>
 *     &lt;enumeration value="FVFOnShippingCredit"/>
 *     &lt;enumeration value="FVFOnShippingCreditNotGranted"/>
 *     &lt;enumeration value="ReverseFVFOnShippingCredit"/>
 *     &lt;enumeration value="FeatureFeeCredit"/>
 *     &lt;enumeration value="FeatureFeeNotCredit"/>
 *     &lt;enumeration value="ReverseFeatureFeeCredit"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeResolutionRecordTypeCodeType")
@XmlEnum
public enum DisputeResolutionRecordTypeCodeType {


    /**
     * 
     * 						This enumeration value indicates that the buyer received an Unpaid Item Strike.
     * 					
     * 
     */
    @XmlEnumValue("StrikeBuyer")
    STRIKE_BUYER("StrikeBuyer"),

    /**
     * 
     * 						This enumeration value indicates that the buyer's account has been suspended, and buyer will be unable to use the eBay site.
     * 					
     * 
     */
    @XmlEnumValue("SuspendBuyer")
    SUSPEND_BUYER("SuspendBuyer"),

    /**
     * 
     * 						This enumeration value indicates that the buyer's activity is restricted and will be unable to bid on or purchase items.
     * 					
     * 
     */
    @XmlEnumValue("RestrictBuyer")
    RESTRICT_BUYER("RestrictBuyer"),

    /**
     * 
     * 						This enumeration value indicates that the seller received a Final Value Fee credit.
     * 					
     * 
     */
    @XmlEnumValue("FVFCredit")
    FVF_CREDIT("FVFCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller's listing fees were credited.
     * 					
     * 
     */
    @XmlEnumValue("InsertionFeeCredit")
    INSERTION_FEE_CREDIT("InsertionFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the buyer has appealed the Unpaid Item Strike against their account.
     * 					
     * 
     */
    @XmlEnumValue("AppealBuyerStrike")
    APPEAL_BUYER_STRIKE("AppealBuyerStrike"),

    /**
     * 
     * 						This enumeration value indicates that the buyer's account has been reinstated.
     * 					
     * 
     */
    @XmlEnumValue("UnsuspendBuyer")
    UNSUSPEND_BUYER("UnsuspendBuyer"),

    /**
     * 
     * 						This enumeration value indicates that all restrictions on the buyer's account have ended.
     * 					
     * 
     */
    @XmlEnumValue("UnrestrictBuyer")
    UNRESTRICT_BUYER("UnrestrictBuyer"),

    /**
     * 
     * 						This enumeration value indicates that the seller's Final Value Fee credit was reversed.
     * 					
     * 
     */
    @XmlEnumValue("ReverseFVFCredit")
    REVERSE_FVF_CREDIT("ReverseFVFCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller's listing fees credit was reversed.
     * 					
     * 
     */
    @XmlEnumValue("ReverseInsertionFeeCredit")
    REVERSE_INSERTION_FEE_CREDIT("ReverseInsertionFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that a customer service ticket to suspend The buyer's account has been created.
     * 					
     * 
     */
    @XmlEnumValue("GenerateCSTicketForSuspend")
    GENERATE_CS_TICKET_FOR_SUSPEND("GenerateCSTicketForSuspend"),

    /**
     * 
     * 						This enumeration value indicates that the seller requested, but did not receive a Final Value Fee credit.
     * 					
     * 
     */
    @XmlEnumValue("FVFCreditNotGranted")
    FVF_CREDIT_NOT_GRANTED("FVFCreditNotGranted"),

    /**
     * 
     * 						This enumeration value indicates that the buyer did not receive the item, and filed a claim against the seller.
     * 					
     * 
     */
    @XmlEnumValue("ItemNotReceivedClaimFiled")
    ITEM_NOT_RECEIVED_CLAIM_FILED("ItemNotReceivedClaimFiled"),

    /**
     * 
     * 						This enumeration value indicates that an Unpaid Item was automatically relisted by the Unpaid Item Assistant mechanism.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemRelisted")
    UNPAID_ITEM_RELISTED("UnpaidItemRelisted"),

    /**
     * 
     * 						This enumeration value indicates that an Unpaid Item was automatically revised by the Unpaid Item Assistant mechanism.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemRevised")
    UNPAID_ITEM_REVISED("UnpaidItemRevised"),

    /**
     * 
     * 					
     * 					Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("FVFOnShippingCredit")
    FVF_ON_SHIPPING_CREDIT("FVFOnShippingCredit"),

    /**
     * 
     * 					
     * 					Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("FVFOnShippingCreditNotGranted")
    FVF_ON_SHIPPING_CREDIT_NOT_GRANTED("FVFOnShippingCreditNotGranted"),

    /**
     * 
     * 					
     * 					Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("ReverseFVFOnShippingCredit")
    REVERSE_FVF_ON_SHIPPING_CREDIT("ReverseFVFOnShippingCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller received a credit for feature fees.
     * 					
     * 
     */
    @XmlEnumValue("FeatureFeeCredit")
    FEATURE_FEE_CREDIT("FeatureFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller did not receive a credit for feature fees.
     * 					
     * 
     */
    @XmlEnumValue("FeatureFeeNotCredit")
    FEATURE_FEE_NOT_CREDIT("FeatureFeeNotCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller's feature fees credit was reversed.
     * 					
     * 
     */
    @XmlEnumValue("ReverseFeatureFeeCredit")
    REVERSE_FEATURE_FEE_CREDIT("ReverseFeatureFeeCredit"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeResolutionRecordTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeResolutionRecordTypeCodeType fromValue(String v) {
        for (DisputeResolutionRecordTypeCodeType c: DisputeResolutionRecordTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
