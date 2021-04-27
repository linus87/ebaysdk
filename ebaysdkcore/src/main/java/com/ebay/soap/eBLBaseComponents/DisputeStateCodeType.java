
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeStateCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeStateCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Locked"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="BuyerFirstResponsePayOption"/>
 *     &lt;enumeration value="BuyerFirstResponseNoPayOption"/>
 *     &lt;enumeration value="BuyerFirstResponsePayOptionLateResponse"/>
 *     &lt;enumeration value="BuyerFirstResponseNoPayOptionLateResponse"/>
 *     &lt;enumeration value="MutualCommunicationPayOption"/>
 *     &lt;enumeration value="MutualCommunicationNoPayOption"/>
 *     &lt;enumeration value="PendingResolve"/>
 *     &lt;enumeration value="MutualWithdrawalAgreement"/>
 *     &lt;enumeration value="MutualWithdrawalAgreementLate"/>
 *     &lt;enumeration value="NotReceivedNoSellerResponse"/>
 *     &lt;enumeration value="NotAsDescribedNoSellerResponse"/>
 *     &lt;enumeration value="NotReceivedMutualCommunication"/>
 *     &lt;enumeration value="NotAsDescribedMutualCommunication"/>
 *     &lt;enumeration value="MutualAgreementOrBuyerReturningItem"/>
 *     &lt;enumeration value="ClaimOpened"/>
 *     &lt;enumeration value="NoDocumentation"/>
 *     &lt;enumeration value="ClaimClosed"/>
 *     &lt;enumeration value="ClaimDenied"/>
 *     &lt;enumeration value="ClaimPending"/>
 *     &lt;enumeration value="ClaimPaymentPending"/>
 *     &lt;enumeration value="ClaimPaid"/>
 *     &lt;enumeration value="ClaimResolved"/>
 *     &lt;enumeration value="ClaimSubmitted"/>
 *     &lt;enumeration value="UnpaidItemOpen"/>
 *     &lt;enumeration value="UPIAssistanceDisabledByeBay"/>
 *     &lt;enumeration value="UPIAssistanceDisabledBySeller"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeStateCodeType")
@XmlEnum
public enum DisputeStateCodeType {


    /**
     * 
     * 						This enumeration value indicates that the dispute is currently in a locked state, and cannot be updated by any user.
     * 					
     * 
     */
    @XmlEnumValue("Locked")
    LOCKED("Locked"),

    /**
     * 
     * 						This enumeration value indicates that the dispute is closed. In some cases, a closed case can be reversed with the <b>SellerReverseDispute</b> call.
     * 					
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * 
     * 						This enumeration value indicates that eBay sent the buyer an Unpaid Item Reminder with a Pay Now option, and is waiting for the buyer's first response.
     * 					
     * 
     */
    @XmlEnumValue("BuyerFirstResponsePayOption")
    BUYER_FIRST_RESPONSE_PAY_OPTION("BuyerFirstResponsePayOption"),

    /**
     * 
     * 						This enumeration value indicates that eBay sent the buyer an Unpaid Item Reminder, but without a Pay Now option, and is waiting for the buyer's first response.
     * 					
     * 
     */
    @XmlEnumValue("BuyerFirstResponseNoPayOption")
    BUYER_FIRST_RESPONSE_NO_PAY_OPTION("BuyerFirstResponseNoPayOption"),

    /**
     * 
     * 						This enumeration value indicates that eBay sent the buyer an Unpaid Item Reminder with a Pay Now option, was waiting for the buyer's first response, but the buyer has failed to respond to this reminder within the 7-day grace period.
     * 					
     * 
     */
    @XmlEnumValue("BuyerFirstResponsePayOptionLateResponse")
    BUYER_FIRST_RESPONSE_PAY_OPTION_LATE_RESPONSE("BuyerFirstResponsePayOptionLateResponse"),

