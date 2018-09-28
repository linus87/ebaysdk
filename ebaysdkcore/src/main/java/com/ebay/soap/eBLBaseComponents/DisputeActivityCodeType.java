
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeActivityCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeActivityCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SellerAddInformation"/>
 *     &lt;enumeration value="SellerCompletedTransaction"/>
 *     &lt;enumeration value="CameToAgreementNeedFVFCredit"/>
 *     &lt;enumeration value="SellerEndCommunication"/>
 *     &lt;enumeration value="MutualAgreementOrNoBuyerResponse"/>
 *     &lt;enumeration value="SellerOffersRefund"/>
 *     &lt;enumeration value="SellerShippedItem"/>
 *     &lt;enumeration value="SellerComment"/>
 *     &lt;enumeration value="SellerPaymentNotReceived"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DisputeActivityCodeType")
@XmlEnum
public enum DisputeActivityCodeType {


    /**
     * 
     * 						The seller wants to add a response to the dispute. For <i>Unpaid Item</i> disputes. The seller is limited to 25 responses.
     * 					
     * 
     */
    @XmlEnumValue("SellerAddInformation")
    SELLER_ADD_INFORMATION("SellerAddInformation"),

    /**
     * 
     * 						The buyer has paid or the seller otherwise does not need to
     * 						pursue the dispute any longer. For <i>Unpaid Item</i> disputes.
     * 					
     * 
     */
    @XmlEnumValue("SellerCompletedTransaction")
    SELLER_COMPLETED_TRANSACTION("SellerCompletedTransaction"),

    /**
     * 
     * 						The seller has made an agreement with the buyer and requires a
     * 						credit for a Final Value Fee already paid. For <i>Unpaid Item</i> disputes.
     * 					
     * 
     */
    @XmlEnumValue("CameToAgreementNeedFVFCredit")
    CAME_TO_AGREEMENT_NEED_FVF_CREDIT("CameToAgreementNeedFVFCredit"),

    /**
     * 
     * 						The seller wants to end communication or stop waiting for the
     * 						buyer. For <i>Unpaid Item</i> disputes.
     * 					
     * 
     */
    @XmlEnumValue("SellerEndCommunication")
    SELLER_END_COMMUNICATION("SellerEndCommunication"),

    /**
     * 
     * 						The seller wants to end communication or stop waiting for the
     * 						buyer. Mutual agreement has been reached or the buyer has not
     * 						responded within four days. For <i>Unpaid Item</i> disputes.
     * 					
     * 
     */
    @XmlEnumValue("MutualAgreementOrNoBuyerResponse")
    MUTUAL_AGREEMENT_OR_NO_BUYER_RESPONSE("MutualAgreementOrNoBuyerResponse"),

    /**
     * 
     * 						The seller offers a full refund if the buyer did not receive
     * 						the item or a partial refund if the item is significantly not as
     * 						described. For <i>Item Not Received</i> and <i>Significantly Not As Described</i>
     * 						disputes.
     * 						<br/><br/>
     * 						This can be used when <b>DisputeState</b> is:
     * 						<br>
     * 						<code>NotReceivedNoSellerResponse</code><br>
     * 						<code>NotAsDescribedNoSellerResponse</code><br>
     * 						<code>NotReceivedMutualCommunication</code><br>
     * 						<code>NotAsDescribedMutualCommunication</code>
     * 					
     * 
     */
    @XmlEnumValue("SellerOffersRefund")
    SELLER_OFFERS_REFUND("SellerOffersRefund"),

    /**
     * 
     * 						The seller has shipped the item or a replacement and provides
     * 						shipping information. For <i>Item Not Received</i> and <i>Significantly Not As Described</i> disputes.
     * 						<br/><br/>
     * 						This can be used when <b>DisputeState</b> is:
     * 						<br>
     * 						<code>NotReceivedNoSellerResponse</code><br>
     * 						<code>NotReceivedMutualCommunication</code>
     * 					
     * 
     */
    @XmlEnumValue("SellerShippedItem")
    SELLER_SHIPPED_ITEM("SellerShippedItem"),

    /**
     * 
     * 						The seller communicates with the buyer, offering a response or
     * 						comment. The seller is limited to 25 responses.
     * 						For <i>Item Not Received</i> and <i>Significantly Not As Described</i>
     * 						disputes.
     * 						<br/><br/>
     * 						This can be used when DisputeState is:<br>
     * 						<code>NotReceivedNoSellerResponse</code><br>
     * 						<code>NotAsDescribedNoSellerResponse</code><br>
     * 						<code>NotReceivedMutualCommunication</code><br>
     * 						<code>NotAsDescribedMutualCommunication</code>
     * 					
     * 
     */
    @XmlEnumValue("SellerComment")
    SELLER_COMMENT("SellerComment"),

    /**
     * 
     * 						The buyer has not received an expected full or partial refund from the
     * 						seller in an <i>Item Not Received</i> and <i>Significantly Not As Described</i> buyer
     * 						dispute.
     * 						<br/><br/>
     * 						This can be used when <b>DisputeState</b> is:<br>
     * 						<code>NotReceivedNoSellerResponse</code> <br>
     * 						<code>NotReceivedMutualCommunication</code> <br>
     * 					
     * 
     */
    @XmlEnumValue("SellerPaymentNotReceived")
    SELLER_PAYMENT_NOT_RECEIVED("SellerPaymentNotReceived"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeActivityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeActivityCodeType fromValue(String v) {
        for (DisputeActivityCodeType c: DisputeActivityCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
