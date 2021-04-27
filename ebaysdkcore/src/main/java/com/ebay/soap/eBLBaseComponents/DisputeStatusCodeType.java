
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="WaitingForSellerResponse"/>
 *     &lt;enumeration value="WaitingForBuyerResponse"/>
 *     &lt;enumeration value="ClosedFVFCreditStrike"/>
 *     &lt;enumeration value="ClosedNoFVFCreditStrike"/>
 *     &lt;enumeration value="ClosedFVFCreditNoStrike"/>
 *     &lt;enumeration value="ClosedNoFVFCreditNoStrike"/>
 *     &lt;enumeration value="StrikeAppealedAfterClosing"/>
 *     &lt;enumeration value="FVFCreditReversedAfterClosing"/>
 *     &lt;enumeration value="StrikeAppealedAndFVFCreditReversed"/>
 *     &lt;enumeration value="ClaimOpened"/>
 *     &lt;enumeration value="NoDocumentation"/>
 *     &lt;enumeration value="ClaimClosed"/>
 *     &lt;enumeration value="ClaimDenied"/>
 *     &lt;enumeration value="ClaimInProcess"/>
 *     &lt;enumeration value="ClaimApproved"/>
 *     &lt;enumeration value="ClaimPaid"/>
 *     &lt;enumeration value="ClaimResolved"/>
 *     &lt;enumeration value="ClaimSubmitted"/>
 *     &lt;enumeration value="UnpaidItemOpened"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeStatusCodeType")
@XmlEnum
public enum DisputeStatusCodeType {


    /**
     * 
     * 						This enumeration value indicates that the dispute is closed.
     * 					
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * 
     * 						This enumeration value indicates that the dispute is waiting for the seller's response.
     * 					
     * 
     */
    @XmlEnumValue("WaitingForSellerResponse")
    WAITING_FOR_SELLER_RESPONSE("WaitingForSellerResponse"),

    /**
     * 
     * 						This enumeration value indicates that the dispute is waiting for the buyer's response.
     * 					
     * 
     */
    @XmlEnumValue("WaitingForBuyerResponse")
    WAITING_FOR_BUYER_RESPONSE("WaitingForBuyerResponse"),

    /**
     * 
     * 						This enumeration value indicates that the Unpaid Item dispute is closed, the seller received a Final Value Fee credit, and the buyer received a strike.
     * 					
     * 
     */
    @XmlEnumValue("ClosedFVFCreditStrike")
    CLOSED_FVF_CREDIT_STRIKE("ClosedFVFCreditStrike"),

    /**
     * 
     * 						This enumeration value indicates that the Unpaid Item dispute is closed, the seller did not receive a Final Value Fee credit, and the buyer received a strike.
     * 					
     * 
     */
    @XmlEnumValue("ClosedNoFVFCreditStrike")
    CLOSED_NO_FVF_CREDIT_STRIKE("ClosedNoFVFCreditStrike"),

    /**
     * 
     * 						This enumeration value indicates that the Unpaid Item dispute is closed, the seller received a Final Value Fee credit, and the buyer did not receive a strike.
     * 					
     * 
     */
    @XmlEnumValue("ClosedFVFCreditNoStrike")
    CLOSED_FVF_CREDIT_NO_STRIKE("ClosedFVFCreditNoStrike"),

    /**
     * 
     * 						This enumeration value indicates that the Unpaid Item dispute is closed, the seller did not receive a Final Value Fee credit, and the buyer did not receive a strike.
     * 					
     * 
     */
    @XmlEnumValue("ClosedNoFVFCreditNoStrike")
    CLOSED_NO_FVF_CREDIT_NO_STRIKE("ClosedNoFVFCreditNoStrike"),

    /**
     * 
     * 						This enumeration value indicates that the Unpaid Item dispute was closed with a buyer's strike, but the buyer has appealed that strike.
     * 					
     * 
     */
    @XmlEnumValue("StrikeAppealedAfterClosing")
    STRIKE_APPEALED_AFTER_CLOSING("StrikeAppealedAfterClosing"),

    /**
     * 
     * 						This enumeration value indicates that the seller's Final Value Fee credit was reversed after the Unpaid Item dispute was closed.
     * 					
     * 
     */
    @XmlEnumValue("FVFCreditReversedAfterClosing")
    FVF_CREDIT_REVERSED_AFTER_CLOSING("FVFCreditReversedAfterClosing"),

    /**
     * 
     * 						This enumeration value indicates that the seller's Final Value Fee credit was reversed and the buyer's strike was appealed after the Unpaid Item dispute was closed.
     * 					
     * 
     */
    @XmlEnumValue("StrikeAppealedAndFVFCreditReversed")
    STRIKE_APPEALED_AND_FVF_CREDIT_REVERSED("StrikeAppealedAndFVFCreditReversed"),

    /**
     * 
     * 						This enumeration value indicates that the claim was assigned to an adjuster.
     * 					
     * 
     */
    @XmlEnumValue("ClaimOpened")
    CLAIM_OPENED("ClaimOpened"),

    /**
     * 
     * 						This enumeration value indicates that the buyer was contacted by eBay and asked to submit paperwork.
     * 					
     * 
     */
    @XmlEnumValue("NoDocumentation")
    NO_DOCUMENTATION("NoDocumentation"),

    /**
     * 
     * 						This enumeration value indicates that the claim was closed due to the buyer not responding to verification or due to missing paperwork.
     * 					
     * 
     */
    @XmlEnumValue("ClaimClosed")
    CLAIM_CLOSED("ClaimClosed"),

    /**
     * 
     * 						This enumeration value indicates that the claim was denied.
     * 					
     * 
     */
    @XmlEnumValue("ClaimDenied")
    CLAIM_DENIED("ClaimDenied"),

    /**
     * 
     * 						This enumeration value indicates that paperwork was received for the claim, and the claim is being investigated.
     * 					
     * 
     */
    @XmlEnumValue("ClaimInProcess")
    CLAIM_IN_PROCESS("ClaimInProcess"),

    /**
     * 
     * 						This enumeration value indicates that the claim was approved for reimbursement, and sent to accounts payable for payment.
     * 					
     * 
     */
    @XmlEnumValue("ClaimApproved")
    CLAIM_APPROVED("ClaimApproved"),

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
     * 						This enumeration value indicates that the buyer's dispute against the seller was resolved, due to the seller sending the item or refunding the buyer.
     * 					
     * 
     */
    @XmlEnumValue("ClaimResolved")
    CLAIM_RESOLVED("ClaimResolved"),

    /**
     * 
     * 						This enumeration value indicates that the claim was submitted via Web.
     * 					
     * 
     */
    @XmlEnumValue("ClaimSubmitted")
    CLAIM_SUBMITTED("ClaimSubmitted"),

    /**
     * 
     * 						This enumeration value indicates that an Unpaid Item dispute was opened by the seller against the buyer.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemOpened")
    UNPAID_ITEM_OPENED("UnpaidItemOpened"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeStatusCodeType fromValue(String v) {
        for (DisputeStatusCodeType c: DisputeStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