    /**
     * 
     * 						This enumeration value indicates that eBay sent the buyer an Unpaid Item Reminder without a Pay Now option, was waiting for the buyer's first response, but the buyer has failed to respond to this reminder within the 7-day grace period.
     * 					
     * 
     */
    @XmlEnumValue("BuyerFirstResponseNoPayOptionLateResponse")
    BUYER_FIRST_RESPONSE_NO_PAY_OPTION_LATE_RESPONSE("BuyerFirstResponseNoPayOptionLateResponse"),

    /**
     * 
     * 						This enumeration value indicates that the buyer and seller have communicated, and eBay offered the buyer a Pay Now option.
     * 					
     * 
     */
    @XmlEnumValue("MutualCommunicationPayOption")
    MUTUAL_COMMUNICATION_PAY_OPTION("MutualCommunicationPayOption"),

    /**
     * 
     * 				    This enumeration value indicates that the buyer and seller have communicated, but eBay has not offered the buyer a Pay Now option.
     * 					
     * 
     */
    @XmlEnumValue("MutualCommunicationNoPayOption")
    MUTUAL_COMMUNICATION_NO_PAY_OPTION("MutualCommunicationNoPayOption"),

    /**
     * 
     * 						This enumeration value indicates that the dispute is pending resolution. A dispute cannot be closed by the buyer or seller when it is in this state.
     * 					
     * 
     */
    @XmlEnumValue("PendingResolve")
    PENDING_RESOLVE("PendingResolve"),

    /**
     * 
     * 						This enumeration value indicates that the buyer and seller have mutually agreed to cancel the transaction within the grace period.
     * 					
     * 
     */
    @XmlEnumValue("MutualWithdrawalAgreement")
    MUTUAL_WITHDRAWAL_AGREEMENT("MutualWithdrawalAgreement"),

    /**
     * 
     * 						This enumeration value indicates that the buyer and seller have mutually agreed to cancel the transaction, but the grace period has expired.
     * 					
     * 
     */
    @XmlEnumValue("MutualWithdrawalAgreementLate")
    MUTUAL_WITHDRAWAL_AGREEMENT_LATE("MutualWithdrawalAgreementLate"),

    /**
     * 
     * 						This enumeration value indicates that the buyer filed an Item Not Received dispute through PayPal account, and the seller has not yet responded. A seller may respond to a case in this state by using the <b>AddDisputeResponse</b> call and setting the <b>DisputeActivity</b> value to <code>SellerOffersRefund</code>, <code>SellerShippedItem</code>, or <code>SellerComment</code>.
     * 					
     * 
     */
    @XmlEnumValue("NotReceivedNoSellerResponse")
    NOT_RECEIVED_NO_SELLER_RESPONSE("NotReceivedNoSellerResponse"),

    /**
     * 
     * 						This enumeration value indicates that the buyer filed an Item Not As Described dispute through PayPal account, and the seller has not yet responded. A seller may respond to a case in this state by using the <b>AddDisputeResponse</b> call and setting the <b>DisputeActivity</b> value to <code>SellerOffersRefund</code> or <code>SellerComment</code>.
     * 					
     * 
     */
    @XmlEnumValue("NotAsDescribedNoSellerResponse")
    NOT_AS_DESCRIBED_NO_SELLER_RESPONSE("NotAsDescribedNoSellerResponse"),

    /**
     * 
     * 						This enumeration value indicates that the buyer filed an Item Not Received dispute through PayPal account, and the buyer and seller have communicated about the issue. A seller may respond to a case in this state by using the <b>AddDisputeResponse</b> call and setting the <b>DisputeActivity</b> value to <code>SellerOffersRefund</code>, <code>SellerShippedItem</code>, or <code>SellerComment</code>.
     * 					
     * 
     */
    @XmlEnumValue("NotReceivedMutualCommunication")
    NOT_RECEIVED_MUTUAL_COMMUNICATION("NotReceivedMutualCommunication"),

