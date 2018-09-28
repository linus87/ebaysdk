
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
 * 				The base request type for the <b>GetPromotionalSaleDetails</b> call. This call retrieves information about promotional sales set up by an eBay store owner. The eBay store owner has the option to retrieve all promotional sales, a specific promotional sale, or promotional sales in a specific state.
 * 			
 * 
 * <p>Java class for GetPromotionalSaleDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPromotionalSaleDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PromotionalSaleID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleStatus" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleStatusCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPromotionalSaleDetailsRequestType", propOrder = {
    "promotionalSaleID",
    "promotionalSaleStatus"
})
public class GetPromotionalSaleDetailsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PromotionalSaleID")
    protected Long promotionalSaleID;
    @XmlElement(name = "PromotionalSaleStatus")
    protected List<PromotionalSaleStatusCodeType> promotionalSaleStatus;

    /**
     * Gets the value of the promotionalSaleID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromotionalSaleID() {
        return promotionalSaleID;
    }

    /**
     * Sets the value of the promotionalSaleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromotionalSaleID(Long value) {
        this.promotionalSaleID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public PromotionalSaleStatusCodeType[] getPromotionalSaleStatus() {
        if (this.promotionalSaleStatus == null) {
            return new PromotionalSaleStatusCodeType[ 0 ] ;
        }
        return ((PromotionalSaleStatusCodeType[]) this.promotionalSaleStatus.toArray(new PromotionalSaleStatusCodeType[this.promotionalSaleStatus.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public PromotionalSaleStatusCodeType getPromotionalSaleStatus(int idx) {
        if (this.promotionalSaleStatus == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.promotionalSaleStatus.get(idx);
    }

    public int getPromotionalSaleStatusLength() {
        if (this.promotionalSaleStatus == null) {
            return  0;
        }
        return this.promotionalSaleStatus.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public void setPromotionalSaleStatus(PromotionalSaleStatusCodeType[] values) {
        this._getPromotionalSaleStatus().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.promotionalSaleStatus.add(values[i]);
        }
    }

    protected List<PromotionalSaleStatusCodeType> _getPromotionalSaleStatus() {
        if (promotionalSaleStatus == null) {
            promotionalSaleStatus = new ArrayList<PromotionalSaleStatusCodeType>();
        }
        return promotionalSaleStatus;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public PromotionalSaleStatusCodeType setPromotionalSaleStatus(int idx, PromotionalSaleStatusCodeType value) {
        return this.promotionalSaleStatus.set(idx, value);
    }

}
