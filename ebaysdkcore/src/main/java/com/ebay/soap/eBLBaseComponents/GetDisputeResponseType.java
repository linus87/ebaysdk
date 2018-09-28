
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				 This is the base response type for the <b>GetDispute</b> call. This call retrieves the details of a seller-initiated dispute. Seller-initiated disputes include mutually-cancelled transactions and unpaid items.
 * 				<br/><br/>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 					This call does not support buyer-initiated cases created through eBay's Resolution Center. Buyer-initiated cases include Item Not Received (INR) and escalated Return cases. To retrieve and manage eBay Money Back Guarantee cases, the Case Management calls of the <a href="http://developer.ebay.com/Devzone/post-order/index.html" target="_blank">Post-Order API</a> can be used instead.
 * 				</span>
 * 			
 * 
 * <p>Java class for GetDisputeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDisputeResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Dispute" type="{urn:ebay:apis:eBLBaseComponents}DisputeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDisputeResponseType", propOrder = {
    "dispute"
})
public class GetDisputeResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Dispute")
    protected DisputeType dispute;

    /**
     * Gets the value of the dispute property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeType }
     *     
     */
    public DisputeType getDispute() {
        return dispute;
    }

    /**
     * Sets the value of the dispute property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeType }
     *     
     */
    public void setDispute(DisputeType value) {
        this.dispute = value;
    }

}
