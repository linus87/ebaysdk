
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					Enables a seller to create an Unpaid Item case against a buyer, or to cancel a
 * 					single line item order.
 * 					<br>
 * 					<br>
 * 					Although the seller is eligible to open up an Unpaid Item case two days after the buyer purchases the item or wins the item through an auction, it is recommended that the seller contacts the buyer first to try and make it right before opening a case. The <a href="http://pages.ebay.com/help/sell/unpaid-items.html" target="_blank">Unpaid Items</a> help page talks more about how a seller should to handle an unpaid item.
 * 					<br>
 * 					<br>
 * 					To cancel a multiple line item order programmatically, the seller would have to use the <a href="https://developer.ebay.com/Devzone/post-order/post-order_v2_cancellation__post.html" target="_blank">POST /post-order/v2/cancellation</a> call of the <b>Post-Order API</b>.
 * 				
 * 
 * <p>Java class for AddDisputeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDisputeRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="DisputeExplanation" type="{urn:ebay:apis:eBLBaseComponents}DisputeExplanationCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeReason" type="{urn:ebay:apis:eBLBaseComponents}DisputeReasonCodeType" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDisputeRequestType", propOrder = {
    "disputeExplanation",
    "disputeReason",
    "itemID",
    "transactionID",
    "orderLineItemID"
})
public class AddDisputeRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DisputeExplanation")
    protected DisputeExplanationCodeType disputeExplanation;
    @XmlElement(name = "DisputeReason")
    protected DisputeReasonCodeType disputeReason;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "OrderLineItemID")
    protected String orderLineItemID;

    /**
     * Gets the value of the disputeExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeExplanationCodeType }
     *     
     */
    public DisputeExplanationCodeType getDisputeExplanation() {
        return disputeExplanation;
    }

    /**
     * Sets the value of the disputeExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeExplanationCodeType }
     *     
     */
    public void setDisputeExplanation(DisputeExplanationCodeType value) {
        this.disputeExplanation = value;
    }

    /**
     * Gets the value of the disputeReason property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeReasonCodeType }
     *     
     */
    public DisputeReasonCodeType getDisputeReason() {
        return disputeReason;
    }

    /**
     * Sets the value of the disputeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeReasonCodeType }
     *     
     */
    public void setDisputeReason(DisputeReasonCodeType value) {
        this.disputeReason = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the orderLineItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineItemID() {
        return orderLineItemID;
    }

    /**
     * Sets the value of the orderLineItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineItemID(String value) {
        this.orderLineItemID = value;
    }

}
