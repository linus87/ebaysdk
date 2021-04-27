
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeResolutionReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeResolutionReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unresolved"/>
 *     &lt;enumeration value="ProofOfPayment"/>
 *     &lt;enumeration value="ComputerTechnicalProblem"/>
 *     &lt;enumeration value="NoContact"/>
 *     &lt;enumeration value="FamilyEmergency"/>
 *     &lt;enumeration value="ProofGivenInFeedback"/>
 *     &lt;enumeration value="FirstInfraction"/>
 *     &lt;enumeration value="CameToAgreement"/>
 *     &lt;enumeration value="ItemReturned"/>
 *     &lt;enumeration value="BuyerPaidAuctionFees"/>
 *     &lt;enumeration value="SellerReceivedPayment"/>
 *     &lt;enumeration value="OtherResolution"/>
 *     &lt;enumeration value="ClaimPaid"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeResolutionReasonCodeType")
@XmlEnum
public enum DisputeResolutionReasonCodeType {


    /**
     * 
     * 						This enumeration value indicates that the dispute has not been resolved.
     * 					
     * 
     */
    @XmlEnumValue("Unresolved")
    UNRESOLVED("Unresolved"),

    /**
     * 
     * 						This enumeration value indicates that the buyer was able to provide proof of payment for an Unpaid Item case.
     * 					
     * 
     */
    @XmlEnumValue("ProofOfPayment")
    PROOF_OF_PAYMENT("ProofOfPayment"),

    /**
     * 
     * 						This enumeration value indicates that the buyer or seller had a technical problem with a computer.
     * 					
     * 
     */
    @XmlEnumValue("ComputerTechnicalProblem")
    COMPUTER_TECHNICAL_PROBLEM("ComputerTechnicalProblem"),

    /**
     * 
     * 						This enumeration value indicates that the buyer and seller have not made any contact with one another.
     * 					
     * 
     */
    @XmlEnumValue("NoContact")
    NO_CONTACT("NoContact"),

    /**
     * 
     * 						This enumeration value indicates that the buyer or seller had a family emergency.
     * 					
     * 
     */
    @XmlEnumValue("FamilyEmergency")
    FAMILY_EMERGENCY("FamilyEmergency"),

    /**
     * 
     * 						This enumeration value indicates that the buyer was able to provide proof of payment for an Unpaid Item case through the Feedback system.
     * 					
     * 
     */
    @XmlEnumValue("ProofGivenInFeedback")
    PROOF_GIVEN_IN_FEEDBACK("ProofGivenInFeedback"),

    /**
     * 
     * 						This enumeration value indicates that the dispute was the buyer's first infraction, and thus resolved.
     * 					
     * 
     */
    @XmlEnumValue("FirstInfraction")
    FIRST_INFRACTION("FirstInfraction"),

    /**
     * 
     * 						This enumeration value indicates that the buyer and seller came to an agreement.
     * 					
     * 
     */
    @XmlEnumValue("CameToAgreement")
    CAME_TO_AGREEMENT("CameToAgreement"),

    /**
     * 
     * 						This enumeration value indicates that the buyer successfully returned the item, and thus an Unpaid Item case was closed.
     * 					
     * 
     */
    @XmlEnumValue("ItemReturned")
    ITEM_RETURNED("ItemReturned"),

    /**
     * 
     *  						This enumeration value indicates that the buyer reimbursed the seller's listing fees.
     * 					
     * 
     */
    @XmlEnumValue("BuyerPaidAuctionFees")
    BUYER_PAID_AUCTION_FEES("BuyerPaidAuctionFees"),

    /**
     * 
     * 						This enumeration value indicates that the seller received payment for the item, and thus an Unpaid Item case was closed.
     * 					
     * 
     */
    @XmlEnumValue("SellerReceivedPayment")
    SELLER_RECEIVED_PAYMENT("SellerReceivedPayment"),

    /**
     * 
     * 						This enumeration value indicates that an undefined resolution occurred.
     * 					
     * 
     */
    @XmlEnumValue("OtherResolution")
    OTHER_RESOLUTION("OtherResolution"),

    /**
     * 
     * 						This enumeration value indicates that the claim was paid.
     * 					
     * 
     */
    @XmlEnumValue("ClaimPaid")
    CLAIM_PAID("ClaimPaid"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeResolutionReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeResolutionReasonCodeType fromValue(String v) {
        for (DisputeResolutionReasonCodeType c: DisputeResolutionReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