    /**
     * 
     * 						This enumeration value indicates that the buyer filed an Item Not As Described dispute through PayPal account, and the buyer and seller have communicated about the issue. A seller may respond to a case in this state by using the <b>AddDisputeResponse</b> call and setting the <b>DisputeActivity</b> value to <code>SellerOffersRefund</code>.
     * 					
     * 
     */
    @XmlEnumValue("NotAsDescribedMutualCommunication")
    NOT_AS_DESCRIBED_MUTUAL_COMMUNICATION("NotAsDescribedMutualCommunication"),

    /**
     * 
     * 						This enumeration value indicates that the seller filed an Unpaid Item dispute, and the seller says mutual agreement has been reached and is
     * 						waiting for the buyer to confirm, or the buyer is returning the item
     * 						to the seller.
     * 					
     * 
     */
    @XmlEnumValue("MutualAgreementOrBuyerReturningItem")
    MUTUAL_AGREEMENT_OR_BUYER_RETURNING_ITEM("MutualAgreementOrBuyerReturningItem"),

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
     * 						This enumeration value indicates that the buyer was contacted by eBay and asked to submit paperwork to support the claim.
     * 					
     * 
     */
    @XmlEnumValue("NoDocumentation")
    NO_DOCUMENTATION("NoDocumentation"),

    /**
     * 
     * 						This enumeration value indicates that the claim was closed due to buyer not responding to verification, or was missing paperwork.
     * 					
     * 
     */
    @XmlEnumValue("ClaimClosed")
    CLAIM_CLOSED("ClaimClosed"),

    /**
     * 
     * 						This enumeration value indicates that the buyer's claim was denied.
     * 					
     * 
     */
    @XmlEnumValue("ClaimDenied")
    CLAIM_DENIED("ClaimDenied"),

    /**
     * 
     * 						This enumeration value indicates that paperwork was received from the buyer and the claim is being investigated.
     * 					
     * 
     */
    @XmlEnumValue("ClaimPending")
    CLAIM_PENDING("ClaimPending"),

    /**
     * 
     * 						This enumeration value indicates that the buyer's claim was approved for reimbursement and was sent to accounts payable for payment.
     * 					
     * 
     */
    @XmlEnumValue("ClaimPaymentPending")
    CLAIM_PAYMENT_PENDING("ClaimPaymentPending"),

    /**
     * 
     * 						This enumeration value indicates that the buyer was reimbursed for the claim.
     * 					
     * 
     */
    @XmlEnumValue("ClaimPaid")
    CLAIM_PAID("ClaimPaid"),

    /**
     * 
     * 						This enumeration value indicates that the issue has been resolved due to the seller sending the item or refunding the buyer.
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
     * 						This enumeration value indicates that the Unpaid Item dispute is open.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemOpen")
    UNPAID_ITEM_OPEN("UnpaidItemOpen"),

    /**
     * 
     * 						This enumeration value indicates that the Unpaid Item dispute filed by the Unpaid Item Assistance mechanism was disabled by eBay (for example, eBay detected that payment was initiated and the seller needs to manually handle this dispute).
     * 					
     * 
     */
    @XmlEnumValue("UPIAssistanceDisabledByeBay")
    UPI_ASSISTANCE_DISABLED_BYE_BAY("UPIAssistanceDisabledByeBay"),

    /**
     * 
     * 						This enumeration value indicates that the Unpaid Item dispute filed by the Unpaid Item Assistance mechanism was disabled by the seller (e.g. the buyer and seller have communicated about payment and the seller wishes to extend the time for payment and not let the automatic process close the dispute automatically).
     * 					
     * 
     */
    @XmlEnumValue("UPIAssistanceDisabledBySeller")
    UPI_ASSISTANCE_DISABLED_BY_SELLER("UPIAssistanceDisabledBySeller"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeStateCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeStateCodeType fromValue(String v) {
        for (DisputeStateCodeType c: DisputeStateCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
