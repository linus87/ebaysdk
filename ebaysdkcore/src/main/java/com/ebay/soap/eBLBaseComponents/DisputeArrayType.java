
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type used by the <b>DisputeArray</b> container that is returned in the response of the <b>GetUserDisputes</b> call. The <b>DisputeArray</b> container holds an array of one or more disputes that match the filter criteria in the call request.
 * 				<br/><br/>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 					'Item Not Received' or 'Significantly Not As Described' cases, initiated by buyers through the eBay Money Back Guarantee program, are not returned with <b>GetUserDisputes</b>. The <a href="https://developer.ebay.com/Devzone/post-order/post-order_v2_casemanagement-caseId__get.html#overview">getCase</a> method of the <a href="https://developer.ebay.com/Devzone/post-order/concepts/UsageGuide.html">Post-Order API</a> is used to retrieve Money Back Guarantee cases programmatically.
 * 				</span>
 * 			
 * 
 * <p>Java class for DisputeArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dispute" type="{urn:ebay:apis:eBLBaseComponents}DisputeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeArrayType", propOrder = {
    "dispute"
})
public class DisputeArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Dispute")
    protected List<DisputeType> dispute;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DisputeType }
     *     
     */
    public DisputeType[] getDispute() {
        if (this.dispute == null) {
            return new DisputeType[ 0 ] ;
        }
        return ((DisputeType[]) this.dispute.toArray(new DisputeType[this.dispute.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DisputeType }
     *     
     */
    public DisputeType getDispute(int idx) {
        if (this.dispute == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.dispute.get(idx);
    }

    public int getDisputeLength() {
        if (this.dispute == null) {
            return  0;
        }
        return this.dispute.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DisputeType }
     *     
     */
    public void setDispute(DisputeType[] values) {
        this._getDispute().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.dispute.add(values[i]);
        }
    }

    protected List<DisputeType> _getDispute() {
        if (dispute == null) {
            dispute = new ArrayList<DisputeType>();
        }
        return dispute;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeType }
     *     
     */
    public DisputeType setDispute(int idx, DisputeType value) {
        return this.dispute.set(idx, value);
    }

}
